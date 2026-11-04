package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class un0 extends jt {
    public boolean W;
    public int a0;
    public int b0;
    public ValueAnimator c0;
    public final /* synthetic */ oo0 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un0(oo0 oo0Var, Context context, bo0 bo0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, bo0Var, null, 1, true, e6Var);
        this.d0 = oo0Var;
    }

    @Override // org.telegram.ui.Components.jt
    public final void c(float f10) {
        this.d0.Z0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            xs editText = this.d0.l1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.b0 - editText.getScrollY()) + (this.a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new y50(editText, 18));
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(xq.f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.jt
    public final void f() {
        super.f();
        ey emojiView = getEmojiView();
        oo0 oo0Var = this.d0;
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(oo0Var.z2.d);
        }
        FrameLayout frameLayout = oo0Var.V1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        tn0 tn0Var = oo0Var.k1;
        if (tn0Var != null) {
            tn0Var.bringToFront();
        }
        tn0 tn0Var2 = oo0Var.n1;
        if (tn0Var2 != null) {
            tn0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.jt
    public final void q(int i3, int i10) {
        oo0 oo0Var = this.d0;
        tn0 tn0Var = oo0Var.k1;
        if (TextUtils.isEmpty(getEditText().getText())) {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.W = false;
        } else {
            this.W = true;
            this.a0 = getEditText().getMeasuredHeight();
            this.b0 = getEditText().getScrollY();
            invalidate();
        }
        oo0Var.o2 = tn0Var.getTop() + oo0Var.n2;
        tn0Var.invalidate();
    }
}
