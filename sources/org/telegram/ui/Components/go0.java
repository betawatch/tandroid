package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class go0 extends yt {
    public boolean W;
    public int a0;
    public int b0;
    public ValueAnimator c0;
    public final /* synthetic */ ap0 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go0(ap0 ap0Var, Context context, no0 no0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, no0Var, null, 1, true, h6Var);
        this.d0 = ap0Var;
    }

    @Override // org.telegram.ui.Components.yt
    public final void c(float f10) {
        this.d0.a1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            ot editText = this.d0.o1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.b0 - editText.getScrollY()) + (this.a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new h60(editText, 19));
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(nr.f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.yt
    public final void f() {
        super.f();
        ty emojiView = getEmojiView();
        ap0 ap0Var = this.d0;
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(ap0Var.C2.d);
        }
        FrameLayout frameLayout = ap0Var.Y1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        fo0 fo0Var = ap0Var.n1;
        if (fo0Var != null) {
            fo0Var.bringToFront();
        }
        fo0 fo0Var2 = ap0Var.q1;
        if (fo0Var2 != null) {
            fo0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.yt
    public final void q(int i7, int i10) {
        ap0 ap0Var = this.d0;
        fo0 fo0Var = ap0Var.n1;
        if (TextUtils.isEmpty(getEditText().getText())) {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.W = false;
        } else {
            this.W = true;
            this.a0 = getEditText().getMeasuredHeight();
            this.b0 = getEditText().getScrollY();
            invalidate();
        }
        ap0Var.r2 = fo0Var.getTop() + ap0Var.q2;
        fo0Var.invalidate();
    }
}
