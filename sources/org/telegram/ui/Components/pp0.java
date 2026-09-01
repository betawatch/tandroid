package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pp0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pp0(mq0 mq0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = mq0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                mq0 mq0Var = this.b;
                mq0Var.U0.setBounds(0, (int) mq0Var.r0, getMeasuredWidth(), getMeasuredHeight());
                mq0Var.U0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, mq0Var.r0, getMeasuredWidth(), getMeasuredHeight());
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
                mq0 mq0Var = this.b;
                pp0 pp0Var = mq0Var.c;
                float f10 = mq0Var.s0;
                if (f10 != 0.0f && f10 != pp0Var.getTop() + mq0Var.s0) {
                    ValueAnimator valueAnimator = mq0Var.t0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = mq0Var.s0 - (pp0Var.getTop() + mq0Var.r0);
                    mq0Var.r0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    mq0Var.t0 = ofFloat;
                    ofFloat.addUpdateListener(new k70(this, 17));
                    mq0Var.t0.setInterpolator(pr.f);
                    mq0Var.t0.setDuration(200L);
                    mq0Var.t0.start();
                    mq0Var.s0 = 0.0f;
                }
                mq0Var.P[1].setTranslationY((-(pp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + mq0Var.r0 + mq0Var.q0 + ((1.0f - getAlpha()) * (pp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
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
