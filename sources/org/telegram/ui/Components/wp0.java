package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wp0 extends nu {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ sq0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp0(sq0 sq0Var, Context context, dq0 dq0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, dq0Var, null, 1, true, f6Var);
        this.c0 = sq0Var;
    }

    @Override // org.telegram.ui.Components.nu
    public final void c(float f7) {
        this.c0.Y0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            fu editText = this.c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new q70(editText, 18));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(wr.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.nu
    public final void f() {
        super.f();
        rz emojiView = getEmojiView();
        sq0 sq0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(sq0Var.G0.d);
        }
        FrameLayout frameLayout = sq0Var.c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        vp0 vp0Var = sq0Var.c;
        if (vp0Var != null) {
            vp0Var.bringToFront();
        }
        vp0 vp0Var2 = sq0Var.f;
        if (vp0Var2 != null) {
            vp0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.nu
    public final void q(int i10, int i11) {
        sq0 sq0Var = this.c0;
        vp0 vp0Var = sq0Var.c;
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
        sq0Var.v0 = vp0Var.getTop() + sq0Var.u0;
        vp0Var.invalidate();
    }
}
