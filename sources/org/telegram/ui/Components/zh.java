package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class zh extends qu {
    public boolean V;
    public int W;
    public int a0;
    public ValueAnimator b0;
    public final /* synthetic */ ti c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(ti tiVar, Context context, ji jiVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, jiVar, null, 1, true, g6Var);
        this.c0 = tiVar;
    }

    @Override // org.telegram.ui.Components.qu
    public final void c(float f7) {
        ti tiVar = this.c0;
        tiVar.j2 = f7;
        wh whVar = tiVar.G0;
        whVar.setTranslationY(f7);
        whVar.invalidate();
        tiVar.l1();
        tiVar.f2(tiVar.B0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            iu editText = this.c0.H0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ah.l0(16, this, editText));
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(bs.f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.qu
    public final void e() {
        super/*org.telegram.ui.ActionBar.h3*/.dismiss();
    }

    @Override // org.telegram.ui.Components.qu
    public final void f() {
        super.f();
        tz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.qu
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.c0.f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            org.telegram.ui.sn.n8(menu, ((org.telegram.ui.sn) o2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.c0;
        zh zhVar = tiVar.H0;
        if (!tiVar.x1) {
            if (motionEvent.getX() <= zhVar.getEditText().getLeft() || motionEvent.getX() >= zhVar.getEditText().getRight() || motionEvent.getY() <= zhVar.getEditText().getTop() || motionEvent.getY() >= zhVar.getEditText().getBottom()) {
                tiVar.z1(zhVar.getEditText(), false);
            } else {
                tiVar.z1(zhVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.c0.c2();
    }

    @Override // org.telegram.ui.Components.qu
    public final void q(int i10, int i11) {
        ti tiVar = this.c0;
        wh whVar = tiVar.G0;
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
            tiVar.U1(z10);
        }
        tiVar.Z1 = whVar.getTop() + tiVar.Y1;
        whVar.invalidate();
        tiVar.c2();
    }
}
