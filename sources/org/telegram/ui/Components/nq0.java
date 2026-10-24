package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class nq0 extends qu {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ ir0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq0(ir0 ir0Var, Context context, tq0 tq0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, tq0Var, null, 1, true, g6Var);
        this.c0 = ir0Var;
    }

    @Override // org.telegram.ui.Components.qu
    public final void c(float f7) {
        this.c0.e1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            iu editText = this.c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new d80(editText, 19));
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
        ir0 ir0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(ir0Var.H0.d);
        }
        FrameLayout frameLayout = ir0Var.d0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        mq0 mq0Var = ir0Var.c;
        if (mq0Var != null) {
            mq0Var.bringToFront();
        }
        mq0 mq0Var2 = ir0Var.f;
        if (mq0Var2 != null) {
            mq0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.qu
    public final void q(int i10, int i11) {
        ir0 ir0Var = this.c0;
        mq0 mq0Var = ir0Var.c;
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
        ir0Var.w0 = mq0Var.getTop() + ir0Var.v0;
        mq0Var.invalidate();
    }
}
