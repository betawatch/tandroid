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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class i5 extends Drawable implements q5 {
    public gh.bb A;
    public Integer B;
    public int C;
    public PorterDuffColorFilter D;
    public int E;
    public int F;
    public final Rect G;
    public final fg H;
    public boolean a;
    public final int b;
    public final OvershootInterpolator c;
    public final y5 d;
    public final y5 e;
    public final Drawable[] f;
    public View h;
    public org.telegram.ui.b61 n;
    public final boolean r;
    public final int s;
    public int v;
    public boolean w;
    public Integer x;
    public boolean y;

    public i5(int i9, View view) {
        this(i9, 7, view, false);
    }

    public final void a() {
        if (this.w) {
            return;
        }
        this.w = true;
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if (drawable instanceof k5) {
            ((k5) drawable).b(this);
        }
        Drawable drawable2 = drawableArr[1];
        if (drawable2 instanceof k5) {
            ((k5) drawable2).b(this);
        }
    }

    public final void b() {
        if (this.w) {
            this.w = false;
            Drawable[] drawableArr = this.f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof k5) {
                ((k5) drawable).p(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof k5) {
                ((k5) drawable2).p(this);
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
        Rect rect = this.G;
        rect.set(bounds);
        rect.offset(this.E, this.F);
        float e10 = this.e.e(this.y);
        fg fgVar = this.H;
        if (e10 > 0.0f) {
            gh.bb bbVar = this.A;
            bbVar.c.set(rect);
            bbVar.e();
            this.A.d();
            gh.bb bbVar2 = this.A;
            Integer num = this.B;
            bbVar2.a(canvas, org.telegram.ui.ActionBar.f6.l1(e10, num == null ? -1 : num.intValue()));
            ff.k.d().a(15, fgVar);
        } else {
            ff.k.d().g(fgVar);
        }
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[1];
        int i9 = this.s;
        if (drawable != null && d < 1.0f) {
            drawable.setAlpha((int) ((1.0f - d) * this.v));
            int intrinsicWidth = drawableArr[1].getIntrinsicWidth() < 0 ? i9 : drawableArr[1].getIntrinsicWidth();
            int intrinsicHeight = drawableArr[1].getIntrinsicHeight() < 0 ? i9 : drawableArr[1].getIntrinsicHeight();
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof k5) {
                drawable2.setBounds(rect);
            } else if (this.a) {
                int i10 = intrinsicWidth / 2;
                int i11 = intrinsicHeight / 2;
                drawable2.setBounds(rect.centerX() - i10, rect.centerY() - i11, rect.centerX() + i10, rect.centerY() + i11);
            } else {
                int i12 = intrinsicHeight / 2;
                drawable2.setBounds(rect.left, rect.centerY() - i12, rect.left + intrinsicWidth, rect.centerY() + i12);
            }
            drawableArr[1].setColorFilter(this.D);
            drawableArr[1].draw(canvas);
            drawableArr[1].setColorFilter(null);
        }
        if (drawableArr[0] != null) {
            canvas.save();
            int intrinsicWidth2 = drawableArr[0].getIntrinsicWidth() < 0 ? i9 : drawableArr[0].getIntrinsicWidth();
            if (drawableArr[0].getIntrinsicHeight() >= 0) {
                i9 = drawableArr[0].getIntrinsicHeight();
            }
            Drawable drawable3 = drawableArr[0];
            boolean z10 = drawable3 instanceof k5;
            OvershootInterpolator overshootInterpolator = this.c;
            if (z10) {
                ih.z2 z2Var = ((k5) drawable3).k;
                if (z2Var != null) {
                    z2Var.setRoundRadius(AndroidUtilities.dp(4.0f));
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
                int i13 = intrinsicWidth2 / 2;
                int i14 = i9 / 2;
                drawableArr[0].setBounds(rect.centerX() - i13, rect.centerY() - i14, rect.centerX() + i13, rect.centerY() + i14);
            } else {
                if (d < 1.0f) {
                    float interpolation3 = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation3, interpolation3, (intrinsicWidth2 / 2.0f) + rect.left, rect.centerY());
                }
                int i15 = i9 / 2;
                drawableArr[0].setBounds(rect.left, rect.centerY() - i15, rect.left + intrinsicWidth2, rect.centerY() + i15);
            }
            drawableArr[0].setAlpha(this.v);
            drawableArr[0].setColorFilter(this.D);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[1];
        y5 y5Var = this.d;
        return (drawable != null ? 1.0f - y5Var.c : 0.0f) + (drawableArr[0] != null ? y5Var.c : 0.0f);
    }

    public final void f() {
        k5 k5Var;
        ih.z2 z2Var;
        Drawable drawable = this.f[0];
        if (!(drawable instanceof k5) || (z2Var = (k5Var = (k5) drawable).k) == null) {
            return;
        }
        k5Var.w(z2Var);
        z2Var.startAnimation();
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f;
        if (drawableArr[0] == drawable) {
            return;
        }
        y5 y5Var = this.d;
        if (z10) {
            y5Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.w && (drawable2 instanceof k5)) {
                    ((k5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            y5Var.d(1.0f, true);
            boolean z11 = this.w;
            if (z11) {
                b();
            }
            drawableArr[0] = drawable;
            if (z11) {
                a();
            }
        }
        this.B = null;
        this.D = null;
        this.C = 0;
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

    public final void h(TLRPC.Document document, int i9, boolean z10) {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof k5) && document != null && ((k5) drawable).i() == document.id) {
            return;
        }
        y5 y5Var = this.d;
        if (z10) {
            y5Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof k5) {
                    ((k5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.x;
                k5 m10 = k5.m(num != null ? num.intValue() : UserConfig.selectedAccount, i9, document);
                drawableArr[0] = m10;
                if (this.w) {
                    m10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            y5Var.d(1.0f, true);
            boolean z11 = this.w;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.x;
                drawableArr[0] = k5.m(num2 != null ? num2.intValue() : UserConfig.selectedAccount, i9, document);
            } else {
                drawableArr[0] = null;
            }
            if (z11) {
                a();
            }
        }
        this.B = null;
        this.D = null;
        this.C = 0;
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
        org.telegram.ui.b61 b61Var = this.n;
        if (b61Var != null) {
            b61Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j10, boolean z10) {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof k5) && ((k5) drawable).i() == j10) {
            return false;
        }
        int i9 = this.b;
        y5 y5Var = this.d;
        if (z10) {
            y5Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.w && (drawable2 instanceof k5)) {
                    ((k5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.x;
            k5 n10 = k5.n(num != null ? num.intValue() : UserConfig.selectedAccount, j10, null, i9);
            drawableArr[0] = n10;
            if (this.w) {
                n10.b(this);
            }
        } else {
            y5Var.d(1.0f, true);
            boolean z11 = this.w;
            if (z11) {
                b();
            }
            Integer num2 = this.x;
            drawableArr[0] = k5.n(num2 != null ? num2.intValue() : UserConfig.selectedAccount, j10, null, i9);
            if (z11) {
                a();
            }
        }
        this.B = null;
        this.D = null;
        this.C = 0;
        f();
        invalidate();
        return true;
    }

    public final void k(Integer num) {
        PorterDuffColorFilter porterDuffColorFilter;
        Integer num2 = this.B;
        if (num2 == null && num == null) {
            return;
        }
        if (num2 == null || !num2.equals(num)) {
            this.B = num;
            if (num == null || this.C != num.intValue()) {
                if (num != null) {
                    int intValue = num.intValue();
                    this.C = intValue;
                    porterDuffColorFilter = new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                } else {
                    porterDuffColorFilter = null;
                }
                this.D = porterDuffColorFilter;
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
            if (this.A == null) {
                this.A = new gh.bb(1, 8);
            }
            this.y = z10;
            invalidate();
            return;
        }
        this.y = z10;
        if (z10 && this.A == null) {
            this.A = new gh.bb(1, 8);
        } else if (!z10 && this.A != null) {
            this.A = null;
        }
        this.e.f(z10, true);
        invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.v = i9;
    }

    public i5(View view, int i9, boolean z10) {
        this(i9, 7, view, z10);
    }

    public i5(int i9, int i10, View view, boolean z10) {
        this.a = false;
        this.c = new OvershootInterpolator(2.0f);
        gr grVar = gr.g;
        y5 y5Var = new y5((View) null, 300L, grVar);
        this.d = y5Var;
        y5 y5Var2 = new y5((View) null, 300L, grVar);
        this.e = y5Var2;
        this.f = new Drawable[2];
        this.v = 255;
        this.G = new Rect();
        this.H = new fg(this, 6);
        y5Var.a = view;
        this.h = view;
        y5Var2.a = view;
        this.s = i9;
        this.b = i10;
        this.r = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
