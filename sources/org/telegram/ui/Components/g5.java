package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class g5 extends Drawable implements o5 {
    public boolean D;
    public bi.ud E;
    public Integer F;
    public int G;
    public PorterDuffColorFilter H;
    public int I;
    public int J;
    public final Rect K;
    public final xf L;
    public boolean a;
    public final int b;
    public final OvershootInterpolator c;
    public final w5 d;
    public final w5 e;
    public final Drawable[] f;
    public View h;
    public org.telegram.ui.q11 n;
    public final boolean r;
    public final int s;
    public int w;
    public boolean x;
    public Integer y;

    public g5(int i7, View view) {
        this(i7, 7, view, false);
    }

    public final void a() {
        if (this.x) {
            return;
        }
        this.x = true;
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if (drawable instanceof i5) {
            ((i5) drawable).b(this);
        }
        Drawable drawable2 = drawableArr[1];
        if (drawable2 instanceof i5) {
            ((i5) drawable2).b(this);
        }
    }

    public final void b() {
        if (this.x) {
            this.x = false;
            Drawable[] drawableArr = this.f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof i5) {
                ((i5) drawable).o(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof i5) {
                ((i5) drawable2).o(this);
            }
        }
    }

    public final Drawable c() {
        return this.f[0];
    }

    public final boolean d() {
        return this.f[0] == null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float e10 = this.d.e(false, 1.0f);
        Rect bounds = getBounds();
        Rect rect = this.K;
        rect.set(bounds);
        rect.offset(this.I, this.J);
        float d = this.e.d(this.D);
        xf xfVar = this.L;
        if (d > 0.0f) {
            bi.ud udVar = this.E;
            udVar.c.set(rect);
            udVar.e();
            this.E.d();
            bi.ud udVar2 = this.E;
            Integer num = this.F;
            udVar2.a(canvas, org.telegram.ui.ActionBar.k6.r1(d, num == null ? -1 : num.intValue()));
            bg.k.d().a(15, xfVar);
        } else {
            bg.k.d().f(xfVar);
        }
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[1];
        int i7 = this.s;
        if (drawable != null && e10 < 1.0f) {
            drawable.setAlpha((int) ((1.0f - e10) * this.w));
            int intrinsicWidth = drawableArr[1].getIntrinsicWidth() < 0 ? i7 : drawableArr[1].getIntrinsicWidth();
            int intrinsicHeight = drawableArr[1].getIntrinsicHeight() < 0 ? i7 : drawableArr[1].getIntrinsicHeight();
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof i5) {
                drawable2.setBounds(rect);
            } else if (this.a) {
                int i10 = intrinsicWidth / 2;
                int i11 = intrinsicHeight / 2;
                drawable2.setBounds(rect.centerX() - i10, rect.centerY() - i11, rect.centerX() + i10, rect.centerY() + i11);
            } else {
                int i12 = intrinsicHeight / 2;
                drawable2.setBounds(rect.left, rect.centerY() - i12, rect.left + intrinsicWidth, rect.centerY() + i12);
            }
            drawableArr[1].setColorFilter(this.H);
            drawableArr[1].draw(canvas);
            drawableArr[1].setColorFilter(null);
        }
        if (drawableArr[0] != null) {
            canvas.save();
            int intrinsicWidth2 = drawableArr[0].getIntrinsicWidth() < 0 ? i7 : drawableArr[0].getIntrinsicWidth();
            if (drawableArr[0].getIntrinsicHeight() >= 0) {
                i7 = drawableArr[0].getIntrinsicHeight();
            }
            Drawable drawable3 = drawableArr[0];
            boolean z9 = drawable3 instanceof i5;
            OvershootInterpolator overshootInterpolator = this.c;
            if (z9) {
                di.z2 z2Var = ((i5) drawable3).k;
                if (z2Var != null) {
                    z2Var.J0(org.telegram.messenger.g0.L(4.0f));
                }
                if (e10 < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(e10);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.a) {
                if (e10 < 1.0f) {
                    float interpolation2 = overshootInterpolator.getInterpolation(e10);
                    canvas.scale(interpolation2, interpolation2, rect.centerX(), rect.centerY());
                }
                int i13 = intrinsicWidth2 / 2;
                int i14 = i7 / 2;
                drawableArr[0].setBounds(rect.centerX() - i13, rect.centerY() - i14, rect.centerX() + i13, rect.centerY() + i14);
            } else {
                if (e10 < 1.0f) {
                    float interpolation3 = overshootInterpolator.getInterpolation(e10);
                    canvas.scale(interpolation3, interpolation3, (intrinsicWidth2 / 2.0f) + rect.left, rect.centerY());
                }
                int i15 = i7 / 2;
                drawableArr[0].setBounds(rect.left, rect.centerY() - i15, rect.left + intrinsicWidth2, rect.centerY() + i15);
            }
            drawableArr[0].setAlpha(this.w);
            drawableArr[0].setColorFilter(this.H);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[1];
        w5 w5Var = this.d;
        return (drawable != null ? 1.0f - w5Var.c : 0.0f) + (drawableArr[0] != null ? w5Var.c : 0.0f);
    }

    public final void f() {
        i5 i5Var;
        di.z2 z2Var;
        Drawable drawable = this.f[0];
        if (!(drawable instanceof i5) || (z2Var = (i5Var = (i5) drawable).k) == null) {
            return;
        }
        i5Var.v(z2Var);
        z2Var.P0(false);
    }

    public final void g(Drawable drawable, boolean z9) {
        Drawable[] drawableArr = this.f;
        if (drawableArr[0] == drawable) {
            return;
        }
        w5 w5Var = this.d;
        if (z9) {
            w5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.x && (drawable2 instanceof i5)) {
                    ((i5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            w5Var.e(true, 1.0f);
            boolean z10 = this.x;
            if (z10) {
                b();
            }
            drawableArr[0] = drawable;
            if (z10) {
                a();
            }
        }
        this.F = null;
        this.H = null;
        this.G = 0;
        f();
        invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i7, boolean z9) {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof i5) && document != null && ((i5) drawable).h() == document.id) {
            return;
        }
        w5 w5Var = this.d;
        if (z9) {
            w5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof i5) {
                    ((i5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.y;
                i5 l10 = i5.l(num != null ? num.intValue() : org.telegram.messenger.p10.s0, i7, document);
                drawableArr[0] = l10;
                if (this.x) {
                    l10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            w5Var.e(true, 1.0f);
            boolean z10 = this.x;
            if (z10) {
                b();
            }
            if (document != null) {
                Integer num2 = this.y;
                drawableArr[0] = i5.l(num2 != null ? num2.intValue() : org.telegram.messenger.p10.s0, i7, document);
            } else {
                drawableArr[0] = null;
            }
            if (z10) {
                a();
            }
        }
        this.F = null;
        this.H = null;
        this.G = 0;
        f();
        invalidate();
    }

    public final void i(TLRPC.Document document, boolean z9) {
        h(document, this.b, z9);
    }

    @Override // org.telegram.ui.Components.o5
    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.q11 q11Var = this.n;
        if (q11Var != null) {
            q11Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j3, boolean z9) {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof i5) && ((i5) drawable).h() == j3) {
            return false;
        }
        int i7 = this.b;
        w5 w5Var = this.d;
        if (z9) {
            w5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.x && (drawable2 instanceof i5)) {
                    ((i5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.y;
            i5 m10 = i5.m(num != null ? num.intValue() : org.telegram.messenger.p10.s0, j3, null, i7);
            drawableArr[0] = m10;
            if (this.x) {
                m10.b(this);
            }
        } else {
            w5Var.e(true, 1.0f);
            boolean z10 = this.x;
            if (z10) {
                b();
            }
            Integer num2 = this.y;
            drawableArr[0] = i5.m(num2 != null ? num2.intValue() : org.telegram.messenger.p10.s0, j3, null, i7);
            if (z10) {
                a();
            }
        }
        this.F = null;
        this.H = null;
        this.G = 0;
        f();
        invalidate();
        return true;
    }

    public final void k(Integer num) {
        PorterDuffColorFilter porterDuffColorFilter;
        Integer num2 = this.F;
        if (num2 == null && num == null) {
            return;
        }
        if (num2 == null || !num2.equals(num)) {
            this.F = num;
            if (num == null || this.G != num.intValue()) {
                if (num != null) {
                    int intValue = num.intValue();
                    this.G = intValue;
                    porterDuffColorFilter = new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                } else {
                    porterDuffColorFilter = null;
                }
                this.H = porterDuffColorFilter;
            }
        }
    }

    public final void l(View view) {
        this.d.a = view;
        this.e.a = view;
        this.h = view;
    }

    public final void m(boolean z9, boolean z10) {
        if (this.D == z9) {
            return;
        }
        if (z10) {
            if (this.E == null) {
                this.E = new bi.ud(1, 8);
            }
            this.D = z9;
            invalidate();
            return;
        }
        this.D = z9;
        if (z9 && this.E == null) {
            this.E = new bi.ud(1, 8);
        } else if (!z9 && this.E != null) {
            this.E = null;
        }
        this.e.f(z9, true);
        invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.w = i7;
    }

    public g5(int i7, View view, boolean z9) {
        this(i7, 7, view, z9);
    }

    public g5(int i7, int i10, View view, boolean z9) {
        this.a = false;
        this.c = new OvershootInterpolator(2.0f);
        xq xqVar = xq.g;
        w5 w5Var = new w5((View) null, 300L, xqVar);
        this.d = w5Var;
        w5 w5Var2 = new w5((View) null, 300L, xqVar);
        this.e = w5Var2;
        this.f = new Drawable[2];
        this.w = org.telegram.messenger.qs.e4;
        this.K = new Rect();
        this.L = new xf(this, 6);
        w5Var.a = view;
        this.h = view;
        w5Var2.a = view;
        this.s = i7;
        this.b = i10;
        this.r = z9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
