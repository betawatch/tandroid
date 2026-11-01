package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class uo0 extends wt {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ pp0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo0(pp0 pp0Var, Context context, cp0 cp0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, cp0Var, null, 1, true, p6Var);
        this.c0 = pp0Var;
    }

    @Override // org.telegram.ui.Components.wt
    public final void c(float f7) {
        this.c0.Z0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            mt editText = this.c0.k1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new r60(editText, 18));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(gr.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.wt
    public final void f() {
        super.f();
        vy emojiView = getEmojiView();
        pp0 pp0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(pp0Var.y2.d);
        }
        FrameLayout frameLayout = pp0Var.U1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        to0 to0Var = pp0Var.j1;
        if (to0Var != null) {
            to0Var.bringToFront();
        }
        to0 to0Var2 = pp0Var.m1;
        if (to0Var2 != null) {
            to0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.wt
    public final void q(int i10, int i11) {
        pp0 pp0Var = this.c0;
        to0 to0Var = pp0Var.j1;
        if (TextUtils.isEmpty(getEditText().getText())) {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        } else {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.a0 = getEditText().getScrollY();
            invalidate();
        }
        pp0Var.n2 = to0Var.getTop() + pp0Var.m2;
        to0Var.invalidate();
    }
}
