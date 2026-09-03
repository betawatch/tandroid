package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class mu0 {
    public final View i;
    public boolean p;
    public final org.telegram.ui.Components.mq q;
    public final org.telegram.ui.Components.ng0 r;
    public final /* synthetic */ PhotoViewer s;
    public long a = 0;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f = 0.0f;
    public final RectF g = new RectF();
    public int h = -1;
    public final int j = AndroidUtilities.dp(64.0f);
    public int k = -2;
    public float l = 1.0f;
    public final float[] m = new float[3];
    public final float[] n = new float[3];
    public float o = 1.0f;

    public mu0(PhotoViewer photoViewer, View view) {
        this.s = photoViewer;
        if (PhotoViewer.T8 == null) {
            PhotoViewer.T8 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.U8 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.U8.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.U8.setStrokeWidth(AndroidUtilities.dp(3.0f));
            PhotoViewer.U8.setColor(-1);
        }
        this.i = view;
        int i10 = 0;
        while (true) {
            float[] fArr = this.n;
            if (i10 >= fArr.length) {
                a();
                org.telegram.ui.Components.ng0 ng0Var = new org.telegram.ui.Components.ng0(28);
                this.r = ng0Var;
                ng0Var.h = 200;
                this.q = new org.telegram.ui.Components.mq(photoViewer.y.getDrawable(R.drawable.circle_big).mutate(), ng0Var);
                return;
            }
            this.m[i10] = 1.0f;
            fArr[i10] = 1.0f;
            i10++;
        }
    }

    public final void a() {
        boolean z4;
        int i10 = 0;
        while (true) {
            float[] fArr = this.n;
            if (i10 >= fArr.length) {
                z4 = true;
                break;
            } else {
                if (fArr[i10] != 1.0f) {
                    z4 = false;
                    break;
                }
                i10++;
            }
        }
        if (z4 != this.p) {
            this.p = z4;
            is0 is0Var = (is0) this;
            PhotoViewer photoViewer = is0Var.t;
            if (is0Var == photoViewer.T0[0]) {
                photoViewer.r3();
            }
        }
    }

    public final int b() {
        int i10 = AndroidUtilities.displaySize.y;
        PhotoViewer photoViewer = this.s;
        float f10 = ((i10 + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0)) - ((int) (this.j * this.o))) / 2;
        photoViewer.getClass();
        int i11 = (int) (f10 + 0.0f);
        return photoViewer.Z1 == 1 ? i11 - AndroidUtilities.dp(38.0f) : i11;
    }

    public final void c(Canvas canvas) {
        int i10;
        float f10 = this.j;
        int i11 = (int) (this.o * f10);
        int width = (this.s.b0.getWidth() - ((int) (f10 * this.o))) / 2;
        int b10 = b();
        int i12 = 0;
        float f11 = 1.0f;
        while (true) {
            float[] fArr = this.m;
            if (i12 >= fArr.length) {
                break;
            }
            f11 = i12 == 2 ? AndroidUtilities.accelerateInterpolator.getInterpolation(fArr[i12]) * f11 : f11 * fArr[i12];
            i12++;
        }
        int i13 = this.k;
        Drawable drawable = this.q;
        if (i13 >= 0) {
            Drawable[] drawableArr = PhotoViewer.Q8;
            if (i13 < drawableArr.length + 2) {
                Drawable drawable2 = i13 < drawableArr.length ? drawableArr[i13] : drawable;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (this.l * 255.0f * f11));
                    drawable2.setBounds(width, b10, width + i11, b10 + i11);
                    drawable2.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.Q8;
            if (i14 < drawableArr2.length + 2) {
                if (i14 < drawableArr2.length) {
                    drawable = drawableArr2[i14];
                }
                if (drawable != null) {
                    if (this.k != -2) {
                        drawable.setAlpha((int) org.telegram.messenger.y3.y(1.0f, this.l, 255.0f, f11));
                    } else {
                        drawable.setAlpha((int) (f11 * 255.0f));
                    }
                    drawable.setBounds(width, b10, width + i11, b10 + i11);
                    drawable.draw(canvas);
                }
            }
        }
        int i15 = this.h;
        if (i15 != 0 && i15 != 1 && (i10 = this.k) != 0 && i10 != 1) {
            g(false);
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        if (this.k != -2) {
            PhotoViewer.U8.setAlpha((int) (this.l * 255.0f * f11));
        } else {
            PhotoViewer.U8.setAlpha((int) (f11 * 255.0f));
        }
        RectF rectF = this.g;
        rectF.set(width + dp, b10 + dp, (width + i11) - dp, (b10 + i11) - dp);
        canvas.drawArc(rectF, this.b - 90.0f, Math.max(4.0f, this.f * 360.0f), false, PhotoViewer.U8);
        g(true);
    }

    public final void d(int i10, boolean z4, boolean z10) {
        int i11;
        int i12 = this.h;
        if (i12 == i10) {
            return;
        }
        View view = this.i;
        org.telegram.ui.Components.ng0 ng0Var = this.r;
        if (ng0Var != null) {
            boolean z11 = z10 && (i12 == 3 || i12 == 4);
            if (i10 == 3) {
                ng0Var.a(false, z11);
            } else if (i10 == 4) {
                ng0Var.a(true, z11);
            }
            ng0Var.f = view;
            ng0Var.invalidateSelf();
        }
        this.a = System.currentTimeMillis();
        if (!z4 || (i11 = this.h) == i10) {
            this.k = -2;
        } else {
            this.k = i11;
            this.l = 1.0f;
        }
        this.h = i10;
        is0 is0Var = (is0) this;
        PhotoViewer photoViewer = is0Var.t;
        if (is0Var == photoViewer.T0[0]) {
            photoViewer.r3();
        }
        view.invalidate();
    }

    public final void e(int i10, float f10, boolean z4) {
        float[] fArr = this.n;
        if (fArr[i10] != f10) {
            fArr[i10] = f10;
            if (!z4) {
                this.m[i10] = f10;
            }
            a();
            this.i.invalidate();
        }
    }

    public final void f(float f10, boolean z4) {
        if (z4) {
            this.d = this.f;
        } else {
            this.f = f10;
            this.d = f10;
        }
        this.c = f10;
        this.e = 0L;
        this.i.invalidate();
    }

    public final void g(boolean z4) {
        boolean z10;
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.a;
        if (j10 > 18) {
            j10 = 18;
        }
        this.a = currentTimeMillis;
        int i10 = 0;
        if (z4) {
            if (this.f == 1.0f && this.c == 1.0f) {
                z10 = false;
            } else {
                this.b = ((360 * j10) / 3000.0f) + this.b;
                float f10 = this.c - this.d;
                if (Math.abs(f10) > 0.0f) {
                    long j11 = this.e + j10;
                    this.e = j11;
                    if (j11 >= 300) {
                        float f11 = this.c;
                        this.f = f11;
                        this.d = f11;
                        this.e = 0L;
                    } else {
                        this.f = (PhotoViewer.T8.getInterpolation(j11 / 300.0f) * f10) + this.d;
                    }
                }
                z10 = true;
            }
            float f12 = this.l;
            if (f12 > 0.0f && this.k != -2) {
                float f13 = f12 - (j10 / 200.0f);
                this.l = f13;
                if (f13 <= 0.0f) {
                    this.l = 0.0f;
                    this.k = -2;
                }
                z10 = true;
            }
        } else {
            z10 = false;
        }
        while (true) {
            float[] fArr = this.n;
            if (i10 >= fArr.length) {
                break;
            }
            float f14 = fArr[i10];
            float[] fArr2 = this.m;
            float f15 = fArr2[i10];
            if (f14 > f15) {
                fArr2[i10] = Math.min(1.0f, (j10 / 200.0f) + f15);
            } else if (f14 < f15) {
                fArr2[i10] = Math.max(0.0f, f15 - (j10 / 200.0f));
            } else {
                i10++;
            }
            z10 = true;
            i10++;
        }
        if (z10) {
            this.i.postInvalidateOnAnimation();
        }
    }
}
