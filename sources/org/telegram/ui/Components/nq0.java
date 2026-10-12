package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class nq0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nq0(jr0 jr0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = jr0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                jr0 jr0Var = this.b;
                jr0Var.X0.setBounds(0, (int) jr0Var.u0, getMeasuredWidth(), getMeasuredHeight());
                jr0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, jr0Var.u0, getMeasuredWidth(), getMeasuredHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                jr0 jr0Var = this.b;
                nq0 nq0Var = jr0Var.c;
                float f7 = jr0Var.v0;
                if (f7 != 0.0f && f7 != nq0Var.getTop() + jr0Var.v0) {
                    ValueAnimator valueAnimator = jr0Var.w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = jr0Var.v0 - (nq0Var.getTop() + jr0Var.u0);
                    jr0Var.u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    jr0Var.w0 = ofFloat;
                    ofFloat.addUpdateListener(new g80(this, 18));
                    jr0Var.w0.setInterpolator(es.f);
                    jr0Var.w0.setDuration(200L);
                    jr0Var.w0.start();
                    jr0Var.v0 = 0.0f;
                }
                jr0Var.S[1].setTranslationY((-(nq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + jr0Var.u0 + jr0Var.t0 + ((1.0f - getAlpha()) * (nq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.b.U.m(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 0:
                super.setAlpha(f7);
                invalidate();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.b.S[1].setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
