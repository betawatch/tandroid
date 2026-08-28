package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uo0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uo0(rp0 rp0Var, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = rp0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                rp0 rp0Var = this.b;
                rp0Var.T0.setBounds(0, (int) rp0Var.q0, getMeasuredWidth(), getMeasuredHeight());
                rp0Var.T0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, rp0Var.q0, getMeasuredWidth(), getMeasuredHeight());
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
                rp0 rp0Var = this.b;
                uo0 uo0Var = rp0Var.c;
                float f10 = rp0Var.r0;
                if (f10 != 0.0f && f10 != uo0Var.getTop() + rp0Var.r0) {
                    ValueAnimator valueAnimator = rp0Var.s0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = rp0Var.r0 - (uo0Var.getTop() + rp0Var.q0);
                    rp0Var.q0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    rp0Var.s0 = ofFloat;
                    ofFloat.addUpdateListener(new q60(this, 17));
                    rp0Var.s0.setInterpolator(gr.f);
                    rp0Var.s0.setDuration(200L);
                    rp0Var.s0.start();
                    rp0Var.r0 = 0.0f;
                }
                rp0Var.O[1].setTranslationY((-(uo0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + rp0Var.q0 + rp0Var.p0 + ((1.0f - getAlpha()) * (uo0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
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
    public void setVisibility(int i9) {
        switch (this.a) {
            case 0:
                super.setVisibility(i9);
                if (i9 != 0) {
                    this.b.O[1].setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.setVisibility(i9);
                break;
        }
    }
}
