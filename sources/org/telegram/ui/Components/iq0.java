package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class iq0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iq0(fr0 fr0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = fr0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                fr0 fr0Var = this.b;
                fr0Var.Y0.setBounds(0, (int) fr0Var.v0, getMeasuredWidth(), getMeasuredHeight());
                fr0Var.Y0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, fr0Var.v0, getMeasuredWidth(), getMeasuredHeight());
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
                fr0 fr0Var = this.b;
                iq0 iq0Var = fr0Var.c;
                float f7 = fr0Var.w0;
                if (f7 != 0.0f && f7 != iq0Var.getTop() + fr0Var.w0) {
                    ValueAnimator valueAnimator = fr0Var.x0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = fr0Var.w0 - (iq0Var.getTop() + fr0Var.v0);
                    fr0Var.v0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    fr0Var.x0 = ofFloat;
                    ofFloat.addUpdateListener(new b80(this, 18));
                    fr0Var.x0.setInterpolator(bs.f);
                    fr0Var.x0.setDuration(200L);
                    fr0Var.x0.start();
                    fr0Var.w0 = 0.0f;
                }
                fr0Var.T[1].setTranslationY((-(iq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + fr0Var.v0 + fr0Var.u0 + ((1.0f - getAlpha()) * (iq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
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
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.b.V.m(), new Object[0]));
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
                    this.b.T[1].setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
