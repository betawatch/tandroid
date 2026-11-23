package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class xh extends yt {
    public boolean W;
    public int a0;
    public int b0;
    public ValueAnimator c0;
    public final /* synthetic */ ui d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(ui uiVar, Context context, hi hiVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, hiVar, null, 1, true, h6Var);
        this.d0 = uiVar;
    }

    @Override // org.telegram.ui.Components.yt
    public final void c(float f10) {
        ui uiVar = this.d0;
        uiVar.e4 = f10;
        uh uhVar = uiVar.B2;
        uhVar.setTranslationY(f10);
        uhVar.invalidate();
        uiVar.V0();
        uiVar.N1(uiVar.w2, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            ot editText = this.d0.C2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.b0 - editText.getScrollY()) + (this.a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ch.w(14, this, editText));
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(nr.f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.yt
    public final void e() {
        super/*org.telegram.ui.ActionBar.w2*/.dismiss();
    }

    @Override // org.telegram.ui.Components.yt
    public final void f() {
        super.f();
        ty emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.n);
        }
    }

    @Override // org.telegram.ui.Components.yt
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.g2 g2Var = this.d0.a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) g2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ui uiVar = this.d0;
        xh xhVar = uiVar.C2;
        if (!uiVar.s3) {
            if (motionEvent.getX() <= xhVar.getEditText().getLeft() || motionEvent.getX() >= xhVar.getEditText().getRight() || motionEvent.getY() <= xhVar.getEditText().getTop() || motionEvent.getY() >= xhVar.getEditText().getBottom()) {
                uiVar.i1(xhVar.getEditText(), false);
            } else {
                uiVar.i1(xhVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.d0.K1();
    }

    @Override // org.telegram.ui.Components.yt
    public final void q(int i7, int i10) {
        ui uiVar = this.d0;
        uh uhVar = uiVar.B2;
        boolean z10 = false;
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
        if (!uiVar.X1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            uiVar.C1(z10);
        }
        uiVar.U3 = uhVar.getTop() + uiVar.T3;
        uhVar.invalidate();
        uiVar.K1();
    }
}
