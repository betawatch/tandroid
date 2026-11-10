package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fh extends kt {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ ci c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh(ci ciVar, Context context, ph phVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, phVar, null, 1, true, h6Var);
        this.c0 = ciVar;
    }

    @Override // org.telegram.ui.Components.kt
    public final void c(float f10) {
        ci ciVar = this.c0;
        ciVar.d4 = f10;
        ch chVar = ciVar.A2;
        chVar.setTranslationY(f10);
        chVar.invalidate();
        ciVar.U0();
        ciVar.M1(ciVar.v2, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            ys editText = this.c0.B2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new bi.de(15, this, editText));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(wq.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.kt
    public final void e() {
        super/*org.telegram.ui.ActionBar.w2*/.dismiss();
    }

    @Override // org.telegram.ui.Components.kt
    public final void f() {
        super.f();
        gy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.n);
        }
    }

    @Override // org.telegram.ui.Components.kt
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.f2 f2Var = this.c0.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            org.telegram.ui.cn.B8(menu, ((org.telegram.ui.cn) f2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ci ciVar = this.c0;
        fh fhVar = ciVar.B2;
        if (!ciVar.r3) {
            if (motionEvent.getX() <= fhVar.getEditText().getLeft() || motionEvent.getX() >= fhVar.getEditText().getRight() || motionEvent.getY() <= fhVar.getEditText().getTop() || motionEvent.getY() >= fhVar.getEditText().getBottom()) {
                ciVar.h1(fhVar.getEditText(), false);
            } else {
                ciVar.h1(fhVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.c0.J1();
    }

    @Override // org.telegram.ui.Components.kt
    public final void q(int i7, int i10) {
        ci ciVar = this.c0;
        ch chVar = ciVar.A2;
        boolean z9 = false;
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
        if (!ciVar.W1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z9 = true;
            }
            ciVar.B1(z9);
        }
        ciVar.T3 = chVar.getTop() + ciVar.S3;
        chVar.invalidate();
        ciVar.J1();
    }
}
