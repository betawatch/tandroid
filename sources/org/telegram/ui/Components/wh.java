package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wh extends ru {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ ti c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(ti tiVar, Context context, gi giVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, giVar, null, 1, true, u6Var);
        this.c0 = tiVar;
    }

    @Override // org.telegram.ui.Components.ru
    public final void c(float f7) {
        ti tiVar = this.c0;
        tiVar.j2 = f7;
        th thVar = tiVar.G0;
        thVar.setTranslationY(f7);
        thVar.invalidate();
        tiVar.l1();
        tiVar.e2(tiVar.B0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            ju editText = this.c0.H0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new bh.b0(15, this, editText));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(ds.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ru
    public final void e() {
        super/*org.telegram.ui.ActionBar.k3*/.dismiss();
    }

    @Override // org.telegram.ui.Components.ru
    public final void f() {
        super.f();
        sz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.ru
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.r2 r2Var = this.c0.f0;
        if (r2Var instanceof org.telegram.ui.un) {
            org.telegram.ui.un.r8(menu, ((org.telegram.ui.un) r2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.c0;
        wh whVar = tiVar.H0;
        if (!tiVar.x1) {
            if (motionEvent.getX() <= whVar.getEditText().getLeft() || motionEvent.getX() >= whVar.getEditText().getRight() || motionEvent.getY() <= whVar.getEditText().getTop() || motionEvent.getY() >= whVar.getEditText().getBottom()) {
                tiVar.y1(whVar.getEditText(), false);
            } else {
                tiVar.y1(whVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.c0.b2();
    }

    @Override // org.telegram.ui.Components.ru
    public final void q(int i10, int i11) {
        ti tiVar = this.c0;
        th thVar = tiVar.G0;
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
        if (!tiVar.c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            tiVar.T1(z10);
        }
        tiVar.Z1 = thVar.getTop() + tiVar.Y1;
        thVar.invalidate();
        tiVar.b2();
    }
}
