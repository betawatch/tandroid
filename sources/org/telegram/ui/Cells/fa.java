package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aa1;
import org.telegram.ui.Components.d30;
import org.telegram.ui.Components.h30;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.su;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class fa implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ha haVar = ((ga) obj).a;
                haVar.getViewTreeObserver().removeOnPreDrawListener(this);
                haVar.getTransitionParams().j();
                haVar.getTransitionParams().f();
                haVar.getTransitionParams().g = true;
                haVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.u4(this, 13));
                ofFloat.start();
                break;
            case 1:
                ((su) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                d30 d30Var = (d30) obj;
                h30 h30Var = d30Var.f;
                org.telegram.ui.x7 x7Var = d30Var.e;
                x7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                x7Var.getLocationOnScreen(d30Var.G);
                float f7 = d30Var.r.x + d30Var.Q;
                j30 j30Var = d30Var.U;
                float measuredWidth = ((j30Var.getMeasuredWidth() / 2.0f) + f7) - r7[0];
                float measuredWidth2 = ((j30Var.getMeasuredWidth() / 2.0f) + (d30Var.r.y + d30Var.R)) - r7[1];
                boolean z10 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) x7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + h30Var.getMeasuredWidth() < x7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    h30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / x7Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / h30Var.getMeasuredHeight();
                    h30Var.setTranslationY((int) (measuredWidth2 - (h30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    h30Var.c(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - h30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / h30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / x7Var.getMeasuredHeight(), 1.0f - dp2));
                    h30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - h30Var.getMeasuredWidth()));
                    h30Var.setTranslationY((int) (measuredWidth2 - (h30Var.getMeasuredHeight() * max)));
                    h30Var.c(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= x7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / x7Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / h30Var.getMeasuredWidth();
                    h30Var.setTranslationX((int) (measuredWidth - (h30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    h30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    h30Var.c(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / x7Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / h30Var.getMeasuredWidth();
                    h30Var.setTranslationX((int) (measuredWidth - (h30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    h30Var.setTranslationY((int) ((measuredWidth2 - h30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    h30Var.c(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 3:
                ((ci.r6) obj).invalidate();
                break;
            default:
                aa1 aa1Var = (aa1) ((ki.d) obj).b;
                aa1Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = aa1Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    aa1Var.e.setImageDrawable(null);
                    Bitmap bitmap = aa1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        aa1Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new q61(this, 6));
                aa1Var.r = 0;
                break;
        }
        return true;
    }
}
