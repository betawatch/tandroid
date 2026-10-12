package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.ca1;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.v71;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class da implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ da(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                fa faVar = ((ea) obj).a;
                faVar.getViewTreeObserver().removeOnPreDrawListener(this);
                faVar.getTransitionParams().j();
                faVar.getTransitionParams().f();
                faVar.getTransitionParams().g = true;
                faVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.u0(this, 16));
                ofFloat.start();
                break;
            case 1:
                ((av) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                m30 m30Var = (m30) obj;
                q30 q30Var = m30Var.f;
                org.telegram.ui.y7 y7Var = m30Var.e;
                y7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                y7Var.getLocationOnScreen(m30Var.G);
                float f7 = m30Var.r.x + m30Var.Q;
                s30 s30Var = m30Var.U;
                float measuredWidth = ((s30Var.getMeasuredWidth() / 2.0f) + f7) - r7[0];
                float measuredWidth2 = ((s30Var.getMeasuredWidth() / 2.0f) + (m30Var.r.y + m30Var.R)) - r7[1];
                boolean z10 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) y7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + q30Var.getMeasuredWidth() < y7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    q30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / y7Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / q30Var.getMeasuredHeight();
                    q30Var.setTranslationY((int) (measuredWidth2 - (q30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    q30Var.a(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - q30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / q30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / y7Var.getMeasuredHeight(), 1.0f - dp2));
                    q30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - q30Var.getMeasuredWidth()));
                    q30Var.setTranslationY((int) (measuredWidth2 - (q30Var.getMeasuredHeight() * max)));
                    q30Var.a(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= y7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / y7Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / q30Var.getMeasuredWidth();
                    q30Var.setTranslationX((int) (measuredWidth - (q30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    q30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    q30Var.a(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / y7Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / q30Var.getMeasuredWidth();
                    q30Var.setTranslationX((int) (measuredWidth - (q30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    q30Var.setTranslationY((int) ((measuredWidth2 - q30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    q30Var.a(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 3:
                ((di.p6) obj).invalidate();
                break;
            default:
                ca1 ca1Var = (ca1) ((li.e) obj).b;
                ca1Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = ca1Var.e;
                int i11 = 4;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    ca1Var.e.setImageDrawable(null);
                    Bitmap bitmap = ca1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        ca1Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new v71(this, i11));
                ca1Var.r = 0;
                break;
        }
        return true;
    }
}
