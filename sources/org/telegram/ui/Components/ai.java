package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ai extends vu {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ vi c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(vi viVar, Context context, li liVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, liVar, null, 1, true, c6Var);
        this.c0 = viVar;
    }

    @Override // org.telegram.ui.Components.vu
    public final void c(float f7) {
        vi viVar = this.c0;
        viVar.j2 = f7;
        xh xhVar = viVar.G0;
        xhVar.setTranslationY(f7);
        xhVar.invalidate();
        viVar.i1();
        viVar.b2(viVar.B0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            nu editText = this.c0.H0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ah.l0(15, this, editText));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(es.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.vu
    public final void e() {
        super/*org.telegram.ui.ActionBar.e3*/.dismiss();
    }

    @Override // org.telegram.ui.Components.vu
    public final void f() {
        super.f();
        wz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.vu
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.m2 m2Var = this.c0.f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            org.telegram.ui.fo.n8(menu, ((org.telegram.ui.fo) m2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vi viVar = this.c0;
        ai aiVar = viVar.H0;
        if (!viVar.x1) {
            if (motionEvent.getX() <= aiVar.getEditText().getLeft() || motionEvent.getX() >= aiVar.getEditText().getRight() || motionEvent.getY() <= aiVar.getEditText().getTop() || motionEvent.getY() >= aiVar.getEditText().getBottom()) {
                viVar.w1(aiVar.getEditText(), false);
            } else {
                viVar.w1(aiVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.c0.Y1();
    }

    @Override // org.telegram.ui.Components.vu
    public final void q(int i10, int i11) {
        vi viVar = this.c0;
        xh xhVar = viVar.G0;
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
        if (!viVar.c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            viVar.Q1(z10);
        }
        viVar.Z1 = xhVar.getTop() + viVar.Y1;
        xhVar.invalidate();
        viVar.Y1();
    }
}
