package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fp0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp0(dq0 dq0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = dq0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                dq0 dq0Var = this.b;
                dq0Var.T0.setBounds(0, (int) dq0Var.q0, getMeasuredWidth(), getMeasuredHeight());
                dq0Var.T0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, dq0Var.q0, getMeasuredWidth(), getMeasuredHeight());
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
                dq0 dq0Var = this.b;
                fp0 fp0Var = dq0Var.c;
                float f9 = dq0Var.r0;
                if (f9 != 0.0f && f9 != fp0Var.getTop() + dq0Var.r0) {
                    ValueAnimator valueAnimator = dq0Var.s0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = dq0Var.r0 - (fp0Var.getTop() + dq0Var.q0);
                    dq0Var.q0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    dq0Var.s0 = ofFloat;
                    ofFloat.addUpdateListener(new d70(this, 17));
                    dq0Var.s0.setInterpolator(jr.f);
                    dq0Var.s0.setDuration(200L);
                    dq0Var.s0.start();
                    dq0Var.r0 = 0.0f;
                }
                dq0Var.O[1].setTranslationY((-(fp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + dq0Var.q0 + dq0Var.p0 + ((1.0f - getAlpha()) * (fp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
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
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.b.Q.m(), new Object[0]));
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
    public void setAlpha(float f9) {
        switch (this.a) {
            case 0:
                super.setAlpha(f9);
                invalidate();
                break;
            default:
                super.setAlpha(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.b.O[1].setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
