// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class d48 extends View implements snb {
    public final vnb a;
    public final Paint b;
    public final byte c;
    public final int d;
    public boolean e;
    public c48[] f;
    public final int[] h;
    public final Paint n;
    public boolean r;
    public int s;
    public pcc w;
    public c48 x;

    /* JADX WARN: Multi-variable type inference failed */
    public d48(int i, int i2, vnb vnbVar, Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.n = new Paint(1);
        this.r = true;
        this.s = 0;
        this.c = i;
        this.d = i2;
        this.a = vnbVar;
    }

    public final void a(int i, boolean z) {
        this.s = i;
        if (this.f == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            c48[] c48VarArr = this.f;
            if (i2 >= c48VarArr.length) {
                return;
            }
            c48 c48Var = c48VarArr[i2];
            boolean z2 = c48Var.o == i;
            c48Var.m = z2;
            if (!z) {
                c48Var.n.f(z2, true);
            }
            c48Var.r.invalidate();
            i2++;
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f != null) {
            int i = 0;
            while (true) {
                c48[] c48VarArr = this.f;
                if (i >= c48VarArr.length) {
                    break;
                }
                c48 c48Var = c48VarArr[i];
                d48 d48Var = c48Var.r;
                Path path = c48Var.e;
                canvas.save();
                float a = c48Var.l.a(0.05f);
                RectF rectF = c48Var.p;
                canvas.scale(a, a, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = c48Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(c48Var.a);
                if (c48Var.f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, c48Var.b);
                }
                canvas.restore();
                if (c48Var.g) {
                    canvas.save();
                    float width = rectF.width() * 0.315f;
                    RectF rectF2 = hl.P;
                    float f = width / 2.0f;
                    rectF2.set(rectF.centerX() - f, rectF.centerY() - f, rectF.centerX() + f, rectF.centerY() + f);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, hl.L(2.33f), hl.L(2.33f), c48Var.c);
                    canvas.restore();
                }
                float d = c48Var.n.d(c48Var.m);
                if (d > 0.0f) {
                    Paint paint = d48Var.b;
                    paint.setStrokeWidth(hl.N(2.0f));
                    paint.setColor(aob.v0(aob.d6, d48Var.a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (hl.R1(0.5f, -2.0f, d) * paint.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint);
                }
                if (c48Var.h) {
                    if (d48Var.e) {
                        if (c48Var.k == null) {
                            Drawable drawable = d48Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            c48Var.k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        c48Var.k.setBounds((int) uh9.x(c48Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) uh9.x(c48Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) c00.B(c48Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) c00.B(c48Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        c48Var.k.draw(canvas);
                    } else {
                        if (c48Var.i == null) {
                            c48Var.i = new Path();
                        }
                        if (c48Var.j == null) {
                            Paint paint2 = new Paint(1);
                            c48Var.j = paint2;
                            paint2.setColor(-1);
                            c48Var.j.setStyle(Paint.Style.STROKE);
                            c48Var.j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        c48Var.j.setStrokeWidth(hl.L(2.0f));
                        c48Var.i.rewind();
                        float U1 = hl.U1(d, hl.L(5.0f), hl.L(4.0f));
                        c48Var.i.moveTo(rectF.centerX() - U1, rectF.centerY() - U1);
                        c48Var.i.lineTo(rectF.centerX() + U1, rectF.centerY() + U1);
                        c48Var.i.moveTo(rectF.centerX() + U1, rectF.centerY() - U1);
                        c48Var.i.lineTo(rectF.centerX() - U1, rectF.centerY() + U1);
                        canvas.drawPath(c48Var.i, c48Var.j);
                    }
                }
                canvas.restore();
                i++;
            }
        }
        if (this.r) {
            int v0 = aob.v0(aob.d7, this.a);
            Paint paint3 = this.n;
            paint3.setColor(v0);
            canvas.drawRect(hl.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - hl.L(21.0f), getMeasuredHeight(), paint3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c48 c48Var;
        c48 c48Var2;
        pcc pccVar;
        pcc pccVar2;
        if (this.f != null) {
            int i = 0;
            while (true) {
                c48[] c48VarArr = this.f;
                if (i >= c48VarArr.length) {
                    break;
                }
                if (c48VarArr[i].q.contains(motionEvent.getX(), motionEvent.getY())) {
                    c48Var = this.f[i];
                    break;
                }
                i++;
            }
            if (motionEvent.getAction() != 0) {
                this.x = c48Var;
                if (c48Var != null) {
                    c48Var.l.c(true);
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            } else if (motionEvent.getAction() == 2) {
                c48 c48Var3 = this.x;
                if (c48Var3 != c48Var) {
                    if (c48Var3 != null) {
                        c48Var3.l.c(false);
                    }
                    if (c48Var != null) {
                        c48Var.l.c(true);
                    }
                    if (this.x != null && c48Var != null && (pccVar2 = this.w) != null) {
                        pccVar2.a(Integer.valueOf(c48Var.o));
                    }
                    this.x = c48Var;
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && (c48Var2 = this.x) != null && (pccVar = this.w) != null) {
                    pccVar.a(Integer.valueOf(c48Var2.o));
                }
                if (this.f != null) {
                    int i2 = 0;
                    while (true) {
                        c48[] c48VarArr2 = this.f;
                        if (i2 >= c48VarArr2.length) {
                            break;
                        }
                        c48VarArr2[i2].l.c(false);
                        i2++;
                    }
                }
                this.x = null;
                return true;
            }
            return true;
        }
        c48Var = null;
        if (motionEvent.getAction() != 0) {
        }
        return true;
    }

    public int getColorId() {
        return this.s;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        uc7 s1 = uc7.s1(this.d);
        byte b = this.c;
        lc7 lc7Var = b == 1 ? s1.E3 : s1.F3;
        int size2 = lc7Var == null ? 0 : lc7Var.c.size();
        int i4 = 8;
        byte b2 = 2;
        if (b == 2) {
            size2 = 8;
        }
        if (b != 2 && b == 1) {
            i4 = 7;
        }
        float f = size;
        float f2 = i4;
        float f3 = i4 + 1;
        float min = Math.min(hl.L(54.0f), f / ((f3 * 0.28947f) + f2));
        float min2 = Math.min(0.28947f * min, hl.L(8.0f));
        float min3 = Math.min(0.31578946f * min, hl.L(11.33f));
        boolean z = true;
        setMeasuredDimension(size, (int) (((r15 + 1) * min3) + ((size2 / i4) * min)));
        c48[] c48VarArr = this.f;
        if (c48VarArr == null || c48VarArr.length != size2) {
            this.f = new c48[size2];
            int i5 = 0;
            while (i5 < size2) {
                this.f[i5] = new c48(this);
                if (b == b2) {
                    c48 c48Var = this.f[i5];
                    int i6 = this.h[i5];
                    c48Var.o = i6;
                    c48Var.h = i6 < 0;
                    if (i6 < 0) {
                        i3 = aob.c8;
                    } else {
                        int[] iArr = aob.r8;
                        i3 = iArr[i6 % iArr.length];
                    }
                    int v0 = aob.v0(i3, this.a);
                    c48Var.g = false;
                    c48Var.f = false;
                    c48Var.a.setColor(v0);
                } else if (lc7Var != null) {
                    ArrayList arrayList = lc7Var.c;
                    if (i5 >= 0 && i5 < arrayList.size()) {
                        this.f[i5].o = ((kc7) arrayList.get(i5)).c;
                        this.f[i5].a((kc7) arrayList.get(i5));
                    }
                }
                i5++;
                b2 = 2;
            }
        }
        float f4 = ((f - ((f3 * min2) + (f2 * min))) / 2.0f) + min2;
        if (this.f != null) {
            int i7 = 0;
            float f5 = f4;
            float f6 = min3;
            while (i7 < this.f.length) {
                RectF rectF = hl.P;
                rectF.set(f5, f6, f5 + min, f6 + min);
                this.f[i7].p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f[i7].q.set(rectF);
                c48 c48Var2 = this.f[i7];
                boolean z2 = c48Var2.o == this.s ? z : false;
                c48Var2.m = z2;
                boolean z3 = z;
                c48Var2.n.f(z2, z3);
                c48Var2.r.invalidate();
                if (i7 % i4 == i4 - 1) {
                    f6 += min + min3;
                    f5 = f4;
                } else {
                    f5 = min + min2 + f5;
                }
                i7++;
                z = z3;
            }
        }
    }

    public void setCloseAsLock(boolean z) {
        this.e = z;
    }

    public void setDivider(boolean z) {
        this.r = z;
        invalidate();
    }

    public void setOnColorClick(pcc pccVar) {
        this.w = pccVar;
    }

    @Override // snb
    public final void updateColors() {
        int i;
        if (this.f == null) {
            return;
        }
        uc7 s1 = uc7.s1(this.d);
        byte b = this.c;
        lc7 lc7Var = b == 1 ? s1.E3 : s1.F3;
        int i2 = 0;
        while (true) {
            c48[] c48VarArr = this.f;
            if (i2 >= c48VarArr.length) {
                invalidate();
                return;
            }
            vnb vnbVar = this.a;
            int[] iArr = this.h;
            if (b == 2) {
                c48 c48Var = c48VarArr[i2];
                int i3 = iArr[i2];
                c48Var.o = i3;
                c48Var.h = i3 < 0;
                if (i3 < 0) {
                    i = aob.c8;
                } else {
                    int[] iArr2 = aob.r8;
                    i = iArr2[i3 % iArr2.length];
                }
                int v0 = aob.v0(i, vnbVar);
                c48Var.g = false;
                c48Var.f = false;
                c48Var.a.setColor(v0);
            } else if (i2 < 7 && b == 1) {
                c48 c48Var2 = c48VarArr[i2];
                int i4 = iArr[i2];
                c48Var2.o = i4;
                int v02 = aob.v0(aob.r8[i4], vnbVar);
                c48Var2.g = false;
                c48Var2.f = false;
                c48Var2.a.setColor(v02);
            } else if (lc7Var != null) {
                ArrayList arrayList = lc7Var.c;
                if (i2 >= 0 && i2 < arrayList.size()) {
                    this.f[i2].o = ((kc7) arrayList.get(i2)).c;
                    this.f[i2].a((kc7) arrayList.get(i2));
                }
            }
            i2++;
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
