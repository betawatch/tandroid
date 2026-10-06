package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class fq0 extends mu {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ br0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq0(br0 br0Var, Context context, mq0 mq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, mq0Var, null, 1, true, d6Var);
        this.c0 = br0Var;
    }

    @Override // org.telegram.ui.Components.mu
    public final void c(float f7) {
        this.c0.V0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            eu editText = this.c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new v70(editText, 18));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(tr.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.mu
    public final void f() {
        super.f();
        nz emojiView = getEmojiView();
        br0 br0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(br0Var.G0.d);
        }
        FrameLayout frameLayout = br0Var.c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        eq0 eq0Var = br0Var.c;
        if (eq0Var != null) {
            eq0Var.bringToFront();
        }
        eq0 eq0Var2 = br0Var.f;
        if (eq0Var2 != null) {
            eq0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.mu
    public final void q(int i10, int i11) {
        br0 br0Var = this.c0;
        eq0 eq0Var = br0Var.c;
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
        br0Var.v0 = eq0Var.getTop() + br0Var.u0;
        eq0Var.invalidate();
    }
}
