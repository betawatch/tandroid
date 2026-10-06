package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class eq0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ br0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq0(br0 br0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = br0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                br0 br0Var = this.b;
                br0Var.V0.setBounds(0, (int) br0Var.u0, getMeasuredWidth(), getMeasuredHeight());
                br0Var.V0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, br0Var.u0, getMeasuredWidth(), getMeasuredHeight());
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
                br0 br0Var = this.b;
                eq0 eq0Var = br0Var.c;
                float f7 = br0Var.v0;
                if (f7 != 0.0f && f7 != eq0Var.getTop() + br0Var.v0) {
                    ValueAnimator valueAnimator = br0Var.w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = br0Var.v0 - (eq0Var.getTop() + br0Var.u0);
                    br0Var.u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    br0Var.w0 = ofFloat;
                    ofFloat.addUpdateListener(new v70(this, 17));
                    br0Var.w0.setInterpolator(tr.f);
                    br0Var.w0.setDuration(200L);
                    br0Var.w0.start();
                    br0Var.v0 = 0.0f;
                }
                br0Var.S[1].setTranslationY((-(eq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + br0Var.u0 + br0Var.t0 + ((1.0f - getAlpha()) * (eq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
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
