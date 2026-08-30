package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class op0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ op0(lq0 lq0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = lq0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                lq0 lq0Var = this.b;
                lq0Var.U0.setBounds(0, (int) lq0Var.r0, getMeasuredWidth(), getMeasuredHeight());
                lq0Var.U0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, lq0Var.r0, getMeasuredWidth(), getMeasuredHeight());
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
                lq0 lq0Var = this.b;
                op0 op0Var = lq0Var.c;
                float f10 = lq0Var.s0;
                if (f10 != 0.0f && f10 != op0Var.getTop() + lq0Var.s0) {
                    ValueAnimator valueAnimator = lq0Var.t0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = lq0Var.s0 - (op0Var.getTop() + lq0Var.r0);
                    lq0Var.r0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    lq0Var.t0 = ofFloat;
                    ofFloat.addUpdateListener(new i70(this, 17));
                    lq0Var.t0.setInterpolator(nr.f);
                    lq0Var.t0.setDuration(200L);
                    lq0Var.t0.start();
                    lq0Var.s0 = 0.0f;
                }
                lq0Var.P[1].setTranslationY((-(op0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + lq0Var.r0 + lq0Var.q0 + ((1.0f - getAlpha()) * (op0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
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
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.b.R.m(), new Object[0]));
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
    public void setAlpha(float f10) {
        switch (this.a) {
            case 0:
                super.setAlpha(f10);
                invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.b.P[1].setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
