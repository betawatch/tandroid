package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class rn0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rn0(mo0 mo0Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = mo0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                mo0 mo0Var = this.b;
                mo0Var.O2.setBounds(0, (int) mo0Var.m2, getMeasuredWidth(), getMeasuredHeight());
                mo0Var.O2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, mo0Var.m2, getMeasuredWidth(), getMeasuredHeight());
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
                mo0 mo0Var = this.b;
                rn0 rn0Var = mo0Var.j1;
                float f10 = mo0Var.n2;
                if (f10 != 0.0f && f10 != rn0Var.getTop() + mo0Var.n2) {
                    ValueAnimator valueAnimator = mo0Var.o2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = mo0Var.n2 - (rn0Var.getTop() + mo0Var.m2);
                    mo0Var.m2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    mo0Var.o2 = ofFloat;
                    ofFloat.addUpdateListener(new c60(this, 16));
                    mo0Var.o2.setInterpolator(xq.f);
                    mo0Var.o2.setDuration(200L);
                    mo0Var.o2.start();
                    mo0Var.n2 = 0.0f;
                }
                mo0Var.K1[1].setTranslationY((-(rn0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))) + mo0Var.m2 + mo0Var.l2 + ((1.0f - getAlpha()) * (rn0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))));
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
                accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(this.b.M1.m(), "AccDescrShareInChats", new Object[0]));
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
