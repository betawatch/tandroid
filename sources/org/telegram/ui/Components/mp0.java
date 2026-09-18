package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class mp0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ iq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mp0(iq0 iq0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = iq0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                iq0 iq0Var = this.b;
                iq0Var.X0.setBounds(0, (int) iq0Var.u0, getMeasuredWidth(), getMeasuredHeight());
                iq0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, iq0Var.u0, getMeasuredWidth(), getMeasuredHeight());
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
                iq0 iq0Var = this.b;
                mp0 mp0Var = iq0Var.c;
                float f7 = iq0Var.v0;
                if (f7 != 0.0f && f7 != mp0Var.getTop() + iq0Var.v0) {
                    ValueAnimator valueAnimator = iq0Var.w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = iq0Var.v0 - (mp0Var.getTop() + iq0Var.u0);
                    iq0Var.u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    iq0Var.w0 = ofFloat;
                    ofFloat.addUpdateListener(new h70(this, 17));
                    iq0Var.w0.setInterpolator(qr.f);
                    iq0Var.w0.setDuration(200L);
                    iq0Var.w0.start();
                    iq0Var.v0 = 0.0f;
                }
                iq0Var.S[1].setTranslationY((-(mp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + iq0Var.u0 + iq0Var.t0 + ((1.0f - getAlpha()) * (mp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
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
