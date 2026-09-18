package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class aq0 extends ju {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ vq0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq0(vq0 vq0Var, Context context, gq0 gq0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, gq0Var, null, 1, true, e6Var);
        this.c0 = vq0Var;
    }

    @Override // org.telegram.ui.Components.ju
    public final void c(float f7) {
        this.c0.Y0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            bu editText = this.c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new q70(editText, 18));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(qr.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ju
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        vq0 vq0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(vq0Var.G0.d);
        }
        FrameLayout frameLayout = vq0Var.c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        zp0 zp0Var = vq0Var.c;
        if (zp0Var != null) {
            zp0Var.bringToFront();
        }
        zp0 zp0Var2 = vq0Var.f;
        if (zp0Var2 != null) {
            zp0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.ju
    public final void q(int i10, int i11) {
        vq0 vq0Var = this.c0;
        zp0 zp0Var = vq0Var.c;
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
        vq0Var.v0 = zp0Var.getTop() + vq0Var.u0;
        zp0Var.invalidate();
    }
}
