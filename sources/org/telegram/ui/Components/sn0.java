package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class sn0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ no0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sn0(no0 no0Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = no0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                no0 no0Var = this.b;
                no0Var.O2.setBounds(0, (int) no0Var.m2, getMeasuredWidth(), getMeasuredHeight());
                no0Var.O2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, no0Var.m2, getMeasuredWidth(), getMeasuredHeight());
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
                no0 no0Var = this.b;
                sn0 sn0Var = no0Var.j1;
                float f10 = no0Var.n2;
                if (f10 != 0.0f && f10 != sn0Var.getTop() + no0Var.n2) {
                    ValueAnimator valueAnimator = no0Var.o2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = no0Var.n2 - (sn0Var.getTop() + no0Var.m2);
                    no0Var.m2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    no0Var.o2 = ofFloat;
                    ofFloat.addUpdateListener(new d60(this, 16));
                    no0Var.o2.setInterpolator(xq.f);
                    no0Var.o2.setDuration(200L);
                    no0Var.o2.start();
                    no0Var.n2 = 0.0f;
                }
                no0Var.K1[1].setTranslationY((-(sn0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))) + no0Var.m2 + no0Var.l2 + ((1.0f - getAlpha()) * (sn0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))));
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
                accessibilityNodeInfo.setText(org.telegram.messenger.id.G(this.b.M1.m(), "AccDescrShareInChats", new Object[0]));
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
    public void setVisibility(int i7) {
        switch (this.a) {
            case 0:
                super.setVisibility(i7);
                if (i7 != 0) {
                    this.b.K1[1].setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }
}
