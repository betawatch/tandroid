package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class so0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ op0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so0(op0 op0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = op0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                op0 op0Var = this.b;
                op0Var.O2.setBounds(0, (int) op0Var.m2, getMeasuredWidth(), getMeasuredHeight());
                op0Var.O2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, op0Var.m2, getMeasuredWidth(), getMeasuredHeight());
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
                op0 op0Var = this.b;
                so0 so0Var = op0Var.j1;
                float f7 = op0Var.n2;
                if (f7 != 0.0f && f7 != so0Var.getTop() + op0Var.n2) {
                    ValueAnimator valueAnimator = op0Var.o2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = op0Var.n2 - (so0Var.getTop() + op0Var.m2);
                    op0Var.m2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    op0Var.o2 = ofFloat;
                    ofFloat.addUpdateListener(new r60(this, 17));
                    op0Var.o2.setInterpolator(gr.f);
                    op0Var.o2.setDuration(200L);
                    op0Var.o2.start();
                    op0Var.n2 = 0.0f;
                }
                op0Var.K1[1].setTranslationY((-(so0Var.getMeasuredHeight() - org.telegram.messenger.i0.L(48.0f))) + op0Var.m2 + op0Var.l2 + ((1.0f - getAlpha()) * (so0Var.getMeasuredHeight() - org.telegram.messenger.i0.L(48.0f))));
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
                accessibilityNodeInfo.setText(org.telegram.messenger.cd.G(this.b.M1.m(), "AccDescrShareInChats", new Object[0]));
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
                    this.b.K1[1].setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
