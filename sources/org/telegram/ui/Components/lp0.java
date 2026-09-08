package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class lp0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ hq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lp0(hq0 hq0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = hq0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                hq0 hq0Var = this.b;
                hq0Var.X0.setBounds(0, (int) hq0Var.u0, getMeasuredWidth(), getMeasuredHeight());
                hq0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, hq0Var.u0, getMeasuredWidth(), getMeasuredHeight());
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
                hq0 hq0Var = this.b;
                lp0 lp0Var = hq0Var.c;
                float f7 = hq0Var.v0;
                if (f7 != 0.0f && f7 != lp0Var.getTop() + hq0Var.v0) {
                    ValueAnimator valueAnimator = hq0Var.w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = hq0Var.v0 - (lp0Var.getTop() + hq0Var.u0);
                    hq0Var.u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    hq0Var.w0 = ofFloat;
                    ofFloat.addUpdateListener(new h70(this, 17));
                    hq0Var.w0.setInterpolator(pr.f);
                    hq0Var.w0.setDuration(200L);
                    hq0Var.w0.start();
                    hq0Var.v0 = 0.0f;
                }
                hq0Var.S[1].setTranslationY((-(lp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + hq0Var.u0 + hq0Var.t0 + ((1.0f - getAlpha()) * (lp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
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
