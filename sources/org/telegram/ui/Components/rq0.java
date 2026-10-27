package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rq0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rq0(nr0 nr0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = nr0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                nr0 nr0Var = this.b;
                nr0Var.X0.setBounds(0, (int) nr0Var.v0, getMeasuredWidth(), getMeasuredHeight());
                nr0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, nr0Var.v0, getMeasuredWidth(), getMeasuredHeight());
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
                nr0 nr0Var = this.b;
                rq0 rq0Var = nr0Var.c;
                float f7 = nr0Var.w0;
                if (f7 != 0.0f && f7 != rq0Var.getTop() + nr0Var.w0) {
                    ValueAnimator valueAnimator = nr0Var.x0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = nr0Var.w0 - (rq0Var.getTop() + nr0Var.v0);
                    nr0Var.v0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    nr0Var.x0 = ofFloat;
                    ofFloat.addUpdateListener(new f80(this, 18));
                    nr0Var.x0.setInterpolator(ds.f);
                    nr0Var.x0.setDuration(200L);
                    nr0Var.x0.start();
                    nr0Var.w0 = 0.0f;
                }
                nr0Var.T[1].setTranslationY((-(rq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + nr0Var.v0 + nr0Var.u0 + ((1.0f - getAlpha()) * (rq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
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
