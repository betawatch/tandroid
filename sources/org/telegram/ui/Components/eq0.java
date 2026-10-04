package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class eq0 extends mu {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ zq0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq0(zq0 zq0Var, Context context, kq0 kq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, kq0Var, null, 1, true, d6Var);
        this.c0 = zq0Var;
    }

    @Override // org.telegram.ui.Components.mu
    public final void c(float f7) {
        this.c0.V0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            eu editText = this.c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new v70(editText, 18));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(tr.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.mu
    public final void f() {
        super.f();
        nz emojiView = getEmojiView();
        zq0 zq0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(zq0Var.G0.d);
        }
        FrameLayout frameLayout = zq0Var.c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        dq0 dq0Var = zq0Var.c;
        if (dq0Var != null) {
            dq0Var.bringToFront();
        }
        dq0 dq0Var2 = zq0Var.f;
        if (dq0Var2 != null) {
            dq0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.mu
    public final void q(int i10, int i11) {
        zq0 zq0Var = this.c0;
        dq0 dq0Var = zq0Var.c;
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
        zq0Var.v0 = dq0Var.getTop() + zq0Var.u0;
        dq0Var.invalidate();
    }
}
