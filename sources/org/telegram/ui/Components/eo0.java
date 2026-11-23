package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class eo0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ zo0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eo0(zo0 zo0Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = zo0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                zo0 zo0Var = this.b;
                zo0Var.S2.setBounds(0, (int) zo0Var.q2, getMeasuredWidth(), getMeasuredHeight());
                zo0Var.S2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, zo0Var.q2, getMeasuredWidth(), getMeasuredHeight());
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
                zo0 zo0Var = this.b;
                eo0 eo0Var = zo0Var.n1;
                float f10 = zo0Var.r2;
                if (f10 != 0.0f && f10 != eo0Var.getTop() + zo0Var.r2) {
                    ValueAnimator valueAnimator = zo0Var.s2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = zo0Var.r2 - (eo0Var.getTop() + zo0Var.q2);
                    zo0Var.q2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    zo0Var.s2 = ofFloat;
                    ofFloat.addUpdateListener(new e60(this, 18));
                    zo0Var.s2.setInterpolator(kr.f);
                    zo0Var.s2.setDuration(200L);
                    zo0Var.s2.start();
                    zo0Var.r2 = 0.0f;
                }
                zo0Var.O1[1].setTranslationY((-(eo0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))) + zo0Var.q2 + zo0Var.p2 + ((1.0f - getAlpha()) * (eo0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))));
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
