package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class to0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ to0(pp0 pp0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = pp0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                pp0 pp0Var = this.b;
                pp0Var.O2.setBounds(0, (int) pp0Var.m2, getMeasuredWidth(), getMeasuredHeight());
                pp0Var.O2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, pp0Var.m2, getMeasuredWidth(), getMeasuredHeight());
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
                pp0 pp0Var = this.b;
                to0 to0Var = pp0Var.j1;
                float f7 = pp0Var.n2;
                if (f7 != 0.0f && f7 != to0Var.getTop() + pp0Var.n2) {
                    ValueAnimator valueAnimator = pp0Var.o2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = pp0Var.n2 - (to0Var.getTop() + pp0Var.m2);
                    pp0Var.m2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    pp0Var.o2 = ofFloat;
                    ofFloat.addUpdateListener(new r60(this, 17));
                    pp0Var.o2.setInterpolator(gr.f);
                    pp0Var.o2.setDuration(200L);
                    pp0Var.o2.start();
                    pp0Var.n2 = 0.0f;
                }
                pp0Var.K1[1].setTranslationY((-(to0Var.getMeasuredHeight() - org.telegram.messenger.i0.L(48.0f))) + pp0Var.m2 + pp0Var.l2 + ((1.0f - getAlpha()) * (to0Var.getMeasuredHeight() - org.telegram.messenger.i0.L(48.0f))));
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
                accessibilityNodeInfo.setText(org.telegram.messenger.dd.G(this.b.M1.m(), "AccDescrShareInChats", new Object[0]));
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
