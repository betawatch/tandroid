package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dh extends jt {
    public boolean W;
    public int a0;
    public int b0;
    public ValueAnimator c0;
    public final /* synthetic */ bi d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(bi biVar, Context context, oh ohVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, ohVar, null, 1, true, e6Var);
        this.d0 = biVar;
    }

    @Override // org.telegram.ui.Components.jt
    public final void c(float f10) {
        bi biVar = this.d0;
        biVar.b4 = f10;
        ah ahVar = biVar.y2;
        ahVar.setTranslationY(f10);
        ahVar.invalidate();
        biVar.U0();
        biVar.M1(biVar.t2, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            xs editText = this.d0.z2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.b0 - editText.getScrollY()) + (this.a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ci.uc(15, this, editText));
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(xq.f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.jt
    public final void e() {
        super/*org.telegram.ui.ActionBar.t2*/.dismiss();
    }

    @Override // org.telegram.ui.Components.jt
    public final void f() {
        super.f();
        ey emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.n);
        }
    }

    @Override // org.telegram.ui.Components.jt
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.d2 d2Var = this.d0.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            org.telegram.ui.wm.A8(menu, ((org.telegram.ui.wm) d2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        bi biVar = this.d0;
        dh dhVar = biVar.z2;
        if (!biVar.p3) {
            if (motionEvent.getX() <= dhVar.getEditText().getLeft() || motionEvent.getX() >= dhVar.getEditText().getRight() || motionEvent.getY() <= dhVar.getEditText().getTop() || motionEvent.getY() >= dhVar.getEditText().getBottom()) {
                biVar.h1(dhVar.getEditText(), false);
            } else {
                biVar.h1(dhVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.d0.J1();
    }

    @Override // org.telegram.ui.Components.jt
    public final void q(int i3, int i10) {
        bi biVar = this.d0;
        ah ahVar = biVar.y2;
        boolean z10 = false;
        if (TextUtils.isEmpty(getEditText().getText())) {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.W = false;
        } else {
            this.W = true;
            this.a0 = getEditText().getMeasuredHeight();
            this.b0 = getEditText().getScrollY();
            invalidate();
        }
        if (!biVar.U1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            biVar.B1(z10);
        }
        biVar.R3 = ahVar.getTop() + biVar.Q3;
        ahVar.invalidate();
        biVar.J1();
    }
}
