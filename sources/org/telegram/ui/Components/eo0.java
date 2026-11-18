package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class eo0 extends wt {
    public boolean W;
    public int a0;
    public int b0;
    public ValueAnimator c0;
    public final /* synthetic */ yo0 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo0(yo0 yo0Var, Context context, lo0 lo0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, lo0Var, null, 1, true, i6Var);
        this.d0 = yo0Var;
    }

    @Override // org.telegram.ui.Components.wt
    public final void c(float f10) {
        this.d0.a1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            mt editText = this.d0.o1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.b0 - editText.getScrollY()) + (this.a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new e60(editText, 19));
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(lr.f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.wt
    public final void f() {
        super.f();
        ry emojiView = getEmojiView();
        yo0 yo0Var = this.d0;
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(yo0Var.C2.d);
        }
        FrameLayout frameLayout = yo0Var.Y1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        do0 do0Var = yo0Var.n1;
        if (do0Var != null) {
            do0Var.bringToFront();
        }
        do0 do0Var2 = yo0Var.q1;
        if (do0Var2 != null) {
            do0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.wt
    public final void q(int i7, int i10) {
        yo0 yo0Var = this.d0;
        do0 do0Var = yo0Var.n1;
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
        yo0Var.r2 = do0Var.getTop() + yo0Var.q2;
        do0Var.invalidate();
    }
}
