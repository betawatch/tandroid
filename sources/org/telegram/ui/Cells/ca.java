package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.zt;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ca implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ca(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i9 = this.a;
        int i10 = 3;
        Object obj = this.b;
        switch (i9) {
            case 0:
                ea eaVar = ((da) obj).a;
                eaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                eaVar.getTransitionParams().j();
                eaVar.getTransitionParams().f();
                eaVar.getTransitionParams().g = true;
                eaVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new mh.x(this, 19));
                ofFloat.start();
                break;
            case 1:
                ((zt) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                j20 j20Var = (j20) obj;
                n20 n20Var = j20Var.f;
                org.telegram.ui.t7 t7Var = j20Var.e;
                t7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                t7Var.getLocationOnScreen(j20Var.C);
                float f10 = j20Var.r.x + j20Var.M;
                p20 p20Var = j20Var.Q;
                float measuredWidth = ((p20Var.getMeasuredWidth() / 2.0f) + f10) - r8[0];
                float measuredWidth2 = ((p20Var.getMeasuredWidth() / 2.0f) + (j20Var.r.y + j20Var.N)) - r8[1];
                boolean z10 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) t7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + n20Var.getMeasuredWidth() < t7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    n20Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / t7Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / n20Var.getMeasuredHeight();
                    n20Var.setTranslationY((int) (measuredWidth2 - (n20Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    n20Var.c(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - n20Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / n20Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / t7Var.getMeasuredHeight(), 1.0f - dp2));
                    n20Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - n20Var.getMeasuredWidth()));
                    n20Var.setTranslationY((int) (measuredWidth2 - (n20Var.getMeasuredHeight() * max)));
                    n20Var.c(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= t7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / t7Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / n20Var.getMeasuredWidth();
                    n20Var.setTranslationX((int) (measuredWidth - (n20Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    n20Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    n20Var.c(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / t7Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / n20Var.getMeasuredWidth();
                    n20Var.setTranslationX((int) (measuredWidth - (n20Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    n20Var.setTranslationY((int) ((measuredWidth2 - n20Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    n20Var.c(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 3:
                ((kh.h6) obj).invalidate();
                break;
            default:
                g81 g81Var = (g81) ((dh.i) obj).b;
                g81Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = g81Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    g81Var.e.setImageDrawable(null);
                    Bitmap bitmap = g81Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        g81Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new b61(this, i10));
                g81Var.r = 0;
                break;
        }
        return true;
    }
}
