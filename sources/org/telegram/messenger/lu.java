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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class lu extends fu {
    public final TL_iv.pageBlockDetails W;
    public final jv X;
    public final jv[] Y;
    public final AnimatedArrowDrawable Z;
    public final Paint a0;
    public org.telegram.ui.Components.ic b0;
    public boolean c0;
    public float d0;
    public float e0;

    public lu(kv kvVar, Rect rect, int i7, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(kvVar, rect, i7);
        this.a0 = new Paint(1);
        this.W = pageblockdetails;
        jv jvVar = new jv(kvVar, spannableStringBuilder, jg.g.e(16.0f, this.c - g0.L(53.0f), 0));
        this.X = jvVar;
        this.Y = new jv[]{jvVar};
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.sl : org.telegram.ui.ActionBar.k6.rl, kvVar.D));
        this.Z = animatedArrowDrawable;
        animatedArrowDrawable.setAnimationProgress(pageblockdetails.open ? 0.0f : 1.0f);
    }

    @Override // org.telegram.messenger.fu
    public final void A(int i7, Rect rect) {
        int i10 = (int) this.M;
        Rect rect2 = this.b;
        int i11 = i10 + rect2.top;
        int i12 = rect2.left;
        kv kvVar = this.a;
        rect.set(i12 - kvVar.S, i11, (kvVar.C + kvVar.T) - rect2.right, i0() + i11);
    }

    @Override // org.telegram.messenger.fu
    public final int B() {
        return 1;
    }

    @Override // org.telegram.messenger.fu
    public final CharSequence D() {
        return hd.M0(this.W.open ? 2131754882 : 2131754892, null);
    }

    @Override // org.telegram.messenger.fu
    public final CharSequence E(int i7) {
        StaticLayout staticLayout;
        jv jvVar = this.X;
        CharSequence h02 = (jvVar == null || (staticLayout = jvVar.b) == null) ? null : fu.h0(staticLayout.getText());
        return TextUtils.concat(hd.M0(2131753987, null), ", ", hd.M0(this.W.open ? 2131754882 : 2131754892, null), TextUtils.isEmpty(h02) ? "" : TextUtils.concat(", ", h02));
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        Rect rect = this.b;
        return i0() + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.fu
    public final int K() {
        Rect rect = this.b;
        return g0.L(16.0f) + this.X.r() + g0.L(53.0f) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final org.telegram.ui.Cells.t9[] L() {
        return this.Y;
    }

    @Override // org.telegram.messenger.fu
    public final void T() {
        this.X.i(this.V);
    }

    @Override // org.telegram.messenger.fu
    public final boolean U(int i7, View view) {
        j0();
        return true;
    }

    @Override // org.telegram.messenger.fu
    public final void V() {
        this.X.f(this.V);
    }

    @Override // org.telegram.messenger.fu
    public final void W(Canvas canvas) {
        org.telegram.ui.Components.ic icVar = this.b0;
        float a10 = icVar != null ? icVar.a(0.02f) : 1.0f;
        kv kvVar = this.a;
        float f10 = -kvVar.S;
        int i7 = kvVar.C + kvVar.T;
        Rect rect = this.b;
        float f11 = (i7 - rect.left) - rect.right;
        if (a10 != 1.0f) {
            canvas.save();
            canvas.scale(a10, a10, (f10 + f11) / 2.0f, i0() / 2.0f);
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.sl : org.telegram.ui.ActionBar.k6.rl, kvVar.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.Z;
        animatedArrowDrawable.a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(g0.N(22.6f) + f10, g0.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(g0.L(53.0f) + f10, g0.L(14.0f));
        jv jvVar = this.X;
        jvVar.d(canvas, jvVar.S);
        canvas.restore();
        if (a10 != 1.0f) {
            canvas.restore();
        }
        if (this.W.open || kvVar.s) {
            return;
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.ul : org.telegram.ui.ActionBar.k6.tl, kvVar.D);
        Paint paint = this.a0;
        paint.setColor(w03);
        canvas.drawRect(f10, i0() - 1.0f, f11, i0(), paint);
    }

    @Override // org.telegram.messenger.fu
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        kv kvVar = this.a;
        if (actionMasked == 0) {
            this.c0 = true;
            if (this.b0 == null && (view = kvVar.Q) != null) {
                this.b0 = new org.telegram.ui.Components.ic(view);
            }
            org.telegram.ui.Components.ic icVar = this.b0;
            if (icVar != null) {
                icVar.c(true);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.c0 = false;
                org.telegram.ui.Components.ic icVar2 = this.b0;
                if (icVar2 != null) {
                    icVar2.c(false);
                }
            }
            return this.c0;
        }
        if (!this.c0) {
            return false;
        }
        this.c0 = false;
        org.telegram.ui.Components.ic icVar3 = this.b0;
        if (icVar3 != null) {
            icVar3.c(false);
        }
        View view2 = kvVar.Q;
        if (view2 != null) {
            view2.playSoundEffect(0);
        }
        j0();
        return true;
    }

    @Override // org.telegram.messenger.fu
    public final void Z(int i7, int i10, int i11) {
        this.S = i7;
        this.T = i10;
        this.U = i11;
        int L = g0.L(53.0f) + (i7 - this.a.S);
        jv jvVar = this.X;
        jvVar.c = L - jvVar.f;
        jvVar.d = g0.L(14.0f) + i10;
        jvVar.e = i11;
    }

    public final int i0() {
        return k5.b(12.66f, this.X.b.getHeight() + g0.L(14.0f), g0.L(27.82f));
    }

    public final void j0() {
        kv kvVar = this.a;
        kvVar.X();
        TL_iv.pageBlockDetails pageblockdetails = this.W;
        boolean z9 = pageblockdetails.open;
        pageblockdetails.open = !z9;
        this.Z.a(!z9 ? 0.0f : 1.0f);
        kvVar.s = true;
        kvVar.Q();
        View view = kvVar.Q;
        if (view != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.q1 q1Var = kvVar.E;
        org.telegram.ui.Cells.l1 l1Var = kvVar.F;
        if (q1Var == null || l1Var == null) {
            return;
        }
        l1Var.q1(q1Var, true, true);
    }

    @Override // org.telegram.messenger.fu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        fu.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override // org.telegram.messenger.fu
    public final boolean u(CharacterStyle characterStyle, int i7, wt wtVar) {
        if (!this.X.o(characterStyle, wtVar)) {
            return false;
        }
        Rect rect = this.b;
        wtVar.e = (g0.L(53.0f) + (rect.left - this.a.S)) - r0.f;
        wtVar.f = g0.L(14.0f) + i7 + rect.top;
        return true;
    }
}
