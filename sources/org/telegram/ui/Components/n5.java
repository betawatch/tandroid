package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public class n5 extends Drawable implements v5 {
    public yh.i8 E;
    public Integer F;
    public int G;
    public PorterDuffColorFilter H;
    public int I;
    public int J;
    public final Rect K;
    public final og L;
    public boolean a;
    public final int b;
    public final OvershootInterpolator c;
    public final d6 d;
    public final d6 e;
    public final Drawable[] f;
    public View h;
    public org.telegram.ui.j71 n;
    public final boolean r;
    public final int s;
    public int v;
    public boolean w;
    public Integer x;
    public boolean y;

    public n5(int i10, View view) {
        this(i10, 7, view, false);
    }

    public final void a() {
        if (this.w) {
            return;
        }
        this.w = true;
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if (drawable instanceof p5) {
            ((p5) drawable).b(this);
        }
        Drawable drawable2 = drawableArr[1];
        if (drawable2 instanceof p5) {
            ((p5) drawable2).b(this);
        }
    }

    public final void b() {
        if (this.w) {
            this.w = false;
            Drawable[] drawableArr = this.f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof p5) {
                ((p5) drawable).p(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof p5) {
                ((p5) drawable2).p(this);
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
        float d = this.d.d(1.0f, false);
        Rect bounds = getBounds();
        Rect rect = this.K;
        rect.set(bounds);
        rect.offset(this.I, this.J);
        float e = this.e.e(this.y);
        og ogVar = this.L;
        if (e > 0.0f) {
            yh.i8 i8Var = this.E;
            i8Var.c.set(rect);
            i8Var.e();
            this.E.d();
            yh.i8 i8Var2 = this.E;
            Integer num = this.F;
            i8Var2.a(canvas, org.telegram.ui.ActionBar.j6.l1(e, num == null ? -1 : num.intValue()));
            yf.h.d().a(15, ogVar);
        } else {
            yf.h.d().f(ogVar);
        }
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[1];
        int i10 = this.s;
        if (drawable != null && d < 1.0f) {
            drawable.setAlpha((int) ((1.0f - d) * this.v));
            int intrinsicWidth = drawableArr[1].getIntrinsicWidth() < 0 ? i10 : drawableArr[1].getIntrinsicWidth();
            int intrinsicHeight = drawableArr[1].getIntrinsicHeight() < 0 ? i10 : drawableArr[1].getIntrinsicHeight();
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof p5) {
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
            boolean z10 = drawable3 instanceof p5;
            OvershootInterpolator overshootInterpolator = this.c;
            if (z10) {
                ai.l4 l4Var = ((p5) drawable3).k;
                if (l4Var != null) {
                    l4Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                }
                if (d < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.a) {
                if (d < 1.0f) {
                    float interpolation2 = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation2, interpolation2, rect.centerX(), rect.centerY());
                }
                int i14 = intrinsicWidth2 / 2;
                int i15 = i10 / 2;
                drawableArr[0].setBounds(rect.centerX() - i14, rect.centerY() - i15, rect.centerX() + i14, rect.centerY() + i15);
            } else {
                if (d < 1.0f) {
                    float interpolation3 = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation3, interpolation3, (intrinsicWidth2 / 2.0f) + rect.left, rect.centerY());
                }
                int i16 = i10 / 2;
                drawableArr[0].setBounds(rect.left, rect.centerY() - i16, rect.left + intrinsicWidth2, rect.centerY() + i16);
            }
            drawableArr[0].setAlpha(this.v);
            drawableArr[0].setColorFilter(this.H);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[1];
        d6 d6Var = this.d;
        return (drawable != null ? 1.0f - d6Var.c : 0.0f) + (drawableArr[0] != null ? d6Var.c : 0.0f);
    }

    public final void f() {
        p5 p5Var;
        ai.l4 l4Var;
        Drawable drawable = this.f[0];
        if (!(drawable instanceof p5) || (l4Var = (p5Var = (p5) drawable).k) == null) {
            return;
        }
        p5Var.w(l4Var);
        l4Var.startAnimation();
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f;
        if (drawableArr[0] == drawable) {
            return;
        }
        d6 d6Var = this.d;
        if (z10) {
            d6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.w && (drawable2 instanceof p5)) {
                    ((p5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            d6Var.d(1.0f, true);
            boolean z11 = this.w;
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
        if ((drawable instanceof p5) && document != null && ((p5) drawable).i() == document.id) {
            return;
        }
        d6 d6Var = this.d;
        if (z10) {
            d6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof p5) {
                    ((p5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.x;
                p5 m10 = p5.m(num != null ? num.intValue() : UserConfig.selectedAccount, i10, document);
                drawableArr[0] = m10;
                if (this.w) {
                    m10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            d6Var.d(1.0f, true);
            boolean z11 = this.w;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.x;
                drawableArr[0] = p5.m(num2 != null ? num2.intValue() : UserConfig.selectedAccount, i10, document);
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

    @Override // org.telegram.ui.Components.v5
    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.j71 j71Var = this.n;
        if (j71Var != null) {
            j71Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j3, boolean z10) {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof p5) && ((p5) drawable).i() == j3) {
            return false;
        }
        int i10 = this.b;
        d6 d6Var = this.d;
        if (z10) {
            d6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.w && (drawable2 instanceof p5)) {
                    ((p5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.x;
            p5 n10 = p5.n(num != null ? num.intValue() : UserConfig.selectedAccount, j3, null, i10);
            drawableArr[0] = n10;
            if (this.w) {
                n10.b(this);
            }
        } else {
            d6Var.d(1.0f, true);
            boolean z11 = this.w;
            if (z11) {
                b();
            }
            Integer num2 = this.x;
            drawableArr[0] = p5.n(num2 != null ? num2.intValue() : UserConfig.selectedAccount, j3, null, i10);
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
        if (this.y == z10) {
            return;
        }
        if (z11) {
            if (this.E == null) {
                this.E = new yh.i8(1, 8);
            }
            this.y = z10;
            invalidate();
            return;
        }
        this.y = z10;
        if (z10 && this.E == null) {
            this.E = new yh.i8(1, 8);
        } else if (!z10 && this.E != null) {
            this.E = null;
        }
        this.e.f(z10, true);
        invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.v = i10;
    }

    public n5(View view, int i10, boolean z10) {
        this(i10, 7, view, z10);
    }

    public n5(int i10, int i11, View view, boolean z10) {
        this.a = false;
        this.c = new OvershootInterpolator(2.0f);
        qr qrVar = qr.g;
        d6 d6Var = new d6((View) null, 300L, qrVar);
        this.d = d6Var;
        d6 d6Var2 = new d6((View) null, 300L, qrVar);
        this.e = d6Var2;
        this.f = new Drawable[2];
        this.v = 255;
        this.K = new Rect();
        this.L = new og(this, 6);
        d6Var.a = view;
        this.h = view;
        d6Var2.a = view;
        this.s = i10;
        this.b = i11;
        this.r = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
