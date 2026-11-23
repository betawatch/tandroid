package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class fo0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fo0(ap0 ap0Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = ap0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                ap0 ap0Var = this.b;
                ap0Var.S2.setBounds(0, (int) ap0Var.q2, getMeasuredWidth(), getMeasuredHeight());
                ap0Var.S2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, ap0Var.q2, getMeasuredWidth(), getMeasuredHeight());
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
                ap0 ap0Var = this.b;
                fo0 fo0Var = ap0Var.n1;
                float f10 = ap0Var.r2;
                if (f10 != 0.0f && f10 != fo0Var.getTop() + ap0Var.r2) {
                    ValueAnimator valueAnimator = ap0Var.s2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = ap0Var.r2 - (fo0Var.getTop() + ap0Var.q2);
                    ap0Var.q2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    ap0Var.s2 = ofFloat;
                    ofFloat.addUpdateListener(new h60(this, 18));
                    ap0Var.s2.setInterpolator(nr.f);
                    ap0Var.s2.setDuration(200L);
                    ap0Var.s2.start();
                    ap0Var.r2 = 0.0f;
                }
                ap0Var.O1[1].setTranslationY((-(fo0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))) + ap0Var.q2 + ap0Var.p2 + ((1.0f - getAlpha()) * (fo0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))));
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
                accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(this.b.Q1.m(), "AccDescrShareInChats", new Object[0]));
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
