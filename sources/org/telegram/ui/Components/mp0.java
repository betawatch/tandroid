package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class mp0 extends hu {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ hq0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp0(hq0 hq0Var, Context context, sp0 sp0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, sp0Var, null, 1, true, f6Var);
        this.c0 = hq0Var;
    }

    @Override // org.telegram.ui.Components.hu
    public final void c(float f7) {
        this.c0.Y0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            zt editText = this.c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new h70(editText, 18));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(pr.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.hu
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        hq0 hq0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(hq0Var.G0.d);
        }
        FrameLayout frameLayout = hq0Var.c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        lp0 lp0Var = hq0Var.c;
        if (lp0Var != null) {
            lp0Var.bringToFront();
        }
        lp0 lp0Var2 = hq0Var.f;
        if (lp0Var2 != null) {
            lp0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.hu
    public final void q(int i10, int i11) {
        hq0 hq0Var = this.c0;
        lp0 lp0Var = hq0Var.c;
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
        hq0Var.v0 = lp0Var.getTop() + hq0Var.u0;
        lp0Var.invalidate();
    }
}
