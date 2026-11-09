package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tn0 extends lt {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ no0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn0(no0 no0Var, Context context, ao0 ao0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, ao0Var, null, 1, true, g6Var);
        this.c0 = no0Var;
    }

    @Override // org.telegram.ui.Components.lt
    public final void c(float f10) {
        this.c0.Z0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            zs editText = this.c0.k1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new d60(editText, 17));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(xq.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.lt
    public final void f() {
        super.f();
        hy emojiView = getEmojiView();
        no0 no0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(no0Var.y2.d);
        }
        FrameLayout frameLayout = no0Var.U1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        sn0 sn0Var = no0Var.j1;
        if (sn0Var != null) {
            sn0Var.bringToFront();
        }
        sn0 sn0Var2 = no0Var.m1;
        if (sn0Var2 != null) {
            sn0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.lt
    public final void q(int i7, int i10) {
        no0 no0Var = this.c0;
        sn0 sn0Var = no0Var.j1;
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
        no0Var.n2 = sn0Var.getTop() + no0Var.m2;
        sn0Var.invalidate();
    }
}
