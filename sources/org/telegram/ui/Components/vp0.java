package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vp0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ sq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp0(sq0 sq0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = sq0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                sq0 sq0Var = this.b;
                sq0Var.X0.setBounds(0, (int) sq0Var.u0, getMeasuredWidth(), getMeasuredHeight());
                sq0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, sq0Var.u0, getMeasuredWidth(), getMeasuredHeight());
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
                sq0 sq0Var = this.b;
                vp0 vp0Var = sq0Var.c;
                float f7 = sq0Var.v0;
                if (f7 != 0.0f && f7 != vp0Var.getTop() + sq0Var.v0) {
                    ValueAnimator valueAnimator = sq0Var.w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = sq0Var.v0 - (vp0Var.getTop() + sq0Var.u0);
                    sq0Var.u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    sq0Var.w0 = ofFloat;
                    ofFloat.addUpdateListener(new q70(this, 17));
                    sq0Var.w0.setInterpolator(wr.f);
                    sq0Var.w0.setDuration(200L);
                    sq0Var.w0.start();
                    sq0Var.v0 = 0.0f;
                }
                sq0Var.S[1].setTranslationY((-(vp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + sq0Var.u0 + sq0Var.t0 + ((1.0f - getAlpha()) * (vp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
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
