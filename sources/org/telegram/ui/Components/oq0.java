package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class oq0 extends vu {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ jr0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq0(jr0 jr0Var, Context context, uq0 uq0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, uq0Var, null, 1, true, c6Var);
        this.c0 = jr0Var;
    }

    @Override // org.telegram.ui.Components.vu
    public final void c(float f7) {
        this.c0.Z0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            nu editText = this.c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new g80(editText, 19));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(es.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.vu
    public final void f() {
        super.f();
        wz emojiView = getEmojiView();
        jr0 jr0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(jr0Var.G0.d);
        }
        FrameLayout frameLayout = jr0Var.c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        nq0 nq0Var = jr0Var.c;
        if (nq0Var != null) {
            nq0Var.bringToFront();
        }
        nq0 nq0Var2 = jr0Var.f;
        if (nq0Var2 != null) {
            nq0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.vu
    public final void q(int i10, int i11) {
        jr0 jr0Var = this.c0;
        nq0 nq0Var = jr0Var.c;
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
        jr0Var.v0 = nq0Var.getTop() + jr0Var.u0;
        nq0Var.invalidate();
    }
}
