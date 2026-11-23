package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fo0 extends wt {
    public boolean W;
    public int a0;
    public int b0;
    public ValueAnimator c0;
    public final /* synthetic */ zo0 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo0(zo0 zo0Var, Context context, mo0 mo0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, mo0Var, null, 1, true, i6Var);
        this.d0 = zo0Var;
    }

    @Override // org.telegram.ui.Components.wt
    public final void c(float f10) {
        this.d0.a1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            mt editText = this.d0.o1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.b0 - editText.getScrollY()) + (this.a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new e60(editText, 19));
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(kr.f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.wt
    public final void f() {
        super.f();
        qy emojiView = getEmojiView();
        zo0 zo0Var = this.d0;
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(zo0Var.C2.d);
        }
        FrameLayout frameLayout = zo0Var.Y1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        eo0 eo0Var = zo0Var.n1;
        if (eo0Var != null) {
            eo0Var.bringToFront();
        }
        eo0 eo0Var2 = zo0Var.q1;
        if (eo0Var2 != null) {
            eo0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.wt
    public final void q(int i7, int i10) {
        zo0 zo0Var = this.d0;
        eo0 eo0Var = zo0Var.n1;
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
        zo0Var.r2 = eo0Var.getTop() + zo0Var.q2;
        eo0Var.invalidate();
    }
}
