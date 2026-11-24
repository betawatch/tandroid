// default package

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lj9 extends kj9 {
    public in3 d0;
    public u51 e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public float j0;
    public int k0;
    public final Drawable l0;
    public int m0;

    public lj9(uj9 uj9Var, Rect rect, int i, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(uj9Var, rect, i, spannableStringBuilder);
        this.l0 = b10.d(a.b, R.drawable.arrow_more);
        boolean z = pageblockblockquote.collapsed;
        this.h0 = z;
        this.i0 = z;
    }

    @Override // kj9, qi9
    public final int H() {
        if (!this.h0) {
            return super.H();
        }
        Rect rect = this.b;
        return (int) Math.min((this.X.b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.a0 + rect.bottom, super.H());
    }

    @Override // kj9, qi9
    public final void V(Canvas canvas) {
        u51 u51Var = this.e0;
        float a = u51Var != null ? u51Var.a(0.01f) : 1.0f;
        int i = this.c;
        if (a != 1.0f) {
            canvas.save();
            canvas.scale(a, a, i / 2.0f, H() / 2.0f);
        }
        boolean z = this.j0 > 0.0f;
        int i2 = (this.k0 - this.b.bottom) - this.b0;
        canvas.save();
        canvas.clipRect(0, 0, i, i2);
        if (z) {
            canvas.saveLayer(0.0f, 0.0f, i, i2, null);
        }
        super.V(canvas);
        if (z) {
            if (this.d0 == null) {
                this.d0 = new in3((byte) 7);
            }
            RectF rectF = gm.P;
            rectF.set(0.0f, i2 - gm.L(24.0f), i, i2 + 1);
            this.d0.r(canvas, rectF, 3, this.j0);
            canvas.restore();
        }
        canvas.restore();
        uj9 uj9Var = this.a;
        int h = uj9Var.y.h();
        int i3 = this.m0;
        Drawable drawable = this.l0;
        if (h != i3) {
            int h2 = uj9Var.y.h();
            this.m0 = h2;
            drawable.setColorFilter(new PorterDuffColorFilter(h2, PorterDuff.Mode.SRC_IN));
        }
        ur3.e(this.l0, uj9Var.C - gm.L(24.0f), gm.L(8.0f) + ((i2 - gm.L(16.0f)) - gm.L(2.0f)), gm.L(16.0f), gm.L(16.0f), 17);
        canvas.save();
        canvas.rotate(gm.U1(this.j0, nm7.J2, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
        if (a != 1.0f) {
            canvas.restore();
        }
    }

    @Override // kj9, qi9
    public final boolean X(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        if (this.g0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.g0 = false;
            }
            return super.X(motionEvent);
        }
        uj9 uj9Var = this.a;
        if (actionMasked == 0) {
            boolean X = super.X(motionEvent);
            this.g0 = X;
            if (!X) {
                this.f0 = true;
                u51 u51Var = this.e0;
                if (u51Var == null && (view = uj9Var.Q) != null) {
                    u51Var = new u51(view);
                    this.e0 = u51Var;
                }
                if (u51Var != null) {
                    u51Var.c(true);
                    return true;
                }
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.f0 = false;
                    u51 u51Var2 = this.e0;
                    if (u51Var2 != null) {
                        u51Var2.c(false);
                    }
                }
                return this.f0;
            }
            if (!this.f0) {
                return false;
            }
            this.f0 = false;
            u51 u51Var3 = this.e0;
            if (u51Var3 != null) {
                u51Var3.c(false);
            }
            View view2 = uj9Var.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            uj9Var.W();
            this.h0 = !this.h0;
            uj9Var.u = true;
            uj9Var.P();
            View view3 = uj9Var.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            rc2 rc2Var = uj9Var.E;
            mc2 mc2Var = uj9Var.F;
            if (rc2Var != null && mc2Var != null) {
                mc2Var.u1(rc2Var, true, true);
            }
        }
        return true;
    }

    @Override // qi9
    public final void c0() {
        super.c0();
        this.i0 = this.h0;
    }

    @Override // qi9
    public final float y() {
        u51 u51Var = this.e0;
        if (u51Var != null) {
            return u51Var.a(0.01f);
        }
        return 1.0f;
    }
}
