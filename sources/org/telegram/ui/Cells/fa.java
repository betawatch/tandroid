package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.pu;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                ofFloat.addListener(new org.telegram.ui.t4(this, 13));
                ofFloat.start();
                break;
            case 1:
                ((pu) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                a30 a30Var = (a30) obj;
                e30 e30Var = a30Var.f;
                org.telegram.ui.u7 u7Var = a30Var.e;
                u7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                u7Var.getLocationOnScreen(a30Var.G);
                float f7 = a30Var.r.x + a30Var.Q;
                g30 g30Var = a30Var.U;
                float measuredWidth = ((g30Var.getMeasuredWidth() / 2.0f) + f7) - r7[0];
                float measuredWidth2 = ((g30Var.getMeasuredWidth() / 2.0f) + (a30Var.r.y + a30Var.R)) - r7[1];
                boolean z10 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) u7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + e30Var.getMeasuredWidth() < u7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    e30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / u7Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredHeight();
                    e30Var.setTranslationY((int) (measuredWidth2 - (e30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    e30Var.c(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - e30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / u7Var.getMeasuredHeight(), 1.0f - dp2));
                    e30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - e30Var.getMeasuredWidth()));
                    e30Var.setTranslationY((int) (measuredWidth2 - (e30Var.getMeasuredHeight() * max)));
                    e30Var.c(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= u7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / u7Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredWidth();
                    e30Var.setTranslationX((int) (measuredWidth - (e30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    e30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    e30Var.c(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / u7Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredWidth();
                    e30Var.setTranslationX((int) (measuredWidth - (e30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    e30Var.setTranslationY((int) ((measuredWidth2 - e30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    e30Var.c(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 3:
                ((ci.r6) obj).invalidate();
                break;
            default:
                o91 o91Var = (o91) ((ki.d) obj).b;
                o91Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = o91Var.e;
                int i11 = 4;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    o91Var.e.setImageDrawable(null);
                    Bitmap bitmap = o91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        o91Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new g71(this, i11));
                o91Var.r = 0;
                break;
        }
        return true;
    }
}
