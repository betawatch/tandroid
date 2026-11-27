// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class jk9 extends dk9 {
    public final TL_iv.pageBlockDetails X;
    public final gl9 Y;
    public final gl9[] Z;
    public final AnimatedArrowDrawable a0;
    public final Paint b0;
    public v41 c0;
    public boolean d0;
    public float e0;
    public float f0;

    public jk9(hl9 hl9Var, Rect rect, int i, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(hl9Var, rect, i);
        this.b0 = new Paint(1);
        this.X = pageblockdetails;
        gl9 gl9Var = new gl9(hl9Var, spannableStringBuilder, c00.d(16.0f, this.c - hl.L(53.0f), 0));
        this.Y = gl9Var;
        this.Z = new gl9[]{gl9Var};
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(aob.v0(hl9Var.D() ? aob.vl : aob.ul, hl9Var.D));
        this.a0 = animatedArrowDrawable;
        animatedArrowDrawable.setAnimationProgress(pageblockdetails.open ? 0.0f : 1.0f);
    }

    @Override // dk9
    public final int A() {
        return 1;
    }

    @Override // dk9
    public final CharSequence C() {
        return ob6.M0(this.X.open ? 2131754878 : 2131754888, null);
    }

    @Override // dk9
    public final CharSequence D(int i) {
        StaticLayout staticLayout = this.Y.b;
        CharSequence g0 = staticLayout != null ? dk9.g0(staticLayout.getText()) : null;
        return TextUtils.concat(ob6.M0(2131753980, null), ", ", ob6.M0(this.X.open ? 2131754878 : 2131754888, null), TextUtils.isEmpty(g0) ? "" : TextUtils.concat(", ", g0));
    }

    @Override // dk9
    public final int H() {
        Rect rect = this.b;
        return h0() + rect.top + rect.bottom;
    }

    @Override // dk9
    public final int I() {
        return J();
    }

    @Override // dk9
    public final int J() {
        Rect rect = this.b;
        return hl.L(16.0f) + this.Y.r() + hl.L(53.0f) + rect.left + rect.right;
    }

    @Override // dk9
    public final kmb[] K() {
        return this.Z;
    }

    @Override // dk9
    public final void S() {
        this.Y.i(this.W);
    }

    @Override // dk9
    public final boolean T(int i, View view) {
        i0();
        return true;
    }

    @Override // dk9
    public final void U() {
        this.Y.f(this.W);
    }

    @Override // dk9
    public final void V(Canvas canvas) {
        v41 v41Var = this.c0;
        float a = v41Var != null ? v41Var.a(0.02f) : 1.0f;
        hl9 hl9Var = this.a;
        float f = -hl9Var.S;
        int i = hl9Var.C + hl9Var.T;
        Rect rect = this.b;
        float f2 = (i - rect.left) - rect.right;
        if (a != 1.0f) {
            canvas.save();
            canvas.scale(a, a, (f + f2) / 2.0f, h0() / 2.0f);
        }
        int v0 = aob.v0(hl9Var.D() ? aob.vl : aob.ul, hl9Var.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.a0;
        animatedArrowDrawable.a.setColor(v0);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(hl.N(22.6f) + f, hl.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(hl.L(53.0f) + f, hl.L(14.0f));
        gl9 gl9Var = this.Y;
        gl9Var.d(canvas, gl9Var.T);
        canvas.restore();
        if (a != 1.0f) {
            canvas.restore();
        }
        if (this.X.open || hl9Var.s) {
            return;
        }
        int v02 = aob.v0(hl9Var.D() ? aob.xl : aob.wl, hl9Var.D);
        Paint paint = this.b0;
        paint.setColor(v02);
        canvas.drawRect(f, h0() - 1.0f, f2, h0(), paint);
    }

    @Override // dk9
    public final boolean X(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        hl9 hl9Var = this.a;
        if (actionMasked == 0) {
            this.d0 = true;
            v41 v41Var = this.c0;
            if (v41Var == null && (view = hl9Var.Q) != null) {
                v41Var = new v41(view);
                this.c0 = v41Var;
            }
            if (v41Var != null) {
                v41Var.c(true);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.d0 = false;
                v41 v41Var2 = this.c0;
                if (v41Var2 != null) {
                    v41Var2.c(false);
                }
            }
            return this.d0;
        }
        if (!this.d0) {
            return false;
        }
        this.d0 = false;
        v41 v41Var3 = this.c0;
        if (v41Var3 != null) {
            v41Var3.c(false);
        }
        View view2 = hl9Var.Q;
        if (view2 != null) {
            view2.playSoundEffect(0);
        }
        i0();
        return true;
    }

    @Override // dk9
    public final void Y(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        int L = hl.L(53.0f) + (i - this.a.S);
        gl9 gl9Var = this.Y;
        gl9Var.c = L - gl9Var.f;
        gl9Var.d = hl.L(14.0f) + i2;
        gl9Var.e = i3;
    }

    public final int h0() {
        return qu6.e(12.66f, this.Y.b.getHeight() + hl.L(14.0f), hl.L(27.82f));
    }

    public final void i0() {
        hl9 hl9Var = this.a;
        hl9Var.W();
        TL_iv.pageBlockDetails pageblockdetails = this.X;
        boolean z = pageblockdetails.open;
        pageblockdetails.open = !z;
        this.a0.a(!z ? 0.0f : 1.0f);
        hl9Var.s = true;
        hl9Var.P();
        View view = hl9Var.Q;
        if (view != null) {
            view.invalidate();
        }
        wb2 wb2Var = hl9Var.E;
        rb2 rb2Var = hl9Var.F;
        if (wb2Var == null || rb2Var == null) {
            return;
        }
        rb2Var.r1(wb2Var, true, true);
    }

    @Override // dk9
    public final void j(SpannableStringBuilder spannableStringBuilder) {
        dk9.k(spannableStringBuilder, this.Y, this.Z);
    }

    @Override // dk9
    public final boolean t(CharacterStyle characterStyle, int i, vj9 vj9Var) {
        if (!this.Y.o(characterStyle, vj9Var)) {
            return false;
        }
        Rect rect = this.b;
        vj9Var.e = (hl.L(53.0f) + (rect.left - this.a.S)) - r0.f;
        vj9Var.f = hl.L(14.0f) + i + rect.top;
        return true;
    }

    @Override // dk9
    public final void z(int i, Rect rect) {
        int i2 = (int) this.N;
        Rect rect2 = this.b;
        int i3 = i2 + rect2.top;
        int i4 = rect2.left;
        hl9 hl9Var = this.a;
        rect.set(i4 - hl9Var.S, i3, (hl9Var.C + hl9Var.T) - rect2.right, h0() + i3);
    }
}
