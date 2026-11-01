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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class xu extends ru {
    public final TL_iv.pageBlockDetails W;
    public final vv X;
    public final vv[] Y;
    public final AnimatedArrowDrawable Z;
    public final Paint a0;
    public org.telegram.ui.Components.dc b0;
    public boolean c0;
    public float d0;
    public float e0;

    public xu(wv wvVar, Rect rect, int i10, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(wvVar, rect, i10);
        this.a0 = new Paint(1);
        this.W = pageblockdetails;
        vv vvVar = new vv(wvVar, spannableStringBuilder, i0.a.d(16.0f, this.c - i0.L(53.0f), 0));
        this.X = vvVar;
        this.Y = new vv[]{vvVar};
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.t6.w0(wvVar.E() ? org.telegram.ui.ActionBar.t6.sl : org.telegram.ui.ActionBar.t6.rl, wvVar.D));
        this.Z = animatedArrowDrawable;
        animatedArrowDrawable.setAnimationProgress(pageblockdetails.open ? 0.0f : 1.0f);
    }

    @Override // org.telegram.messenger.ru
    public final void A(int i10, Rect rect) {
        int i11 = (int) this.M;
        Rect rect2 = this.b;
        int i12 = i11 + rect2.top;
        int i13 = rect2.left;
        wv wvVar = this.a;
        rect.set(i13 - wvVar.S, i12, (wvVar.C + wvVar.T) - rect2.right, h0() + i12);
    }

    @Override // org.telegram.messenger.ru
    public final int B() {
        return 1;
    }

    @Override // org.telegram.messenger.ru
    public final CharSequence C() {
        return dd.L0(this.W.open ? 2131754882 : 2131754892, null);
    }

    @Override // org.telegram.messenger.ru
    public final CharSequence E(int i10) {
        StaticLayout staticLayout;
        vv vvVar = this.X;
        CharSequence g02 = (vvVar == null || (staticLayout = vvVar.b) == null) ? null : ru.g0(staticLayout.getText());
        return TextUtils.concat(dd.L0(2131753987, null), ", ", dd.L0(this.W.open ? 2131754882 : 2131754892, null), TextUtils.isEmpty(g02) ? "" : TextUtils.concat(", ", g02));
    }

    @Override // org.telegram.messenger.ru
    public final int H() {
        Rect rect = this.b;
        return h0() + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.ru
    public final int I() {
        return J();
    }

    @Override // org.telegram.messenger.ru
    public final int J() {
        Rect rect = this.b;
        return i0.L(16.0f) + this.X.r() + i0.L(53.0f) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.ru
    public final org.telegram.ui.Cells.u9[] K() {
        return this.Y;
    }

    @Override // org.telegram.messenger.ru
    public final void S() {
        this.X.i(this.V);
    }

    @Override // org.telegram.messenger.ru
    public final boolean T(int i10, View view) {
        i0();
        return true;
    }

    @Override // org.telegram.messenger.ru
    public final void U() {
        this.X.f(this.V);
    }

    @Override // org.telegram.messenger.ru
    public final void V(Canvas canvas) {
        org.telegram.ui.Components.dc dcVar = this.b0;
        float a2 = dcVar != null ? dcVar.a(0.02f) : 1.0f;
        wv wvVar = this.a;
        float f7 = -wvVar.S;
        int i10 = wvVar.C + wvVar.T;
        Rect rect = this.b;
        float f10 = (i10 - rect.left) - rect.right;
        if (a2 != 1.0f) {
            canvas.save();
            canvas.scale(a2, a2, (f7 + f10) / 2.0f, h0() / 2.0f);
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(wvVar.E() ? org.telegram.ui.ActionBar.t6.sl : org.telegram.ui.ActionBar.t6.rl, wvVar.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.Z;
        animatedArrowDrawable.a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(i0.N(22.6f) + f7, i0.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(i0.L(53.0f) + f7, i0.L(14.0f));
        vv vvVar = this.X;
        vvVar.d(canvas, vvVar.S);
        canvas.restore();
        if (a2 != 1.0f) {
            canvas.restore();
        }
        if (this.W.open || wvVar.s) {
            return;
        }
        int w03 = org.telegram.ui.ActionBar.t6.w0(wvVar.E() ? org.telegram.ui.ActionBar.t6.ul : org.telegram.ui.ActionBar.t6.tl, wvVar.D);
        Paint paint = this.a0;
        paint.setColor(w03);
        canvas.drawRect(f7, h0() - 1.0f, f10, h0(), paint);
    }

    @Override // org.telegram.messenger.ru
    public final boolean X(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        wv wvVar = this.a;
        if (actionMasked == 0) {
            this.c0 = true;
            if (this.b0 == null && (view = wvVar.Q) != null) {
                this.b0 = new org.telegram.ui.Components.dc(view);
            }
            org.telegram.ui.Components.dc dcVar = this.b0;
            if (dcVar != null) {
                dcVar.c(true);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.c0 = false;
                org.telegram.ui.Components.dc dcVar2 = this.b0;
                if (dcVar2 != null) {
                    dcVar2.c(false);
                }
            }
            return this.c0;
        }
        if (!this.c0) {
            return false;
        }
        this.c0 = false;
        org.telegram.ui.Components.dc dcVar3 = this.b0;
        if (dcVar3 != null) {
            dcVar3.c(false);
        }
        View view2 = wvVar.Q;
        if (view2 != null) {
            view2.playSoundEffect(0);
        }
        i0();
        return true;
    }

    @Override // org.telegram.messenger.ru
    public final void Y(int i10, int i11, int i12) {
        this.S = i10;
        this.T = i11;
        this.U = i12;
        int L = i0.L(53.0f) + (i10 - this.a.S);
        vv vvVar = this.X;
        vvVar.c = L - vvVar.f;
        vvVar.d = i0.L(14.0f) + i11;
        vvVar.e = i12;
    }

    public final int h0() {
        return m5.b(12.66f, this.X.b.getHeight() + i0.L(14.0f), i0.L(27.82f));
    }

    public final void i0() {
        wv wvVar = this.a;
        wvVar.X();
        TL_iv.pageBlockDetails pageblockdetails = this.W;
        boolean z10 = pageblockdetails.open;
        pageblockdetails.open = !z10;
        this.Z.a(!z10 ? 0.0f : 1.0f);
        wvVar.s = true;
        wvVar.Q();
        View view = wvVar.Q;
        if (view != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.q1 q1Var = wvVar.E;
        org.telegram.ui.Cells.l1 l1Var = wvVar.F;
        if (q1Var == null || l1Var == null) {
            return;
        }
        l1Var.l1(q1Var, true, true);
    }

    @Override // org.telegram.messenger.ru
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        ru.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override // org.telegram.messenger.ru
    public final boolean u(CharacterStyle characterStyle, int i10, iu iuVar) {
        if (!this.X.o(characterStyle, iuVar)) {
            return false;
        }
        Rect rect = this.b;
        iuVar.e = (i0.L(53.0f) + (rect.left - this.a.S)) - r0.f;
        iuVar.f = i0.L(14.0f) + i10 + rect.top;
        return true;
    }
}
