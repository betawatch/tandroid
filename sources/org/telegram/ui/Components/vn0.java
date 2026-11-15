package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class vn0 extends rt {
    public boolean W;
    public int a0;
    public int b0;
    public ValueAnimator c0;
    public final /* synthetic */ po0 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn0(po0 po0Var, Context context, co0 co0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, co0Var, null, 1, true, e6Var);
        this.d0 = po0Var;
    }

    @Override // org.telegram.ui.Components.rt
    public final void c(float f10) {
        this.d0.Z0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            ft editText = this.d0.o1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.b0 - editText.getScrollY()) + (this.a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new f60(editText, 17));
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(er.f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.rt
    public final void f() {
        super.f();
        ly emojiView = getEmojiView();
        po0 po0Var = this.d0;
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(po0Var.C2.d);
        }
        FrameLayout frameLayout = po0Var.Y1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        un0 un0Var = po0Var.n1;
        if (un0Var != null) {
            un0Var.bringToFront();
        }
        un0 un0Var2 = po0Var.q1;
        if (un0Var2 != null) {
            un0Var2.bringToFront();
        }
    }

    @Override // org.telegram.ui.Components.rt
    public final void q(int i7, int i10) {
        po0 po0Var = this.d0;
        un0 un0Var = po0Var.n1;
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
        po0Var.r2 = un0Var.getTop() + po0Var.q2;
        un0Var.invalidate();
    }
}
