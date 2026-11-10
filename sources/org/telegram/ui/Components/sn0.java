package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sn0 extends kt {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ mo0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn0(mo0 mo0Var, Context context, zn0 zn0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, zn0Var, null, 1, true, h6Var);
        this.c0 = mo0Var;
    }

    @Override // org.telegram.ui.Components.kt
    public final void c(float f10) {
        this.c0.Z0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            ys editText = this.c0.n1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new c60(editText, 17));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(wq.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.kt
    public final void f() {
        super.f();
        gy emojiView = getEmojiView();
        mo0 mo0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(mo0Var.B2.d);
        }
        FrameLayout frameLayout = mo0Var.X1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        rn0 rn0Var = mo0Var.m1;
        if (rn0Var != null) {
            rn0Var.bringToFront();
        }
        rn0 rn0Var2 = mo0Var.p1;
        if (rn0Var2 != null) {
            rn0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.kt
    public final void q(int i7, int i10) {
        mo0 mo0Var = this.c0;
        rn0 rn0Var = mo0Var.m1;
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
        mo0Var.q2 = rn0Var.getTop() + mo0Var.p2;
        rn0Var.invalidate();
    }
}
