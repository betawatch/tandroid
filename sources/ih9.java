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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ih9 extends hh9 {
    public xl3 d0;
    public n41 e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public float j0;
    public int k0;
    public final Drawable l0;
    public int m0;

    public ih9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(rh9Var, rect, i, spannableStringBuilder);
        this.l0 = b00.d(a.b, R.drawable.arrow_more);
        boolean z = pageblockblockquote.collapsed;
        this.h0 = z;
        this.i0 = z;
    }

    @Override // hh9, mg9
    public final int I() {
        if (!this.h0) {
            return super.I();
        }
        Rect rect = this.b;
        return (int) Math.min((this.X.b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.a0 + rect.bottom, super.I());
    }

    @Override // hh9, mg9
    public final void W(Canvas canvas) {
        n41 n41Var = this.e0;
        float a = n41Var != null ? n41Var.a(0.01f) : 1.0f;
        int i = this.c;
        if (a != 1.0f) {
            canvas.save();
            canvas.scale(a, a, i / 2.0f, I() / 2.0f);
        }
        boolean z = this.j0 > 0.0f;
        int i2 = (this.k0 - this.b.bottom) - this.b0;
        canvas.save();
        canvas.clipRect(0, 0, i, i2);
        if (z) {
            canvas.saveLayer(0.0f, 0.0f, i, i2, null);
        }
        super.W(canvas);
        if (z) {
            if (this.d0 == null) {
                this.d0 = new xl3((byte) 7);
            }
            RectF rectF = gl.P;
            rectF.set(0.0f, i2 - gl.L(24.0f), i, i2 + 1);
            this.d0.s(canvas, rectF, 3, this.j0);
            canvas.restore();
        }
        canvas.restore();
        rh9 rh9Var = this.a;
        int h = rh9Var.y.h();
        int i3 = this.m0;
        Drawable drawable = this.l0;
        if (h != i3) {
            int h2 = rh9Var.y.h();
            this.m0 = h2;
            drawable.setColorFilter(new PorterDuffColorFilter(h2, PorterDuff.Mode.SRC_IN));
        }
        kq3.e(this.l0, rh9Var.C - gl.L(24.0f), gl.L(8.0f) + ((i2 - gl.L(16.0f)) - gl.L(2.0f)), gl.L(16.0f), gl.L(16.0f), 17);
        canvas.save();
        canvas.rotate(gl.U1(this.j0, kk7.J2, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
        if (a != 1.0f) {
            canvas.restore();
        }
    }

    @Override // hh9, mg9
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        if (this.g0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.g0 = false;
            }
            return super.Y(motionEvent);
        }
        rh9 rh9Var = this.a;
        if (actionMasked == 0) {
            boolean Y = super.Y(motionEvent);
            this.g0 = Y;
            if (!Y) {
                this.f0 = true;
                n41 n41Var = this.e0;
                if (n41Var == null && (view = rh9Var.Q) != null) {
                    n41Var = new n41(view);
                    this.e0 = n41Var;
                }
                if (n41Var != null) {
                    n41Var.c(true);
                    return true;
                }
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.f0 = false;
                    n41 n41Var2 = this.e0;
                    if (n41Var2 != null) {
                        n41Var2.c(false);
                    }
                }
                return this.f0;
            }
            if (!this.f0) {
                return false;
            }
            this.f0 = false;
            n41 n41Var3 = this.e0;
            if (n41Var3 != null) {
                n41Var3.c(false);
            }
            View view2 = rh9Var.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            rh9Var.W();
            this.h0 = !this.h0;
            rh9Var.u = true;
            rh9Var.P();
            View view3 = rh9Var.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            gb2 gb2Var = rh9Var.E;
            bb2 bb2Var = rh9Var.F;
            if (gb2Var != null && bb2Var != null) {
                bb2Var.G1(gb2Var, true, true);
            }
        }
        return true;
    }

    @Override // mg9
    public final void d0() {
        super.d0();
        this.i0 = this.h0;
    }

    @Override // mg9
    public final float z() {
        n41 n41Var = this.e0;
        if (n41Var != null) {
            return n41Var.a(0.01f);
        }
        return 1.0f;
    }
}
