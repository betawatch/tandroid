package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class uo0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uo0(sp0 sp0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = sp0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                sp0 sp0Var = this.b;
                sp0Var.T0.setBounds(0, (int) sp0Var.q0, getMeasuredWidth(), getMeasuredHeight());
                sp0Var.T0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, sp0Var.q0, getMeasuredWidth(), getMeasuredHeight());
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
                sp0 sp0Var = this.b;
                uo0 uo0Var = sp0Var.c;
                float f10 = sp0Var.r0;
                if (f10 != 0.0f && f10 != uo0Var.getTop() + sp0Var.r0) {
                    ValueAnimator valueAnimator = sp0Var.s0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = sp0Var.r0 - (uo0Var.getTop() + sp0Var.q0);
                    sp0Var.q0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    sp0Var.s0 = ofFloat;
                    ofFloat.addUpdateListener(new v60(this, 17));
                    sp0Var.s0.setInterpolator(er.f);
                    sp0Var.s0.setDuration(200L);
                    sp0Var.s0.start();
                    sp0Var.r0 = 0.0f;
                }
                sp0Var.O[1].setTranslationY((-(uo0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + sp0Var.q0 + sp0Var.p0 + ((1.0f - getAlpha()) * (uo0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
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
