package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class bq0 extends ju {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ wq0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq0(wq0 wq0Var, Context context, hq0 hq0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, hq0Var, null, 1, true, f6Var);
        this.c0 = wq0Var;
    }

    @Override // org.telegram.ui.Components.ju
    public final void c(float f7) {
        this.c0.Y0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            bu editText = this.c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new s70(editText, 18));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(qr.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ju
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
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

    @Override // org.telegram.ui.Components.ju
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
