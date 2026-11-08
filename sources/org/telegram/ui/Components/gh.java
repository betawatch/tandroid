package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class gh extends lt {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ di c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(di diVar, Context context, qh qhVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, qhVar, null, 1, true, f6Var);
        this.c0 = diVar;
    }

    @Override // org.telegram.ui.Components.lt
    public final void c(float f10) {
        di diVar = this.c0;
        diVar.a4 = f10;
        dh dhVar = diVar.x2;
        dhVar.setTranslationY(f10);
        dhVar.invalidate();
        diVar.U0();
        diVar.M1(diVar.s2, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            zs editText = this.c0.y2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new bi.de(15, this, editText));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(xq.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.lt
    public final void e() {
        super/*org.telegram.ui.ActionBar.v2*/.dismiss();
    }

    @Override // org.telegram.ui.Components.lt
    public final void f() {
        super.f();
        hy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.n);
        }
    }

    @Override // org.telegram.ui.Components.lt
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.f2 f2Var = this.c0.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            org.telegram.ui.an.A8(menu, ((org.telegram.ui.an) f2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        di diVar = this.c0;
        gh ghVar = diVar.y2;
        if (!diVar.o3) {
            if (motionEvent.getX() <= ghVar.getEditText().getLeft() || motionEvent.getX() >= ghVar.getEditText().getRight() || motionEvent.getY() <= ghVar.getEditText().getTop() || motionEvent.getY() >= ghVar.getEditText().getBottom()) {
                diVar.h1(ghVar.getEditText(), false);
            } else {
                diVar.h1(ghVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.c0.J1();
    }

    @Override // org.telegram.ui.Components.lt
    public final void q(int i7, int i10) {
        di diVar = this.c0;
        dh dhVar = diVar.x2;
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
        if (!diVar.T1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z9 = true;
            }
            diVar.B1(z9);
        }
        diVar.Q3 = dhVar.getTop() + diVar.P3;
        dhVar.invalidate();
        diVar.J1();
    }
}
