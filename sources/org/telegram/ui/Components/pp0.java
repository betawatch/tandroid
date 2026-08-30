package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pp0 extends du {
    public boolean S;
    public int T;
    public int U;
    public ValueAnimator V;
    public final /* synthetic */ lq0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp0(lq0 lq0Var, Context context, wp0 wp0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, wp0Var, null, 1, true, f6Var);
        this.W = lq0Var;
    }

    @Override // org.telegram.ui.Components.du
    public final void c(float f10) {
        this.W.Y0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.S) {
            vt editText = this.W.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.U - editText.getScrollY()) + (this.T - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new i70(editText, 18));
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.V = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(nr.f);
            ofFloat.start();
            this.S = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.du
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        lq0 lq0Var = this.W;
        if (emojiView != null) {
            emojiView.t0 = false;
            emojiView.u2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(lq0Var.D0.d);
        }
        FrameLayout frameLayout = lq0Var.Z;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        op0 op0Var = lq0Var.c;
        if (op0Var != null) {
            op0Var.bringToFront();
        }
        op0 op0Var2 = lq0Var.f;
        if (op0Var2 != null) {
            op0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.du
    public final void q(int i10, int i11) {
        lq0 lq0Var = this.W;
        op0 op0Var = lq0Var.c;
        if (TextUtils.isEmpty(getEditText().getText())) {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.S = false;
        } else {
            this.S = true;
            this.T = getEditText().getMeasuredHeight();
            this.U = getEditText().getScrollY();
            invalidate();
        }
        lq0Var.s0 = op0Var.getTop() + lq0Var.r0;
        op0Var.invalidate();
    }
}
