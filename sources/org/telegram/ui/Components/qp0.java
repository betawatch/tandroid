package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qp0 extends fu {
    public boolean S;
    public int T;
    public int U;
    public ValueAnimator V;
    public final /* synthetic */ mq0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp0(mq0 mq0Var, Context context, xp0 xp0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, xp0Var, null, 1, true, g6Var);
        this.W = mq0Var;
    }

    @Override // org.telegram.ui.Components.fu
    public final void c(float f10) {
        this.W.Y0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.S) {
            xt editText = this.W.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.U - editText.getScrollY()) + (this.T - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new k70(editText, 18));
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.V = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(pr.f);
            ofFloat.start();
            this.S = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.fu
    public final void f() {
        super.f();
        mz emojiView = getEmojiView();
        mq0 mq0Var = this.W;
        if (emojiView != null) {
            emojiView.t0 = false;
            emojiView.u2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(mq0Var.D0.d);
        }
        FrameLayout frameLayout = mq0Var.Z;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        pp0 pp0Var = mq0Var.c;
        if (pp0Var != null) {
            pp0Var.bringToFront();
        }
        pp0 pp0Var2 = mq0Var.f;
        if (pp0Var2 != null) {
            pp0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.fu
    public final void q(int i10, int i11) {
        mq0 mq0Var = this.W;
        pp0 pp0Var = mq0Var.c;
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
        mq0Var.s0 = pp0Var.getTop() + mq0Var.r0;
        pp0Var.invalidate();
    }
}
