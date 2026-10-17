package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class iq0 extends qu {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ dr0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq0(dr0 dr0Var, Context context, oq0 oq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, oq0Var, null, 1, true, d6Var);
        this.c0 = dr0Var;
    }

    @Override // org.telegram.ui.Components.qu
    public final void c(float f7) {
        this.c0.Z0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            iu editText = this.c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new b80(editText, 19));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(bs.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.qu
    public final void f() {
        super.f();
        tz emojiView = getEmojiView();
        dr0 dr0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(dr0Var.G0.d);
        }
        FrameLayout frameLayout = dr0Var.c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        hq0 hq0Var = dr0Var.c;
        if (hq0Var != null) {
            hq0Var.bringToFront();
        }
        hq0 hq0Var2 = dr0Var.f;
        if (hq0Var2 != null) {
            hq0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.qu
    public final void q(int i10, int i11) {
        dr0 dr0Var = this.c0;
        hq0 hq0Var = dr0Var.c;
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
        dr0Var.v0 = hq0Var.getTop() + dr0Var.u0;
        hq0Var.invalidate();
    }
}
