package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rq0 extends ru {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ mr0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq0(mr0 mr0Var, Context context, xq0 xq0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, xq0Var, null, 1, true, u6Var);
        this.c0 = mr0Var;
    }

    @Override // org.telegram.ui.Components.ru
    public final void c(float f7) {
        this.c0.b1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            ju editText = this.c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new e80(editText, 19));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(ds.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ru
    public final void f() {
        super.f();
        sz emojiView = getEmojiView();
        mr0 mr0Var = this.c0;
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(mr0Var.H0.d);
        }
        FrameLayout frameLayout = mr0Var.d0;
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

    @Override // org.telegram.ui.Components.ru
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
        mr0Var.w0 = qq0Var.getTop() + mr0Var.v0;
        qq0Var.invalidate();
    }
}
