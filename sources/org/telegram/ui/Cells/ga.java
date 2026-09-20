package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d30;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.z20;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ga implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ga(Object obj, int i10) {
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
                ia iaVar = ((ha) obj).a;
                iaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                iaVar.getTransitionParams().j();
                iaVar.getTransitionParams().f();
                iaVar.getTransitionParams().g = true;
                iaVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.t4(this, 13));
                ofFloat.start();
                break;
            case 1:
                ((ou) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                z20 z20Var = (z20) obj;
                d30 d30Var = z20Var.f;
                org.telegram.ui.v7 v7Var = z20Var.e;
                v7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                v7Var.getLocationOnScreen(z20Var.G);
                float f7 = z20Var.r.x + z20Var.Q;
                f30 f30Var = z20Var.U;
                float measuredWidth = ((f30Var.getMeasuredWidth() / 2.0f) + f7) - r8[0];
                float measuredWidth2 = ((f30Var.getMeasuredWidth() / 2.0f) + (z20Var.r.y + z20Var.R)) - r8[1];
                boolean z10 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) v7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + d30Var.getMeasuredWidth() < v7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    d30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / v7Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredHeight();
                    d30Var.setTranslationY((int) (measuredWidth2 - (d30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    d30Var.c(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - d30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / v7Var.getMeasuredHeight(), 1.0f - dp2));
                    d30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - d30Var.getMeasuredWidth()));
                    d30Var.setTranslationY((int) (measuredWidth2 - (d30Var.getMeasuredHeight() * max)));
                    d30Var.c(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= v7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / v7Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredWidth();
                    d30Var.setTranslationX((int) (measuredWidth - (d30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    d30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    d30Var.c(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / v7Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredWidth();
                    d30Var.setTranslationX((int) (measuredWidth - (d30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    d30Var.setTranslationY((int) ((measuredWidth2 - d30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    d30Var.c(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 3:
                ((ci.s6) obj).invalidate();
                break;
            default:
                p91 p91Var = (p91) ((ki.c) obj).b;
                p91Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = p91Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    p91Var.e.setImageDrawable(null);
                    Bitmap bitmap = p91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        p91Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new l71(this, i11));
                p91Var.r = 0;
                break;
        }
        return true;
    }
}
