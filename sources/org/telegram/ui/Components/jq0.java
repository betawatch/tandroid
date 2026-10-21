package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class jq0 extends qu {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ fr0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq0(fr0 fr0Var, Context context, pq0 pq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, pq0Var, null, 1, true, d6Var);
        this.c0 = fr0Var;
    }

    @Override // org.telegram.ui.Components.qu
    public final void c(float f7) {
        this.c0.a1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            iu editText = this.c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new b80(editText, 19));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(bs.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.qu
    public final void f() {
        super.f();
        tz emojiView = getEmojiView();
        fr0 fr0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(fr0Var.H0.d);
        }
        FrameLayout frameLayout = fr0Var.d0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        iq0 iq0Var = fr0Var.c;
        if (iq0Var != null) {
            iq0Var.bringToFront();
        }
        iq0 iq0Var2 = fr0Var.f;
        if (iq0Var2 != null) {
            iq0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.qu
    public final void q(int i10, int i11) {
        fr0 fr0Var = this.c0;
        iq0 iq0Var = fr0Var.c;
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
        fr0Var.w0 = iq0Var.getTop() + fr0Var.v0;
        iq0Var.invalidate();
    }
}
