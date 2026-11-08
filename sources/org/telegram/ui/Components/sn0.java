package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class sn0 extends lt {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ mo0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn0(mo0 mo0Var, Context context, zn0 zn0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, zn0Var, null, 1, true, f6Var);
        this.c0 = mo0Var;
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
            ofFloat.addUpdateListener(new c60(editText, 17));
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
        mo0 mo0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(mo0Var.y2.d);
        }
        FrameLayout frameLayout = mo0Var.U1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        rn0 rn0Var = mo0Var.j1;
        if (rn0Var != null) {
            rn0Var.bringToFront();
        }
        rn0 rn0Var2 = mo0Var.m1;
        if (rn0Var2 != null) {
            rn0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.lt
    public final void q(int i7, int i10) {
        mo0 mo0Var = this.c0;
        rn0 rn0Var = mo0Var.j1;
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
        mo0Var.n2 = rn0Var.getTop() + mo0Var.m2;
        rn0Var.invalidate();
    }
}
