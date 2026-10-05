package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class zh extends mu {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ xi c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(xi xiVar, Context context, ki kiVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, kiVar, null, 1, true, d6Var);
        this.c0 = xiVar;
    }

    @Override // org.telegram.ui.Components.mu
    public final void c(float f7) {
        xi xiVar = this.c0;
        xiVar.g2 = f7;
        wh whVar = xiVar.D0;
        whVar.setTranslationY(f7);
        whVar.invalidate();
        xiVar.g1();
        xiVar.W1(xiVar.y0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            eu editText = this.c0.E0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ai.x(14, this, editText));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(tr.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.mu
    public final void e() {
        super/*org.telegram.ui.ActionBar.f3*/.dismiss();
    }

    @Override // org.telegram.ui.Components.mu
    public final void f() {
        super.f();
        nz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.mu
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.c0.f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            org.telegram.ui.yn.k8(menu, ((org.telegram.ui.yn) n2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xi xiVar = this.c0;
        zh zhVar = xiVar.E0;
        if (!xiVar.u1) {
            if (motionEvent.getX() <= zhVar.getEditText().getLeft() || motionEvent.getX() >= zhVar.getEditText().getRight() || motionEvent.getY() <= zhVar.getEditText().getTop() || motionEvent.getY() >= zhVar.getEditText().getBottom()) {
                xiVar.s1(zhVar.getEditText(), false);
            } else {
                xiVar.s1(zhVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.c0.T1();
    }

    @Override // org.telegram.ui.Components.mu
    public final void q(int i10, int i11) {
        xi xiVar = this.c0;
        wh whVar = xiVar.D0;
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
        if (!xiVar.c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            xiVar.L1(z10);
        }
        xiVar.W1 = whVar.getTop() + xiVar.V1;
        whVar.invalidate();
        xiVar.T1();
    }
}
