package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qh extends fu {
    public boolean S;
    public int T;
    public int U;
    public ValueAnimator V;
    public final /* synthetic */ mi W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(mi miVar, Context context, ci ciVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, ciVar, null, 1, true, g6Var);
        this.W = miVar;
    }

    @Override // org.telegram.ui.Components.fu
    public final void c(float f10) {
        mi miVar = this.W;
        miVar.d2 = f10;
        mh mhVar = miVar.A0;
        mhVar.setTranslationY(f10);
        mhVar.invalidate();
        miVar.g1();
        miVar.X1(miVar.v0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.S) {
            xt editText = this.W.B0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.U - editText.getScrollY()) + (this.T - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new bg.a(13, this, editText));
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.V = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(pr.f);
            ofFloat.start();
            this.S = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.fu
    public final void e() {
        super/*org.telegram.ui.ActionBar.h3*/.dismiss();
    }

    @Override // org.telegram.ui.Components.fu
    public final void f() {
        super.f();
        mz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.t0 = false;
            emojiView.u2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.fu
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.p2 p2Var = this.W.c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) p2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mi miVar = this.W;
        qh qhVar = miVar.B0;
        if (!miVar.r1) {
            if (motionEvent.getX() <= qhVar.getEditText().getLeft() || motionEvent.getX() >= qhVar.getEditText().getRight() || motionEvent.getY() <= qhVar.getEditText().getTop() || motionEvent.getY() >= qhVar.getEditText().getBottom()) {
                miVar.t1(qhVar.getEditText(), false);
            } else {
                miVar.t1(qhVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.W.U1();
    }

    @Override // org.telegram.ui.Components.fu
    public final void q(int i10, int i11) {
        mi miVar = this.W;
        mh mhVar = miVar.A0;
        boolean z4 = false;
        if (TextUtils.isEmpty(getEditText().getText())) {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.S = false;
        } else {
            this.S = true;
            this.T = getEditText().getMeasuredHeight();
            this.U = getEditText().getScrollY();
            invalidate();
        }
        if (!miVar.Z) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z4 = true;
            }
            miVar.M1(z4);
        }
        miVar.T1 = mhVar.getTop() + miVar.S1;
        mhVar.invalidate();
        miVar.U1();
    }
}
