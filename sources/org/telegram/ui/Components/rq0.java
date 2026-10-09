package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class rq0 extends zu {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ mr0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq0(mr0 mr0Var, Context context, xq0 xq0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, xq0Var, null, 1, true, e6Var);
        this.c0 = mr0Var;
    }

    @Override // org.telegram.ui.Components.zu
    public final void c(float f7) {
        this.c0.Z0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            ru editText = this.c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new j80(editText, 19));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(hs.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.zu
    public final void f() {
        super.f();
        a00 emojiView = getEmojiView();
        mr0 mr0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(mr0Var.G0.d);
        }
        FrameLayout frameLayout = mr0Var.c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        qq0 qq0Var = mr0Var.c;
        if (qq0Var != null) {
            qq0Var.bringToFront();
        }
        qq0 qq0Var2 = mr0Var.f;
        if (qq0Var2 != null) {
            qq0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.zu
    public final void q(int i10, int i11) {
        mr0 mr0Var = this.c0;
        qq0 qq0Var = mr0Var.c;
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
        mr0Var.v0 = qq0Var.getTop() + mr0Var.u0;
        qq0Var.invalidate();
    }
}
