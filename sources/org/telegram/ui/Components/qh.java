package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qh extends ut {
    public boolean R;
    public int S;
    public int T;
    public ValueAnimator U;
    public final /* synthetic */ ki V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(ki kiVar, Context context, ai aiVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, aiVar, null, 1, true, b6Var);
        this.V = kiVar;
    }

    @Override // org.telegram.ui.Components.ut
    public final void c(float f10) {
        ki kiVar = this.V;
        kiVar.c2 = f10;
        mh mhVar = kiVar.z0;
        mhVar.setTranslationY(f10);
        mhVar.invalidate();
        kiVar.g1();
        kiVar.X1(kiVar.u0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.R) {
            mt editText = this.V.A0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.T - editText.getScrollY()) + (this.S - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new f2.g(10, this, editText));
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.U = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(gr.f);
            ofFloat.start();
            this.R = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ut
    public final void e() {
        super/*org.telegram.ui.ActionBar.f3*/.dismiss();
    }

    @Override // org.telegram.ui.Components.ut
    public final void f() {
        super.f();
        wy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.s0 = false;
            emojiView.t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.ut
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.V.b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            org.telegram.ui.qn.k8(menu, ((org.telegram.ui.qn) o2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ki kiVar = this.V;
        qh qhVar = kiVar.A0;
        if (!kiVar.q1) {
            if (motionEvent.getX() <= qhVar.getEditText().getLeft() || motionEvent.getX() >= qhVar.getEditText().getRight() || motionEvent.getY() <= qhVar.getEditText().getTop() || motionEvent.getY() >= qhVar.getEditText().getBottom()) {
                kiVar.t1(qhVar.getEditText(), false);
            } else {
                kiVar.t1(qhVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.V.U1();
    }

    @Override // org.telegram.ui.Components.ut
    public final void q(int i9, int i10) {
        ki kiVar = this.V;
        mh mhVar = kiVar.z0;
        boolean z10 = false;
        if (TextUtils.isEmpty(getEditText().getText())) {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.R = false;
        } else {
            this.R = true;
            this.S = getEditText().getMeasuredHeight();
            this.T = getEditText().getScrollY();
            invalidate();
        }
        if (!kiVar.Y) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            kiVar.M1(z10);
        }
        kiVar.S1 = mhVar.getTop() + kiVar.R1;
        mhVar.invalidate();
        kiVar.U1();
    }
}
