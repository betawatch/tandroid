package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class nh extends rt {
    public boolean W;
    public int a0;
    public int b0;
    public ValueAnimator c0;
    public final /* synthetic */ ki d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh(ki kiVar, Context context, xh xhVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, xhVar, null, 1, true, e6Var);
        this.d0 = kiVar;
    }

    @Override // org.telegram.ui.Components.rt
    public final void c(float f10) {
        ki kiVar = this.d0;
        kiVar.e4 = f10;
        kh khVar = kiVar.B2;
        khVar.setTranslationY(f10);
        khVar.invalidate();
        kiVar.U0();
        kiVar.M1(kiVar.w2, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            ft editText = this.d0.C2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.b0 - editText.getScrollY()) + (this.a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ch.v(14, this, editText));
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
    public final void e() {
        super/*org.telegram.ui.ActionBar.u2*/.dismiss();
    }

    @Override // org.telegram.ui.Components.rt
    public final void f() {
        super.f();
        ly emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.n);
        }
    }

    @Override // org.telegram.ui.Components.rt
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.e2 e2Var = this.d0.a2;
        if (e2Var instanceof org.telegram.ui.an) {
            org.telegram.ui.an.C8(menu, ((org.telegram.ui.an) e2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ki kiVar = this.d0;
        nh nhVar = kiVar.C2;
        if (!kiVar.s3) {
            if (motionEvent.getX() <= nhVar.getEditText().getLeft() || motionEvent.getX() >= nhVar.getEditText().getRight() || motionEvent.getY() <= nhVar.getEditText().getTop() || motionEvent.getY() >= nhVar.getEditText().getBottom()) {
                kiVar.h1(nhVar.getEditText(), false);
            } else {
                kiVar.h1(nhVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.d0.J1();
    }

    @Override // org.telegram.ui.Components.rt
    public final void q(int i7, int i10) {
        ki kiVar = this.d0;
        kh khVar = kiVar.B2;
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
        if (!kiVar.X1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            kiVar.B1(z10);
        }
        kiVar.U3 = khVar.getTop() + kiVar.T3;
        khVar.invalidate();
        kiVar.J1();
    }
}
