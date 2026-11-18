package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class vh extends wt {
    public boolean W;
    public int a0;
    public int b0;
    public ValueAnimator c0;
    public final /* synthetic */ si d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(si siVar, Context context, fi fiVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, fiVar, null, 1, true, i6Var);
        this.d0 = siVar;
    }

    @Override // org.telegram.ui.Components.wt
    public final void c(float f10) {
        si siVar = this.d0;
        siVar.e4 = f10;
        sh shVar = siVar.B2;
        shVar.setTranslationY(f10);
        shVar.invalidate();
        siVar.V0();
        siVar.N1(siVar.w2, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            mt editText = this.d0.C2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.b0 - editText.getScrollY()) + (this.a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ch.w(14, this, editText));
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(lr.f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.wt
    public final void e() {
        super/*org.telegram.ui.ActionBar.x2*/.dismiss();
    }

    @Override // org.telegram.ui.Components.wt
    public final void f() {
        super.f();
        ry emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.n);
        }
    }

    @Override // org.telegram.ui.Components.wt
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.h2 h2Var = this.d0.a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) h2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        si siVar = this.d0;
        vh vhVar = siVar.C2;
        if (!siVar.s3) {
            if (motionEvent.getX() <= vhVar.getEditText().getLeft() || motionEvent.getX() >= vhVar.getEditText().getRight() || motionEvent.getY() <= vhVar.getEditText().getTop() || motionEvent.getY() >= vhVar.getEditText().getBottom()) {
                siVar.i1(vhVar.getEditText(), false);
            } else {
                siVar.i1(vhVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.d0.K1();
    }

    @Override // org.telegram.ui.Components.wt
    public final void q(int i7, int i10) {
        si siVar = this.d0;
        sh shVar = siVar.B2;
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
        if (!siVar.X1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            siVar.C1(z10);
        }
        siVar.U3 = shVar.getTop() + siVar.T3;
        shVar.invalidate();
        siVar.K1();
    }
}
