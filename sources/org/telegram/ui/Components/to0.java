package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class to0 extends wt {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ op0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to0(op0 op0Var, Context context, bp0 bp0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, bp0Var, null, 1, true, p6Var);
        this.c0 = op0Var;
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
        op0 op0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(op0Var.y2.d);
        }
        FrameLayout frameLayout = op0Var.U1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        so0 so0Var = op0Var.j1;
        if (so0Var != null) {
            so0Var.bringToFront();
        }
        so0 so0Var2 = op0Var.m1;
        if (so0Var2 != null) {
            so0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.wt
    public final void q(int i10, int i11) {
        op0 op0Var = this.c0;
        so0 so0Var = op0Var.j1;
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
        op0Var.n2 = so0Var.getTop() + op0Var.m2;
        so0Var.invalidate();
    }
}
