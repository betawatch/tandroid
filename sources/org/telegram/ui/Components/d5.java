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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class d5 extends Drawable implements l5 {
    public boolean D;
    public rh.s8 E;
    public Integer F;
    public int G;
    public PorterDuffColorFilter H;
    public int I;
    public int J;
    public final Rect K;
    public final tf L;
    public boolean a;
    public final int b;
    public final OvershootInterpolator c;
    public final t5 d;
    public final t5 e;
    public final Drawable[] f;
    public View h;
    public org.telegram.ui.i31 n;
    public final boolean r;
    public final int s;
    public int w;
    public boolean x;
    public Integer y;

    public d5(int i10, View view) {
        this(i10, 7, view, false);
    }

    public final void a() {
        if (this.x) {
            return;
        }
        this.x = true;
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if (drawable instanceof f5) {
            ((f5) drawable).b(this);
        }
        Drawable drawable2 = drawableArr[1];
        if (drawable2 instanceof f5) {
            ((f5) drawable2).b(this);
        }
    }

    public final void b() {
        if (this.x) {
            this.x = false;
            Drawable[] drawableArr = this.f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof f5) {
                ((f5) drawable).o(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof f5) {
                ((f5) drawable2).o(this);
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
        float e = this.d.e(false, 1.0f);
        Rect bounds = getBounds();
        Rect rect = this.K;
        rect.set(bounds);
        rect.offset(this.I, this.J);
        float d = this.e.d(this.D);
        tf tfVar = this.L;
        if (d > 0.0f) {
            rh.s8 s8Var = this.E;
            s8Var.c.set(rect);
            s8Var.e();
            this.E.d();
            rh.s8 s8Var2 = this.E;
            Integer num = this.F;
            s8Var2.a(canvas, org.telegram.ui.ActionBar.t6.r1(d, num == null ? -1 : num.intValue()));
            rf.g.d().a(15, tfVar);
        } else {
            rf.g.d().f(tfVar);
        }
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[1];
        int i10 = this.s;
        if (drawable != null && e < 1.0f) {
            drawable.setAlpha((int) ((1.0f - e) * this.w));
            int intrinsicWidth = drawableArr[1].getIntrinsicWidth() < 0 ? i10 : drawableArr[1].getIntrinsicWidth();
            int intrinsicHeight = drawableArr[1].getIntrinsicHeight() < 0 ? i10 : drawableArr[1].getIntrinsicHeight();
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof f5) {
                drawable2.setBounds(rect);
            } else if (this.a) {
                int i11 = intrinsicWidth / 2;
                int i12 = intrinsicHeight / 2;
                drawable2.setBounds(rect.centerX() - i11, rect.centerY() - i12, rect.centerX() + i11, rect.centerY() + i12);
            } else {
                int i13 = intrinsicHeight / 2;
                drawable2.setBounds(rect.left, rect.centerY() - i13, rect.left + intrinsicWidth, rect.centerY() + i13);
            }
            drawableArr[1].setColorFilter(this.H);
            drawableArr[1].draw(canvas);
            drawableArr[1].setColorFilter(null);
        }
        if (drawableArr[0] != null) {
            canvas.save();
            int intrinsicWidth2 = drawableArr[0].getIntrinsicWidth() < 0 ? i10 : drawableArr[0].getIntrinsicWidth();
            if (drawableArr[0].getIntrinsicHeight() >= 0) {
                i10 = drawableArr[0].getIntrinsicHeight();
            }
            Drawable drawable3 = drawableArr[0];
            boolean z10 = drawable3 instanceof f5;
            OvershootInterpolator overshootInterpolator = this.c;
            if (z10) {
                ag.c2 c2Var = ((f5) drawable3).k;
                if (c2Var != null) {
                    c2Var.J0(org.telegram.messenger.i0.L(4.0f));
                }
                if (e < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(e);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.a) {
                if (e < 1.0f) {
                    float interpolation2 = overshootInterpolator.getInterpolation(e);
                    canvas.scale(interpolation2, interpolation2, rect.centerX(), rect.centerY());
                }
                int i14 = intrinsicWidth2 / 2;
                int i15 = i10 / 2;
                drawableArr[0].setBounds(rect.centerX() - i14, rect.centerY() - i15, rect.centerX() + i14, rect.centerY() + i15);
            } else {
                if (e < 1.0f) {
                    float interpolation3 = overshootInterpolator.getInterpolation(e);
                    canvas.scale(interpolation3, interpolation3, (intrinsicWidth2 / 2.0f) + rect.left, rect.centerY());
                }
                int i16 = i10 / 2;
                drawableArr[0].setBounds(rect.left, rect.centerY() - i16, rect.left + intrinsicWidth2, rect.centerY() + i16);
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
        t5 t5Var = this.d;
        return (drawable != null ? 1.0f - t5Var.c : 0.0f) + (drawableArr[0] != null ? t5Var.c : 0.0f);
    }

    public final void f() {
        f5 f5Var;
        ag.c2 c2Var;
        Drawable drawable = this.f[0];
        if (!(drawable instanceof f5) || (c2Var = (f5Var = (f5) drawable).k) == null) {
            return;
        }
        f5Var.v(c2Var);
        c2Var.P0(false);
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f;
        if (drawableArr[0] == drawable) {
            return;
        }
        t5 t5Var = this.d;
        if (z10) {
            t5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.x && (drawable2 instanceof f5)) {
                    ((f5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            t5Var.e(true, 1.0f);
            boolean z11 = this.x;
            if (z11) {
                b();
            }
            drawableArr[0] = drawable;
            if (z11) {
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

    public final void h(TLRPC.Document document, int i10, boolean z10) {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof f5) && document != null && ((f5) drawable).h() == document.id) {
            return;
        }
        t5 t5Var = this.d;
        if (z10) {
            t5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof f5) {
                    ((f5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.y;
                f5 l4 = f5.l(num != null ? num.intValue() : org.telegram.messenger.d20.s0, i10, document);
                drawableArr[0] = l4;
                if (this.x) {
                    l4.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            t5Var.e(true, 1.0f);
            boolean z11 = this.x;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.y;
                drawableArr[0] = f5.l(num2 != null ? num2.intValue() : org.telegram.messenger.d20.s0, i10, document);
            } else {
                drawableArr[0] = null;
            }
            if (z11) {
                a();
            }
        }
        this.F = null;
        this.H = null;
        this.G = 0;
        f();
        invalidate();
    }

    public final void i(TLRPC.Document document, boolean z10) {
        h(document, this.b, z10);
    }

    @Override // org.telegram.ui.Components.l5
    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.i31 i31Var = this.n;
        if (i31Var != null) {
            i31Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j10, boolean z10) {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof f5) && ((f5) drawable).h() == j10) {
            return false;
        }
        int i10 = this.b;
        t5 t5Var = this.d;
        if (z10) {
            t5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.x && (drawable2 instanceof f5)) {
                    ((f5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.y;
            f5 m10 = f5.m(num != null ? num.intValue() : org.telegram.messenger.d20.s0, j10, null, i10);
            drawableArr[0] = m10;
            if (this.x) {
                m10.b(this);
            }
        } else {
            t5Var.e(true, 1.0f);
            boolean z11 = this.x;
            if (z11) {
                b();
            }
            Integer num2 = this.y;
            drawableArr[0] = f5.m(num2 != null ? num2.intValue() : org.telegram.messenger.d20.s0, j10, null, i10);
            if (z11) {
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

    public final void m(boolean z10, boolean z11) {
        if (this.D == z10) {
            return;
        }
        if (z11) {
            if (this.E == null) {
                this.E = new rh.s8(1, 8);
            }
            this.D = z10;
            invalidate();
            return;
        }
        this.D = z10;
        if (z10 && this.E == null) {
            this.E = new rh.s8(1, 8);
        } else if (!z10 && this.E != null) {
            this.E = null;
        }
        this.e.f(z10, true);
        invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.w = i10;
    }

    public d5(int i10, View view, boolean z10) {
        this(i10, 7, view, z10);
    }

    public d5(int i10, int i11, View view, boolean z10) {
        this.a = false;
        this.c = new OvershootInterpolator(2.0f);
        gr grVar = gr.g;
        t5 t5Var = new t5((View) null, 300L, grVar);
        this.d = t5Var;
        t5 t5Var2 = new t5((View) null, 300L, grVar);
        this.e = t5Var2;
        this.f = new Drawable[2];
        this.w = org.telegram.messenger.zs.e4;
        this.K = new Rect();
        this.L = new tf(this, 7);
        t5Var.a = view;
        this.h = view;
        t5Var2.a = view;
        this.s = i10;
        this.b = i11;
        this.r = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
