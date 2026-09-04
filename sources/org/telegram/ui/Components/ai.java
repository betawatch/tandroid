package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ai extends hu {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ vi c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(vi viVar, Context context, li liVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, liVar, null, 1, true, f6Var);
        this.c0 = viVar;
    }

    @Override // org.telegram.ui.Components.hu
    public final void c(float f7) {
        vi viVar = this.c0;
        viVar.g2 = f7;
        xh xhVar = viVar.D0;
        xhVar.setTranslationY(f7);
        xhVar.invalidate();
        viVar.g1();
        viVar.X1(viVar.y0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            zt editText = this.c0.E0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ah.m0(15, this, editText));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(pr.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.hu
    public final void e() {
        super/*org.telegram.ui.ActionBar.f3*/.dismiss();
    }

    @Override // org.telegram.ui.Components.hu
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.hu
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.c0.f0;
        if (n2Var instanceof org.telegram.ui.co) {
            org.telegram.ui.co.k8(menu, ((org.telegram.ui.co) n2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vi viVar = this.c0;
        ai aiVar = viVar.E0;
        if (!viVar.u1) {
            if (motionEvent.getX() <= aiVar.getEditText().getLeft() || motionEvent.getX() >= aiVar.getEditText().getRight() || motionEvent.getY() <= aiVar.getEditText().getTop() || motionEvent.getY() >= aiVar.getEditText().getBottom()) {
                viVar.t1(aiVar.getEditText(), false);
            } else {
                viVar.t1(aiVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.c0.U1();
    }

    @Override // org.telegram.ui.Components.hu
    public final void q(int i10, int i11) {
        vi viVar = this.c0;
        xh xhVar = viVar.D0;
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
            viVar.M1(z10);
        }
        viVar.W1 = xhVar.getTop() + viVar.V1;
        xhVar.invalidate();
        viVar.U1();
    }
}
