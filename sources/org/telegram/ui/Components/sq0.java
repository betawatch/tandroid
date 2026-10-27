package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sq0 extends ru {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ nr0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq0(nr0 nr0Var, Context context, yq0 yq0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, yq0Var, null, 1, true, u6Var);
        this.c0 = nr0Var;
    }

    @Override // org.telegram.ui.Components.ru
    public final void c(float f7) {
        this.c0.b1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            ju editText = this.c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new f80(editText, 19));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(ds.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ru
    public final void f() {
        super.f();
        sz emojiView = getEmojiView();
        nr0 nr0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(nr0Var.H0.d);
        }
        FrameLayout frameLayout = nr0Var.d0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        rq0 rq0Var = nr0Var.c;
        if (rq0Var != null) {
            rq0Var.bringToFront();
        }
        rq0 rq0Var2 = nr0Var.f;
        if (rq0Var2 != null) {
            rq0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.ru
    public final void q(int i10, int i11) {
        nr0 nr0Var = this.c0;
        rq0 rq0Var = nr0Var.c;
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
        nr0Var.w0 = rq0Var.getTop() + nr0Var.v0;
        rq0Var.invalidate();
    }
}
