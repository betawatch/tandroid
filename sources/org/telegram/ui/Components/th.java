package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class th extends au {
    public boolean R;
    public int S;
    public int T;
    public ValueAnimator U;
    public final /* synthetic */ ni V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(ni niVar, Context context, di diVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, diVar, null, 1, true, c6Var);
        this.V = niVar;
    }

    @Override // org.telegram.ui.Components.au
    public final void c(float f9) {
        ni niVar = this.V;
        niVar.c2 = f9;
        ph phVar = niVar.z0;
        phVar.setTranslationY(f9);
        phVar.invalidate();
        niVar.g1();
        niVar.X1(niVar.u0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.R) {
            st editText = this.V.A0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.T - editText.getScrollY()) + (this.S - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new bg.b3(12, this, editText));
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.U = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(jr.f);
            ofFloat.start();
            this.R = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.au
    public final void e() {
        super/*org.telegram.ui.ActionBar.f3*/.dismiss();
    }

    @Override // org.telegram.ui.Components.au
    public final void f() {
        super.f();
        fz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.s0 = false;
            emojiView.t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.au
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.V.b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            org.telegram.ui.tn.k8(menu, ((org.telegram.ui.tn) o2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ni niVar = this.V;
        th thVar = niVar.A0;
        if (!niVar.q1) {
            if (motionEvent.getX() <= thVar.getEditText().getLeft() || motionEvent.getX() >= thVar.getEditText().getRight() || motionEvent.getY() <= thVar.getEditText().getTop() || motionEvent.getY() >= thVar.getEditText().getBottom()) {
                niVar.t1(thVar.getEditText(), false);
            } else {
                niVar.t1(thVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.U1();
    }

    @Override // org.telegram.ui.Components.au
    public final void q(int i10, int i11) {
        ni niVar = this.V;
        ph phVar = niVar.z0;
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
        if (!niVar.Y) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            niVar.M1(z10);
        }
        niVar.S1 = phVar.getTop() + niVar.R1;
        phVar.invalidate();
        niVar.U1();
    }
}
