package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class un0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ po0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un0(po0 po0Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = po0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                po0 po0Var = this.b;
                po0Var.S2.setBounds(0, (int) po0Var.q2, getMeasuredWidth(), getMeasuredHeight());
                po0Var.S2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, po0Var.q2, getMeasuredWidth(), getMeasuredHeight());
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
                po0 po0Var = this.b;
                un0 un0Var = po0Var.n1;
                float f10 = po0Var.r2;
                if (f10 != 0.0f && f10 != un0Var.getTop() + po0Var.r2) {
                    ValueAnimator valueAnimator = po0Var.s2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = po0Var.r2 - (un0Var.getTop() + po0Var.q2);
                    po0Var.q2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    po0Var.s2 = ofFloat;
                    ofFloat.addUpdateListener(new f60(this, 16));
                    po0Var.s2.setInterpolator(er.f);
                    po0Var.s2.setDuration(200L);
                    po0Var.s2.start();
                    po0Var.r2 = 0.0f;
                }
                po0Var.O1[1].setTranslationY((-(un0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))) + po0Var.q2 + po0Var.p2 + ((1.0f - getAlpha()) * (un0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))));
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
