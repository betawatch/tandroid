package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class bq0 extends lu {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ wq0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq0(wq0 wq0Var, Context context, hq0 hq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, hq0Var, null, 1, true, d6Var);
        this.c0 = wq0Var;
    }

    @Override // org.telegram.ui.Components.lu
    public final void c(float f7) {
        this.c0.Y0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            du editText = this.c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new u70(editText, 18));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(sr.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.lu
    public final void f() {
        super.f();
        mz emojiView = getEmojiView();
        wq0 wq0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(wq0Var.G0.d);
        }
        FrameLayout frameLayout = wq0Var.c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        aq0 aq0Var = wq0Var.c;
        if (aq0Var != null) {
            aq0Var.bringToFront();
        }
        aq0 aq0Var2 = wq0Var.f;
        if (aq0Var2 != null) {
            aq0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.lu
    public final void q(int i10, int i11) {
        wq0 wq0Var = this.c0;
        aq0 aq0Var = wq0Var.c;
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
        wq0Var.v0 = aq0Var.getTop() + wq0Var.u0;
        aq0Var.invalidate();
    }
}
