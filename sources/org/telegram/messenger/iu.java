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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class iu extends cu {
    public final TL_iv.pageBlockDetails X;
    public final hv Y;
    public final hv[] Z;
    public final AnimatedArrowDrawable a0;
    public final Paint b0;
    public org.telegram.ui.Components.dc c0;
    public boolean d0;
    public float e0;
    public float f0;

    public iu(iv ivVar, Rect rect, int i7, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(ivVar, rect, i7);
        this.b0 = new Paint(1);
        this.X = pageblockdetails;
        hv hvVar = new hv(ivVar, spannableStringBuilder, i5.c.d(16.0f, this.c - g0.L(53.0f), 0));
        this.Y = hvVar;
        this.Z = new hv[]{hvVar};
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.j6.w0(ivVar.E() ? org.telegram.ui.ActionBar.j6.vl : org.telegram.ui.ActionBar.j6.ul, ivVar.D));
        this.a0 = animatedArrowDrawable;
        animatedArrowDrawable.setAnimationProgress(pageblockdetails.open ? 0.0f : 1.0f);
    }

    @Override // org.telegram.messenger.cu
    public final void A(int i7, Rect rect) {
        int i10 = (int) this.N;
        Rect rect2 = this.b;
        int i11 = i10 + rect2.top;
        int i12 = rect2.left;
        iv ivVar = this.a;
        rect.set(i12 - ivVar.S, i11, (ivVar.C + ivVar.T) - rect2.right, i0() + i11);
    }

    @Override // org.telegram.messenger.cu
    public final int B() {
        return 1;
    }

    @Override // org.telegram.messenger.cu
    public final CharSequence D() {
        return hd.M0(this.X.open ? 2131754882 : 2131754892, null);
    }

    @Override // org.telegram.messenger.cu
    public final CharSequence E(int i7) {
        StaticLayout staticLayout;
        hv hvVar = this.Y;
        CharSequence h02 = (hvVar == null || (staticLayout = hvVar.b) == null) ? null : cu.h0(staticLayout.getText());
        return TextUtils.concat(hd.M0(2131753987, null), ", ", hd.M0(this.X.open ? 2131754882 : 2131754892, null), TextUtils.isEmpty(h02) ? "" : TextUtils.concat(", ", h02));
    }

    @Override // org.telegram.messenger.cu
    public final int I() {
        Rect rect = this.b;
        return i0() + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.cu
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.cu
    public final int K() {
        Rect rect = this.b;
        return g0.L(16.0f) + this.Y.r() + g0.L(53.0f) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.cu
    public final org.telegram.ui.Cells.s9[] L() {
        return this.Z;
    }

    @Override // org.telegram.messenger.cu
    public final void T() {
        this.Y.i(this.W);
    }

    @Override // org.telegram.messenger.cu
    public final boolean U(int i7, View view) {
        j0();
        return true;
    }

    @Override // org.telegram.messenger.cu
    public final void V() {
        this.Y.f(this.W);
    }

    @Override // org.telegram.messenger.cu
    public final void W(Canvas canvas) {
        org.telegram.ui.Components.dc dcVar = this.c0;
        float a10 = dcVar != null ? dcVar.a(0.02f) : 1.0f;
        iv ivVar = this.a;
        float f10 = -ivVar.S;
        int i7 = ivVar.C + ivVar.T;
        Rect rect = this.b;
        float f11 = (i7 - rect.left) - rect.right;
        if (a10 != 1.0f) {
            canvas.save();
            canvas.scale(a10, a10, (f10 + f11) / 2.0f, i0() / 2.0f);
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(ivVar.E() ? org.telegram.ui.ActionBar.j6.vl : org.telegram.ui.ActionBar.j6.ul, ivVar.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.a0;
        animatedArrowDrawable.a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(g0.N(22.6f) + f10, g0.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(g0.L(53.0f) + f10, g0.L(14.0f));
        hv hvVar = this.Y;
        hvVar.d(canvas, hvVar.T);
        canvas.restore();
        if (a10 != 1.0f) {
            canvas.restore();
        }
        if (this.X.open || ivVar.s) {
            return;
        }
        int w03 = org.telegram.ui.ActionBar.j6.w0(ivVar.E() ? org.telegram.ui.ActionBar.j6.xl : org.telegram.ui.ActionBar.j6.wl, ivVar.D);
        Paint paint = this.b0;
        paint.setColor(w03);
        canvas.drawRect(f10, i0() - 1.0f, f11, i0(), paint);
    }

    @Override // org.telegram.messenger.cu
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        iv ivVar = this.a;
        if (actionMasked == 0) {
            this.d0 = true;
            if (this.c0 == null && (view = ivVar.Q) != null) {
                this.c0 = new org.telegram.ui.Components.dc(view);
            }
            org.telegram.ui.Components.dc dcVar = this.c0;
            if (dcVar != null) {
                dcVar.c(true);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.d0 = false;
                org.telegram.ui.Components.dc dcVar2 = this.c0;
                if (dcVar2 != null) {
                    dcVar2.c(false);
                }
            }
            return this.d0;
        }
        if (!this.d0) {
            return false;
        }
        this.d0 = false;
        org.telegram.ui.Components.dc dcVar3 = this.c0;
        if (dcVar3 != null) {
            dcVar3.c(false);
        }
        View view2 = ivVar.Q;
        if (view2 != null) {
            view2.playSoundEffect(0);
        }
        j0();
        return true;
    }

    @Override // org.telegram.messenger.cu
    public final void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        int L = g0.L(53.0f) + (i7 - this.a.S);
        hv hvVar = this.Y;
        hvVar.c = L - hvVar.f;
        hvVar.d = g0.L(14.0f) + i10;
        hvVar.e = i11;
    }

    public final int i0() {
        return k5.b(12.66f, this.Y.b.getHeight() + g0.L(14.0f), g0.L(27.82f));
    }

    public final void j0() {
        iv ivVar = this.a;
        ivVar.X();
        TL_iv.pageBlockDetails pageblockdetails = this.X;
        boolean z10 = pageblockdetails.open;
        pageblockdetails.open = !z10;
        this.a0.a(!z10 ? 0.0f : 1.0f);
        ivVar.s = true;
        ivVar.Q();
        View view = ivVar.Q;
        if (view != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.q1 q1Var = ivVar.E;
        org.telegram.ui.Cells.l1 l1Var = ivVar.F;
        if (q1Var == null || l1Var == null) {
            return;
        }
        l1Var.B1(q1Var, true, true);
    }

    @Override // org.telegram.messenger.cu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        cu.l(spannableStringBuilder, this.Y, this.Z);
    }

    @Override // org.telegram.messenger.cu
    public final boolean u(CharacterStyle characterStyle, int i7, tt ttVar) {
        if (!this.Y.o(characterStyle, ttVar)) {
            return false;
        }
        Rect rect = this.b;
        ttVar.e = (g0.L(53.0f) + (rect.left - this.a.S)) - r0.f;
        ttVar.f = g0.L(14.0f) + i7 + rect.top;
        return true;
    }
}
