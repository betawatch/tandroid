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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class e5 extends Drawable implements m5 {
    public boolean E;
    public ci.lc F;
    public Integer G;
    public int H;
    public PorterDuffColorFilter I;
    public int J;
    public int K;
    public final Rect L;
    public final vf M;
    public boolean a;
    public final int b;
    public final OvershootInterpolator c;
    public final u5 d;
    public final u5 e;
    public final Drawable[] f;
    public View h;
    public org.telegram.ui.g11 n;
    public final boolean r;
    public final int s;
    public int w;
    public boolean x;
    public Integer y;

    public e5(int i3, View view) {
        this(i3, 7, view, false);
    }

    public final void a() {
        if (this.x) {
            return;
        }
        this.x = true;
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if (drawable instanceof g5) {
            ((g5) drawable).b(this);
        }
        Drawable drawable2 = drawableArr[1];
        if (drawable2 instanceof g5) {
            ((g5) drawable2).b(this);
        }
    }

    public final void b() {
        if (this.x) {
            this.x = false;
            Drawable[] drawableArr = this.f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof g5) {
                ((g5) drawable).o(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof g5) {
                ((g5) drawable2).o(this);
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
        Rect rect = this.L;
        rect.set(bounds);
        rect.offset(this.J, this.K);
        float d = this.e.d(this.E);
        vf vfVar = this.M;
        if (d > 0.0f) {
            ci.lc lcVar = this.F;
            lcVar.c.set(rect);
            lcVar.e();
            this.F.d();
            ci.lc lcVar2 = this.F;
            Integer num = this.G;
            lcVar2.a(canvas, org.telegram.ui.ActionBar.k6.r1(d, num == null ? -1 : num.intValue()));
            cg.j.d().a(15, vfVar);
        } else {
            cg.j.d().f(vfVar);
        }
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[1];
        int i3 = this.s;
        if (drawable != null && e10 < 1.0f) {
            drawable.setAlpha((int) ((1.0f - e10) * this.w));
            int intrinsicWidth = drawableArr[1].getIntrinsicWidth() < 0 ? i3 : drawableArr[1].getIntrinsicWidth();
            int intrinsicHeight = drawableArr[1].getIntrinsicHeight() < 0 ? i3 : drawableArr[1].getIntrinsicHeight();
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof g5) {
                drawable2.setBounds(rect);
            } else if (this.a) {
                int i10 = intrinsicWidth / 2;
                int i11 = intrinsicHeight / 2;
                drawable2.setBounds(rect.centerX() - i10, rect.centerY() - i11, rect.centerX() + i10, rect.centerY() + i11);
            } else {
                int i12 = intrinsicHeight / 2;
                drawable2.setBounds(rect.left, rect.centerY() - i12, rect.left + intrinsicWidth, rect.centerY() + i12);
            }
            drawableArr[1].setColorFilter(this.I);
            drawableArr[1].draw(canvas);
            drawableArr[1].setColorFilter(null);
        }
        if (drawableArr[0] != null) {
            canvas.save();
            int intrinsicWidth2 = drawableArr[0].getIntrinsicWidth() < 0 ? i3 : drawableArr[0].getIntrinsicWidth();
            if (drawableArr[0].getIntrinsicHeight() >= 0) {
                i3 = drawableArr[0].getIntrinsicHeight();
            }
            Drawable drawable3 = drawableArr[0];
            boolean z10 = drawable3 instanceof g5;
            OvershootInterpolator overshootInterpolator = this.c;
            if (z10) {
                ei.c3 c3Var = ((g5) drawable3).k;
                if (c3Var != null) {
                    c3Var.J0(org.telegram.messenger.g0.L(4.0f));
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
                int i14 = i3 / 2;
                drawableArr[0].setBounds(rect.centerX() - i13, rect.centerY() - i14, rect.centerX() + i13, rect.centerY() + i14);
            } else {
                if (e10 < 1.0f) {
                    float interpolation3 = overshootInterpolator.getInterpolation(e10);
                    canvas.scale(interpolation3, interpolation3, (intrinsicWidth2 / 2.0f) + rect.left, rect.centerY());
                }
                int i15 = i3 / 2;
                drawableArr[0].setBounds(rect.left, rect.centerY() - i15, rect.left + intrinsicWidth2, rect.centerY() + i15);
            }
            drawableArr[0].setAlpha(this.w);
            drawableArr[0].setColorFilter(this.I);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[1];
        u5 u5Var = this.d;
        return (drawable != null ? 1.0f - u5Var.c : 0.0f) + (drawableArr[0] != null ? u5Var.c : 0.0f);
    }

    public final void f() {
        g5 g5Var;
        ei.c3 c3Var;
        Drawable drawable = this.f[0];
        if (!(drawable instanceof g5) || (c3Var = (g5Var = (g5) drawable).k) == null) {
            return;
        }
        g5Var.v(c3Var);
        c3Var.P0(false);
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f;
        if (drawableArr[0] == drawable) {
            return;
        }
        u5 u5Var = this.d;
        if (z10) {
            u5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.x && (drawable2 instanceof g5)) {
                    ((g5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            u5Var.e(true, 1.0f);
            boolean z11 = this.x;
            if (z11) {
                b();
            }
            drawableArr[0] = drawable;
            if (z11) {
                a();
            }
        }
        this.G = null;
        this.I = null;
        this.H = 0;
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

    public final void h(TLRPC.Document document, int i3, boolean z10) {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof g5) && document != null && ((g5) drawable).h() == document.id) {
            return;
        }
        u5 u5Var = this.d;
        if (z10) {
            u5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof g5) {
                    ((g5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.y;
                g5 l10 = g5.l(num != null ? num.intValue() : org.telegram.messenger.h10.t0, i3, document);
                drawableArr[0] = l10;
                if (this.x) {
                    l10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            u5Var.e(true, 1.0f);
            boolean z11 = this.x;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.y;
                drawableArr[0] = g5.l(num2 != null ? num2.intValue() : org.telegram.messenger.h10.t0, i3, document);
            } else {
                drawableArr[0] = null;
            }
            if (z11) {
                a();
            }
        }
        this.G = null;
        this.I = null;
        this.H = 0;
        f();
        invalidate();
    }

    public final void i(TLRPC.Document document, boolean z10) {
        h(document, this.b, z10);
    }

    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.g11 g11Var = this.n;
        if (g11Var != null) {
            g11Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j10, boolean z10) {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof g5) && ((g5) drawable).h() == j10) {
            return false;
        }
        int i3 = this.b;
        u5 u5Var = this.d;
        if (z10) {
            u5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.x && (drawable2 instanceof g5)) {
                    ((g5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.y;
            g5 m10 = g5.m(num != null ? num.intValue() : org.telegram.messenger.h10.t0, j10, null, i3);
            drawableArr[0] = m10;
            if (this.x) {
                m10.b(this);
            }
        } else {
            u5Var.e(true, 1.0f);
            boolean z11 = this.x;
            if (z11) {
                b();
            }
            Integer num2 = this.y;
            drawableArr[0] = g5.m(num2 != null ? num2.intValue() : org.telegram.messenger.h10.t0, j10, null, i3);
            if (z11) {
                a();
            }
        }
        this.G = null;
        this.I = null;
        this.H = 0;
        f();
        invalidate();
        return true;
    }

    public final void k(Integer num) {
        PorterDuffColorFilter porterDuffColorFilter;
        Integer num2 = this.G;
        if (num2 == null && num == null) {
            return;
        }
        if (num2 == null || !num2.equals(num)) {
            this.G = num;
            if (num == null || this.H != num.intValue()) {
                if (num != null) {
                    int intValue = num.intValue();
                    this.H = intValue;
                    porterDuffColorFilter = new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                } else {
                    porterDuffColorFilter = null;
                }
                this.I = porterDuffColorFilter;
            }
        }
    }

    public final void l(View view) {
        this.d.a = view;
        this.e.a = view;
        this.h = view;
    }

    public final void m(boolean z10, boolean z11) {
        if (this.E == z10) {
            return;
        }
        if (z11) {
            if (this.F == null) {
                this.F = new ci.lc(1, 8);
            }
            this.E = z10;
            invalidate();
            return;
        }
        this.E = z10;
        if (z10 && this.F == null) {
            this.F = new ci.lc(1, 8);
        } else if (!z10 && this.F != null) {
            this.F = null;
        }
        this.e.f(z10, true);
        invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.w = i3;
    }

    public e5(int i3, View view, boolean z10) {
        this(i3, 7, view, z10);
    }

    public e5(int i3, int i10, View view, boolean z10) {
        this.a = false;
        this.c = new OvershootInterpolator(2.0f);
        xq xqVar = xq.g;
        u5 u5Var = new u5((View) null, 300L, xqVar);
        this.d = u5Var;
        u5 u5Var2 = new u5((View) null, 300L, xqVar);
        this.e = u5Var2;
        this.f = new Drawable[2];
        this.w = org.telegram.messenger.hs.e4;
        this.L = new Rect();
        this.M = new vf(this, 6);
        u5Var.a = view;
        this.h = view;
        u5Var2.a = view;
        this.s = i3;
        this.b = i10;
        this.r = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
