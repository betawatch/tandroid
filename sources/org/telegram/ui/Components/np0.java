package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class np0 extends ju {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ iq0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np0(iq0 iq0Var, Context context, tp0 tp0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, tp0Var, null, 1, true, f6Var);
        this.c0 = iq0Var;
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
            ofFloat.addUpdateListener(new h70(editText, 18));
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
        iq0 iq0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(iq0Var.G0.d);
        }
        FrameLayout frameLayout = iq0Var.c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        mp0 mp0Var = iq0Var.c;
        if (mp0Var != null) {
            mp0Var.bringToFront();
        }
        mp0 mp0Var2 = iq0Var.f;
        if (mp0Var2 != null) {
            mp0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.ju
    public final void q(int i10, int i11) {
        iq0 iq0Var = this.c0;
        mp0 mp0Var = iq0Var.c;
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
        iq0Var.v0 = mp0Var.getTop() + iq0Var.u0;
        mp0Var.invalidate();
    }
}
