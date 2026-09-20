package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class yp0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ uq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp0(uq0 uq0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = uq0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                uq0 uq0Var = this.b;
                uq0Var.X0.setBounds(0, (int) uq0Var.u0, getMeasuredWidth(), getMeasuredHeight());
                uq0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, uq0Var.u0, getMeasuredWidth(), getMeasuredHeight());
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
                uq0 uq0Var = this.b;
                yp0 yp0Var = uq0Var.c;
                float f7 = uq0Var.v0;
                if (f7 != 0.0f && f7 != yp0Var.getTop() + uq0Var.v0) {
                    ValueAnimator valueAnimator = uq0Var.w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = uq0Var.v0 - (yp0Var.getTop() + uq0Var.u0);
                    uq0Var.u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    uq0Var.w0 = ofFloat;
                    ofFloat.addUpdateListener(new p70(this, 17));
                    uq0Var.w0.setInterpolator(qr.f);
                    uq0Var.w0.setDuration(200L);
                    uq0Var.w0.start();
                    uq0Var.v0 = 0.0f;
                }
                uq0Var.S[1].setTranslationY((-(yp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + uq0Var.u0 + uq0Var.t0 + ((1.0f - getAlpha()) * (yp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
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
