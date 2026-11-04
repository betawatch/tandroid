package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tn0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tn0(oo0 oo0Var, Context context, int i3) {
        super(context);
        this.a = i3;
        this.b = oo0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                oo0 oo0Var = this.b;
                oo0Var.P2.setBounds(0, (int) oo0Var.n2, getMeasuredWidth(), getMeasuredHeight());
                oo0Var.P2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, oo0Var.n2, getMeasuredWidth(), getMeasuredHeight());
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
                oo0 oo0Var = this.b;
                tn0 tn0Var = oo0Var.k1;
                float f10 = oo0Var.o2;
                if (f10 != 0.0f && f10 != tn0Var.getTop() + oo0Var.o2) {
                    ValueAnimator valueAnimator = oo0Var.p2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = oo0Var.o2 - (tn0Var.getTop() + oo0Var.n2);
                    oo0Var.n2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    oo0Var.p2 = ofFloat;
                    ofFloat.addUpdateListener(new y50(this, 17));
                    oo0Var.p2.setInterpolator(xq.f);
                    oo0Var.p2.setDuration(200L);
                    oo0Var.p2.start();
                    oo0Var.o2 = 0.0f;
                }
                oo0Var.L1[1].setTranslationY((-(tn0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))) + oo0Var.n2 + oo0Var.m2 + ((1.0f - getAlpha()) * (tn0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))));
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
                accessibilityNodeInfo.setText(org.telegram.messenger.bd.G(this.b.N1.m(), "AccDescrShareInChats", new Object[0]));
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
    public void setVisibility(int i3) {
        switch (this.a) {
            case 0:
                super.setVisibility(i3);
                if (i3 != 0) {
                    this.b.L1[1].setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.setVisibility(i3);
                break;
        }
    }
}
