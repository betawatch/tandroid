package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vo0 extends tt {
    public boolean R;
    public int S;
    public int T;
    public ValueAnimator U;
    public final /* synthetic */ sp0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo0(sp0 sp0Var, Context context, cp0 cp0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, cp0Var, null, 1, true, c6Var);
        this.V = sp0Var;
    }

    @Override // org.telegram.ui.Components.tt
    public final void c(float f10) {
        this.V.Y0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.R) {
            lt editText = this.V.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.T - editText.getScrollY()) + (this.S - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new v60(editText, 18));
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.U = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(er.f);
            ofFloat.start();
            this.R = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.tt
    public final void f() {
        super.f();
        yy emojiView = getEmojiView();
        sp0 sp0Var = this.V;
        if (emojiView != null) {
            emojiView.s0 = false;
            emojiView.t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(sp0Var.C0.d);
        }
        FrameLayout frameLayout = sp0Var.Y;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        uo0 uo0Var = sp0Var.c;
        if (uo0Var != null) {
            uo0Var.bringToFront();
        }
        uo0 uo0Var2 = sp0Var.f;
        if (uo0Var2 != null) {
            uo0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.tt
    public final void q(int i10, int i11) {
        sp0 sp0Var = this.V;
        uo0 uo0Var = sp0Var.c;
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
        sp0Var.r0 = uo0Var.getTop() + sp0Var.q0;
        uo0Var.invalidate();
    }
}
