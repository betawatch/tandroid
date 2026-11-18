package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class do0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do0(yo0 yo0Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = yo0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                yo0 yo0Var = this.b;
                yo0Var.S2.setBounds(0, (int) yo0Var.q2, getMeasuredWidth(), getMeasuredHeight());
                yo0Var.S2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, yo0Var.q2, getMeasuredWidth(), getMeasuredHeight());
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
                yo0 yo0Var = this.b;
                do0 do0Var = yo0Var.n1;
                float f10 = yo0Var.r2;
                if (f10 != 0.0f && f10 != do0Var.getTop() + yo0Var.r2) {
                    ValueAnimator valueAnimator = yo0Var.s2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = yo0Var.r2 - (do0Var.getTop() + yo0Var.q2);
                    yo0Var.q2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    yo0Var.s2 = ofFloat;
                    ofFloat.addUpdateListener(new e60(this, 18));
                    yo0Var.s2.setInterpolator(lr.f);
                    yo0Var.s2.setDuration(200L);
                    yo0Var.s2.start();
                    yo0Var.r2 = 0.0f;
                }
                yo0Var.O1[1].setTranslationY((-(do0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))) + yo0Var.q2 + yo0Var.p2 + ((1.0f - getAlpha()) * (do0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))));
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
                accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(this.b.Q1.m(), "AccDescrShareInChats", new Object[0]));
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
                    this.b.O1[1].setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }
}
