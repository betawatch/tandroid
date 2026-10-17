package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class hq0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ dr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hq0(dr0 dr0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = dr0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                dr0 dr0Var = this.b;
                dr0Var.X0.setBounds(0, (int) dr0Var.u0, getMeasuredWidth(), getMeasuredHeight());
                dr0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, dr0Var.u0, getMeasuredWidth(), getMeasuredHeight());
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
                dr0 dr0Var = this.b;
                hq0 hq0Var = dr0Var.c;
                float f7 = dr0Var.v0;
                if (f7 != 0.0f && f7 != hq0Var.getTop() + dr0Var.v0) {
                    ValueAnimator valueAnimator = dr0Var.w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = dr0Var.v0 - (hq0Var.getTop() + dr0Var.u0);
                    dr0Var.u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    dr0Var.w0 = ofFloat;
                    ofFloat.addUpdateListener(new b80(this, 18));
                    dr0Var.w0.setInterpolator(bs.f);
                    dr0Var.w0.setDuration(200L);
                    dr0Var.w0.start();
                    dr0Var.v0 = 0.0f;
                }
                dr0Var.S[1].setTranslationY((-(hq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + dr0Var.u0 + dr0Var.t0 + ((1.0f - getAlpha()) * (hq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
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
