package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qq0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ mr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq0(mr0 mr0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = mr0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                mr0 mr0Var = this.b;
                mr0Var.X0.setBounds(0, (int) mr0Var.u0, getMeasuredWidth(), getMeasuredHeight());
                mr0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, mr0Var.u0, getMeasuredWidth(), getMeasuredHeight());
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
                mr0 mr0Var = this.b;
                qq0 qq0Var = mr0Var.c;
                float f7 = mr0Var.v0;
                if (f7 != 0.0f && f7 != qq0Var.getTop() + mr0Var.v0) {
                    ValueAnimator valueAnimator = mr0Var.w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = mr0Var.v0 - (qq0Var.getTop() + mr0Var.u0);
                    mr0Var.u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    mr0Var.w0 = ofFloat;
                    ofFloat.addUpdateListener(new j80(this, 18));
                    mr0Var.w0.setInterpolator(hs.f);
                    mr0Var.w0.setDuration(200L);
                    mr0Var.w0.start();
                    mr0Var.v0 = 0.0f;
                }
                mr0Var.S[1].setTranslationY((-(qq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + mr0Var.u0 + mr0Var.t0 + ((1.0f - getAlpha()) * (qq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
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
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.b.U.m(), new Object[0]));
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
                    this.b.S[1].setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
