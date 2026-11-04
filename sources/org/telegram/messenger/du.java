package org.telegram.messenger;

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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class du extends xt {
    public final TL_iv.pageBlockDetails X;
    public final bv Y;
    public final bv[] Z;
    public final AnimatedArrowDrawable a0;
    public final Paint b0;
    public org.telegram.ui.Components.gc c0;
    public boolean d0;
    public float e0;
    public float f0;

    public du(cv cvVar, Rect rect, int i3, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(cvVar, rect, i3);
        this.b0 = new Paint(1);
        this.X = pageblockdetails;
        bv bvVar = new bv(cvVar, spannableStringBuilder, k2.p1.d(16.0f, this.c - g0.L(53.0f), 0));
        this.Y = bvVar;
        this.Z = new bv[]{bvVar};
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.sl : org.telegram.ui.ActionBar.k6.rl, cvVar.D));
        this.a0 = animatedArrowDrawable;
        animatedArrowDrawable.setAnimationProgress(pageblockdetails.open ? 0.0f : 1.0f);
    }

    @Override // org.telegram.messenger.xt
    public final void A(int i3, Rect rect) {
        int i10 = (int) this.N;
        Rect rect2 = this.b;
        int i11 = i10 + rect2.top;
        int i12 = rect2.left;
        cv cvVar = this.a;
        rect.set(i12 - cvVar.S, i11, (cvVar.C + cvVar.T) - rect2.right, i0() + i11);
    }

    @Override // org.telegram.messenger.xt
    public final int B() {
        return 1;
    }

    @Override // org.telegram.messenger.xt
    public final CharSequence D() {
        return bd.M0(this.X.open ? 2131754882 : 2131754892, null);
    }

    @Override // org.telegram.messenger.xt
    public final CharSequence E(int i3) {
        StaticLayout staticLayout;
        bv bvVar = this.Y;
        CharSequence h02 = (bvVar == null || (staticLayout = bvVar.b) == null) ? null : xt.h0(staticLayout.getText());
        return TextUtils.concat(bd.M0(2131753987, null), ", ", bd.M0(this.X.open ? 2131754882 : 2131754892, null), TextUtils.isEmpty(h02) ? "" : TextUtils.concat(", ", h02));
    }

    @Override // org.telegram.messenger.xt
    public final int I() {
        Rect rect = this.b;
        return i0() + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.xt
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.xt
    public final int K() {
        Rect rect = this.b;
        return g0.L(16.0f) + this.Y.r() + g0.L(53.0f) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.xt
    public final org.telegram.ui.Cells.s9[] L() {
        return this.Z;
    }

    @Override // org.telegram.messenger.xt
    public final void T() {
        this.Y.i(this.W);
    }

    @Override // org.telegram.messenger.xt
    public final boolean U(int i3, View view) {
        j0();
        return true;
    }

    @Override // org.telegram.messenger.xt
    public final void V() {
        this.Y.f(this.W);
    }

    @Override // org.telegram.messenger.xt
    public final void W(Canvas canvas) {
        org.telegram.ui.Components.gc gcVar = this.c0;
        float a10 = gcVar != null ? gcVar.a(0.02f) : 1.0f;
        cv cvVar = this.a;
        float f10 = -cvVar.S;
        int i3 = cvVar.C + cvVar.T;
        Rect rect = this.b;
        float f11 = (i3 - rect.left) - rect.right;
        if (a10 != 1.0f) {
            canvas.save();
            canvas.scale(a10, a10, (f10 + f11) / 2.0f, i0() / 2.0f);
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.sl : org.telegram.ui.ActionBar.k6.rl, cvVar.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.a0;
        animatedArrowDrawable.a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(g0.N(22.6f) + f10, g0.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(g0.L(53.0f) + f10, g0.L(14.0f));
        bv bvVar = this.Y;
        bvVar.d(canvas, bvVar.T);
        canvas.restore();
        if (a10 != 1.0f) {
            canvas.restore();
        }
        if (this.X.open || cvVar.s) {
            return;
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.ul : org.telegram.ui.ActionBar.k6.tl, cvVar.D);
        Paint paint = this.b0;
        paint.setColor(w03);
        canvas.drawRect(f10, i0() - 1.0f, f11, i0(), paint);
    }

    @Override // org.telegram.messenger.xt
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        cv cvVar = this.a;
        if (actionMasked == 0) {
            this.d0 = true;
            if (this.c0 == null && (view = cvVar.Q) != null) {
                this.c0 = new org.telegram.ui.Components.gc(view);
            }
            org.telegram.ui.Components.gc gcVar = this.c0;
            if (gcVar != null) {
                gcVar.c(true);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.d0 = false;
                org.telegram.ui.Components.gc gcVar2 = this.c0;
                if (gcVar2 != null) {
                    gcVar2.c(false);
                }
            }
            return this.d0;
        }
        if (!this.d0) {
            return false;
        }
        this.d0 = false;
        org.telegram.ui.Components.gc gcVar3 = this.c0;
        if (gcVar3 != null) {
            gcVar3.c(false);
        }
        View view2 = cvVar.Q;
        if (view2 != null) {
            view2.playSoundEffect(0);
        }
        j0();
        return true;
    }

    @Override // org.telegram.messenger.xt
    public final void Z(int i3, int i10, int i11) {
        this.T = i3;
        this.U = i10;
        this.V = i11;
        int L = g0.L(53.0f) + (i3 - this.a.S);
        bv bvVar = this.Y;
        bvVar.c = L - bvVar.f;
        bvVar.d = g0.L(14.0f) + i10;
        bvVar.e = i11;
    }

    public final int i0() {
        return k5.b(12.66f, this.Y.b.getHeight() + g0.L(14.0f), g0.L(27.82f));
    }

    public final void j0() {
        cv cvVar = this.a;
        cvVar.X();
        TL_iv.pageBlockDetails pageblockdetails = this.X;
        boolean z10 = pageblockdetails.open;
        pageblockdetails.open = !z10;
        this.a0.a(!z10 ? 0.0f : 1.0f);
        cvVar.s = true;
        cvVar.Q();
        View view = cvVar.Q;
        if (view != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.q1 q1Var = cvVar.E;
        org.telegram.ui.Cells.l1 l1Var = cvVar.F;
        if (q1Var == null || l1Var == null) {
            return;
        }
        l1Var.r1(q1Var, true, true);
    }

    @Override // org.telegram.messenger.xt
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        xt.l(spannableStringBuilder, this.Y, this.Z);
    }

    @Override // org.telegram.messenger.xt
    public final boolean u(CharacterStyle characterStyle, int i3, ot otVar) {
        if (!this.Y.o(characterStyle, otVar)) {
            return false;
        }
        Rect rect = this.b;
        otVar.e = (g0.L(53.0f) + (rect.left - this.a.S)) - r0.f;
        otVar.f = g0.L(14.0f) + i3 + rect.top;
        return true;
    }
}
