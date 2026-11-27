// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.beta.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lb8 {
    public final View i;
    public boolean p;
    public final zm2 q;
    public final mf8 r;
    public final /* synthetic */ PhotoViewer s;
    public final /* synthetic */ PhotoViewer t;
    public long a = 0;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f = 0.0f;
    public final RectF g = new RectF();
    public int h = -1;
    public final int j = hl.L(64.0f);
    public int k = -2;
    public float l = 1.0f;
    public final float[] m = new float[3];
    public final float[] n = new float[3];
    public float o = 1.0f;

    public lb8(PhotoViewer photoViewer, View view) {
        this.t = photoViewer;
        this.s = photoViewer;
        if (PhotoViewer.g9 == null) {
            PhotoViewer.g9 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.h9 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.h9.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.h9.setStrokeWidth(hl.L(3.0f));
            PhotoViewer.h9.setColor(-1);
        }
        this.i = view;
        int i = 0;
        while (true) {
            float[] fArr = this.n;
            if (i >= fArr.length) {
                a();
                mf8 mf8Var = new mf8(28);
                this.r = mf8Var;
                mf8Var.h = 200.0f;
                this.q = new zm2(photoViewer.E.getDrawable(R.drawable.circle_big).mutate(), mf8Var);
                return;
            }
            this.m[i] = 1.0f;
            fArr[i] = 1.0f;
            i++;
        }
    }

    public final void a() {
        boolean z;
        int i = 0;
        while (true) {
            float[] fArr = this.n;
            if (i >= fArr.length) {
                z = true;
                break;
            } else {
                if (fArr[i] != 1.0f) {
                    z = false;
                    break;
                }
                i++;
            }
        }
        if (z != this.p) {
            this.p = z;
            PhotoViewer photoViewer = this.t;
            if (this == photoViewer.X0[0]) {
                photoViewer.C2();
            }
        }
    }

    public final int b() {
        int i = hl.q.y;
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.s;
        int i2 = (int) ((((i + (!photoViewer.s ? hl.m : 0)) - ((int) (this.j * this.o))) / 2) + 0.0f);
        return photoViewer.d2 == 1 ? i2 - hl.L(38.0f) : i2;
    }

    public final void c(Canvas canvas) {
        int i;
        float f = this.j;
        int i2 = (int) (this.o * f);
        int width = (this.s.f0.getWidth() - ((int) (f * this.o))) / 2;
        int b = b();
        float f2 = 1.0f;
        int i3 = 0;
        while (true) {
            float[] fArr = this.m;
            if (i3 >= fArr.length) {
                break;
            }
            f2 = i3 == 2 ? hl.G.getInterpolation(fArr[i3]) * f2 : f2 * fArr[i3];
            i3++;
        }
        int i4 = this.k;
        Drawable drawable = this.q;
        if (i4 >= 0) {
            Drawable[] drawableArr = PhotoViewer.d9;
            if (i4 < drawableArr.length + 2) {
                Drawable drawable2 = i4 < drawableArr.length ? drawableArr[i4] : drawable;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (this.l * 255.0f * f2));
                    drawable2.setBounds(width, b, width + i2, b + i2);
                    drawable2.draw(canvas);
                }
            }
        }
        int i5 = this.h;
        if (i5 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.d9;
            if (i5 < drawableArr2.length + 2) {
                if (i5 < drawableArr2.length) {
                    drawable = drawableArr2[i5];
                }
                if (drawable != null) {
                    if (this.k != -2) {
                        drawable.setAlpha((int) qd4.z(1.0f, this.l, 255.0f, f2));
                    } else {
                        drawable.setAlpha((int) (f2 * 255.0f));
                    }
                    drawable.setBounds(width, b, width + i2, b + i2);
                    drawable.draw(canvas);
                }
            }
        }
        int i6 = this.h;
        if (i6 != 0 && i6 != 1 && (i = this.k) != 0 && i != 1) {
            g(false);
            return;
        }
        int L = hl.L(4.0f);
        if (this.k != -2) {
            PhotoViewer.h9.setAlpha((int) (this.l * 255.0f * f2));
        } else {
            PhotoViewer.h9.setAlpha((int) (f2 * 255.0f));
        }
        RectF rectF = this.g;
        rectF.set(width + L, b + L, (width + i2) - L, (b + i2) - L);
        canvas.drawArc(rectF, this.b - 90.0f, Math.max(4.0f, this.f * 360.0f), false, PhotoViewer.h9);
        g(true);
    }

    public final void d(int i, boolean z, boolean z2) {
        int i2;
        int i3 = this.h;
        if (i3 == i) {
            return;
        }
        View view = this.i;
        mf8 mf8Var = this.r;
        if (mf8Var != null) {
            boolean z3 = z2 && (i3 == 3 || i3 == 4);
            if (i == 3) {
                mf8Var.a(false, z3);
            } else if (i == 4) {
                mf8Var.a(true, z3);
            }
            mf8Var.f = view;
            mf8Var.invalidateSelf();
        }
        this.a = System.currentTimeMillis();
        if (!z || (i2 = this.h) == i) {
            this.k = -2;
        } else {
            this.k = i2;
            this.l = 1.0f;
        }
        this.h = i;
        PhotoViewer photoViewer = this.t;
        if (this == photoViewer.X0[0]) {
            photoViewer.C2();
        }
        view.invalidate();
    }

    public final void e(int i, float f, boolean z) {
        float[] fArr = this.n;
        if (fArr[i] != f) {
            fArr[i] = f;
            if (!z) {
                this.m[i] = f;
            }
            a();
            this.i.invalidate();
        }
    }

    public final void f(boolean z, float f) {
        if (z) {
            this.d = this.f;
        } else {
            this.f = f;
            this.d = f;
        }
        this.c = f;
        this.e = 0L;
        this.i.invalidate();
    }

    public final void g(boolean z) {
        boolean z2;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.a;
        if (j > 18) {
            j = 18;
        }
        this.a = currentTimeMillis;
        int i = 0;
        if (z) {
            if (this.f == 1.0f && this.c == 1.0f) {
                z2 = false;
            } else {
                this.b = ((360 * j) / 3000.0f) + this.b;
                float f = this.c - this.d;
                if (Math.abs(f) > 0.0f) {
                    long j2 = this.e + j;
                    this.e = j2;
                    if (j2 >= 300) {
                        float f2 = this.c;
                        this.f = f2;
                        this.d = f2;
                        this.e = 0L;
                    } else {
                        this.f = (PhotoViewer.g9.getInterpolation(j2 / 300.0f) * f) + this.d;
                    }
                }
                z2 = true;
            }
            float f3 = this.l;
            if (f3 > 0.0f && this.k != -2) {
                float f4 = f3 - (j / 200.0f);
                this.l = f4;
                if (f4 <= 0.0f) {
                    this.l = 0.0f;
                    this.k = -2;
                }
                z2 = true;
            }
        } else {
            z2 = false;
        }
        while (true) {
            float[] fArr = this.n;
            if (i >= fArr.length) {
                break;
            }
            float f5 = fArr[i];
            float[] fArr2 = this.m;
            float f6 = fArr2[i];
            if (f5 > f6) {
                fArr2[i] = qu6.z(j, 200.0f, f6, 1.0f);
            } else if (f5 < f6) {
                fArr2[i] = bp1.x(j, 200.0f, f6, 0.0f);
            } else {
                i++;
            }
            z2 = true;
            i++;
        }
        if (z2) {
            this.i.postInvalidateOnAnimation();
        }
    }
}
