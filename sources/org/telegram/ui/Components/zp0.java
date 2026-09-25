package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class zp0 extends ku {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ uq0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp0(uq0 uq0Var, Context context, fq0 fq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, fq0Var, null, 1, true, d6Var);
        this.c0 = uq0Var;
    }

    @Override // org.telegram.ui.Components.ku
    public final void c(float f7) {
        this.c0.Y0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            cu editText = this.c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new s70(editText, 18));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(rr.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ku
    public final void f() {
        super.f();
        lz emojiView = getEmojiView();
        uq0 uq0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(uq0Var.G0.d);
        }
        FrameLayout frameLayout = uq0Var.c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        yp0 yp0Var = uq0Var.c;
        if (yp0Var != null) {
            yp0Var.bringToFront();
        }
        yp0 yp0Var2 = uq0Var.f;
        if (yp0Var2 != null) {
            yp0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.ku
    public final void q(int i10, int i11) {
        uq0 uq0Var = this.c0;
        yp0 yp0Var = uq0Var.c;
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
        uq0Var.v0 = yp0Var.getTop() + uq0Var.u0;
        yp0Var.invalidate();
    }
}
