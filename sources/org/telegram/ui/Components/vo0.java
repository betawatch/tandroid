package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vo0 extends ut {
    public boolean R;
    public int S;
    public int T;
    public ValueAnimator U;
    public final /* synthetic */ rp0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo0(rp0 rp0Var, Context context, cp0 cp0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, cp0Var, null, 1, true, b6Var);
        this.V = rp0Var;
    }

    @Override // org.telegram.ui.Components.ut
    public final void c(float f10) {
        this.V.Y0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.R) {
            mt editText = this.V.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.T - editText.getScrollY()) + (this.S - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new q60(editText, 18));
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.U = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(gr.f);
            ofFloat.start();
            this.R = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ut
    public final void f() {
        super.f();
        wy emojiView = getEmojiView();
        rp0 rp0Var = this.V;
        if (emojiView != null) {
            emojiView.s0 = false;
            emojiView.t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(rp0Var.C0.d);
        }
        FrameLayout frameLayout = rp0Var.Y;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        uo0 uo0Var = rp0Var.c;
        if (uo0Var != null) {
            uo0Var.bringToFront();
        }
        uo0 uo0Var2 = rp0Var.f;
        if (uo0Var2 != null) {
            uo0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.ut
    public final void q(int i9, int i10) {
        rp0 rp0Var = this.V;
        uo0 uo0Var = rp0Var.c;
        if (TextUtils.isEmpty(getEditText().getText())) {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.R = false;
        } else {
            this.R = true;
            this.S = getEditText().getMeasuredHeight();
            this.T = getEditText().getScrollY();
            invalidate();
        }
        rp0Var.r0 = uo0Var.getTop() + rp0Var.q0;
        uo0Var.invalidate();
    }
}
