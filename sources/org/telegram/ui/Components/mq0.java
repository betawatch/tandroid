package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class mq0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mq0(ir0 ir0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = ir0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                ir0 ir0Var = this.b;
                ir0Var.Z0.setBounds(0, (int) ir0Var.v0, getMeasuredWidth(), getMeasuredHeight());
                ir0Var.Z0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, ir0Var.v0, getMeasuredWidth(), getMeasuredHeight());
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
                ir0 ir0Var = this.b;
                mq0 mq0Var = ir0Var.c;
                float f7 = ir0Var.w0;
                if (f7 != 0.0f && f7 != mq0Var.getTop() + ir0Var.w0) {
                    ValueAnimator valueAnimator = ir0Var.x0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = ir0Var.w0 - (mq0Var.getTop() + ir0Var.v0);
                    ir0Var.v0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    ir0Var.x0 = ofFloat;
                    ofFloat.addUpdateListener(new d80(this, 18));
                    ir0Var.x0.setInterpolator(bs.f);
                    ir0Var.x0.setDuration(200L);
                    ir0Var.x0.start();
                    ir0Var.w0 = 0.0f;
                }
                ir0Var.T[1].setTranslationY((-(mq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + ir0Var.v0 + ir0Var.u0 + ((1.0f - getAlpha()) * (mq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
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
