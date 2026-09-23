package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class bi extends ku {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ wi c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(wi wiVar, Context context, mi miVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, miVar, null, 1, true, d6Var);
        this.c0 = wiVar;
    }

    @Override // org.telegram.ui.Components.ku
    public final void c(float f7) {
        wi wiVar = this.c0;
        wiVar.g2 = f7;
        yh yhVar = wiVar.D0;
        yhVar.setTranslationY(f7);
        yhVar.invalidate();
        wiVar.g1();
        wiVar.X1(wiVar.y0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            cu editText = this.c0.E0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ai.x(14, this, editText));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(rr.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ku
    public final void e() {
        super/*org.telegram.ui.ActionBar.f3*/.dismiss();
    }

    @Override // org.telegram.ui.Components.ku
    public final void f() {
        super.f();
        lz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.ku
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.c0.f0;
        if (n2Var instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) n2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wi wiVar = this.c0;
        bi biVar = wiVar.E0;
        if (!wiVar.u1) {
            if (motionEvent.getX() <= biVar.getEditText().getLeft() || motionEvent.getX() >= biVar.getEditText().getRight() || motionEvent.getY() <= biVar.getEditText().getTop() || motionEvent.getY() >= biVar.getEditText().getBottom()) {
                wiVar.t1(biVar.getEditText(), false);
            } else {
                wiVar.t1(biVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.c0.U1();
    }

    @Override // org.telegram.ui.Components.ku
    public final void q(int i10, int i11) {
        wi wiVar = this.c0;
        yh yhVar = wiVar.D0;
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
        if (!wiVar.c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            wiVar.M1(z10);
        }
        wiVar.W1 = yhVar.getTop() + wiVar.V1;
        yhVar.invalidate();
        wiVar.U1();
    }
}
