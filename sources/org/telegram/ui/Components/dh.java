package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dh extends wt {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ bi c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(bi biVar, Context context, ph phVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, phVar, null, 1, true, p6Var);
        this.c0 = biVar;
    }

    @Override // org.telegram.ui.Components.wt
    public final void c(float f7) {
        bi biVar = this.c0;
        biVar.a4 = f7;
        ah ahVar = biVar.x2;
        ahVar.setTranslationY(f7);
        ahVar.invalidate();
        biVar.T0();
        biVar.L1(biVar.s2, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            mt editText = this.c0.y2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ag.p2(14, this, editText));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(gr.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.wt
    public final void e() {
        super/*org.telegram.ui.ActionBar.z2*/.dismiss();
    }

    @Override // org.telegram.ui.Components.wt
    public final void f() {
        super.f();
        vy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.i0.n);
        }
    }

    @Override // org.telegram.ui.Components.wt
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.k2 k2Var = this.c0.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            org.telegram.ui.un.t8(menu, ((org.telegram.ui.un) k2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        bi biVar = this.c0;
        dh dhVar = biVar.y2;
        if (!biVar.o3) {
            if (motionEvent.getX() <= dhVar.getEditText().getLeft() || motionEvent.getX() >= dhVar.getEditText().getRight() || motionEvent.getY() <= dhVar.getEditText().getTop() || motionEvent.getY() >= dhVar.getEditText().getBottom()) {
                biVar.g1(dhVar.getEditText(), false);
            } else {
                biVar.g1(dhVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.c0.I1();
    }

    @Override // org.telegram.ui.Components.wt
    public final void q(int i10, int i11) {
        bi biVar = this.c0;
        ah ahVar = biVar.x2;
        boolean z10 = false;
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
        if (!biVar.T1) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            biVar.A1(z10);
        }
        biVar.Q3 = ahVar.getTop() + biVar.P3;
        ahVar.invalidate();
        biVar.I1();
    }
}
