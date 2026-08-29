package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gp0 extends au {
    public boolean R;
    public int S;
    public int T;
    public ValueAnimator U;
    public final /* synthetic */ dq0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp0(dq0 dq0Var, Context context, np0 np0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, np0Var, null, 1, true, c6Var);
        this.V = dq0Var;
    }

    @Override // org.telegram.ui.Components.au
    public final void c(float f9) {
        this.V.Y0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.R) {
            st editText = this.V.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.T - editText.getScrollY()) + (this.S - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new d70(editText, 18));
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.U = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(jr.f);
            ofFloat.start();
            this.R = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.au
    public final void f() {
        super.f();
        fz emojiView = getEmojiView();
        dq0 dq0Var = this.V;
        if (emojiView != null) {
            emojiView.s0 = false;
            emojiView.t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(dq0Var.C0.d);
        }
        FrameLayout frameLayout = dq0Var.Y;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        fp0 fp0Var = dq0Var.c;
        if (fp0Var != null) {
            fp0Var.bringToFront();
        }
        fp0 fp0Var2 = dq0Var.f;
        if (fp0Var2 != null) {
            fp0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.au
    public final void q(int i10, int i11) {
        dq0 dq0Var = this.V;
        fp0 fp0Var = dq0Var.c;
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
        dq0Var.r0 = fp0Var.getTop() + dq0Var.q0;
        fp0Var.invalidate();
    }
}
