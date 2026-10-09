package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.ha1;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.w30;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        int i11 = 3;
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
                ofFloat.addListener(new org.telegram.ui.t4(this, 13));
                ofFloat.start();
                break;
            case 1:
                ((ev) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                q30 q30Var = (q30) obj;
                u30 u30Var = q30Var.f;
                org.telegram.ui.t7 t7Var = q30Var.e;
                t7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                t7Var.getLocationOnScreen(q30Var.G);
                float f7 = q30Var.r.x + q30Var.Q;
                w30 w30Var = q30Var.U;
                float measuredWidth = ((w30Var.getMeasuredWidth() / 2.0f) + f7) - r8[0];
                float measuredWidth2 = ((w30Var.getMeasuredWidth() / 2.0f) + (q30Var.r.y + q30Var.R)) - r8[1];
                boolean z10 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) t7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + u30Var.getMeasuredWidth() < t7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    u30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / t7Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / u30Var.getMeasuredHeight();
                    u30Var.setTranslationY((int) (measuredWidth2 - (u30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    u30Var.a(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - u30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / u30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / t7Var.getMeasuredHeight(), 1.0f - dp2));
                    u30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - u30Var.getMeasuredWidth()));
                    u30Var.setTranslationY((int) (measuredWidth2 - (u30Var.getMeasuredHeight() * max)));
                    u30Var.a(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= t7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / t7Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / u30Var.getMeasuredWidth();
                    u30Var.setTranslationX((int) (measuredWidth - (u30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    u30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    u30Var.a(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / t7Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / u30Var.getMeasuredWidth();
                    u30Var.setTranslationX((int) (measuredWidth - (u30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    u30Var.setTranslationY((int) ((measuredWidth2 - u30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    u30Var.a(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 3:
                ((ci.r6) obj).invalidate();
                break;
            default:
                ha1 ha1Var = (ha1) ((ki.d) obj).b;
                ha1Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = ha1Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    ha1Var.e.setImageDrawable(null);
                    Bitmap bitmap = ha1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        ha1Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new c81(this, i11));
                ha1Var.r = 0;
                break;
        }
        return true;
    }
}
