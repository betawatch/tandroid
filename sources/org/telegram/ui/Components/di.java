package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class di extends zu {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ yi c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(yi yiVar, Context context, oi oiVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, oiVar, null, 1, true, e6Var);
        this.c0 = yiVar;
    }

    @Override // org.telegram.ui.Components.zu
    public final void c(float f7) {
        yi yiVar = this.c0;
        yiVar.j2 = f7;
        ai aiVar = yiVar.G0;
        aiVar.setTranslationY(f7);
        aiVar.invalidate();
        yiVar.i1();
        yiVar.b2(yiVar.B0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            ru editText = this.c0.H0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ai.x(14, this, editText));
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
    public final void e() {
        super/*org.telegram.ui.ActionBar.f3*/.dismiss();
    }

    @Override // org.telegram.ui.Components.zu
    public final void f() {
        super.f();
        a00 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.zu
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.c0.f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn.n8(menu, ((org.telegram.ui.zn) n2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        yi yiVar = this.c0;
        di diVar = yiVar.H0;
        if (!yiVar.x1) {
            if (motionEvent.getX() <= diVar.getEditText().getLeft() || motionEvent.getX() >= diVar.getEditText().getRight() || motionEvent.getY() <= diVar.getEditText().getTop() || motionEvent.getY() >= diVar.getEditText().getBottom()) {
                yiVar.w1(diVar.getEditText(), false);
            } else {
                yiVar.w1(diVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.c0.Y1();
    }

    @Override // org.telegram.ui.Components.zu
    public final void q(int i10, int i11) {
        yi yiVar = this.c0;
        ai aiVar = yiVar.G0;
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
        if (!yiVar.c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            yiVar.Q1(z10);
        }
        yiVar.Z1 = aiVar.getTop() + yiVar.Y1;
        aiVar.invalidate();
        yiVar.Y1();
    }
}
