package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.d30;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.z20;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        int i11 = 3;
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
                ofFloat.addListener(new org.telegram.ui.s0(this, 16));
                ofFloat.start();
                break;
            case 1:
                ((mu) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                z20 z20Var = (z20) obj;
                d30 d30Var = z20Var.f;
                org.telegram.ui.u7 u7Var = z20Var.e;
                u7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                u7Var.getLocationOnScreen(z20Var.G);
                float f7 = z20Var.r.x + z20Var.Q;
                f30 f30Var = z20Var.U;
                float measuredWidth = ((f30Var.getMeasuredWidth() / 2.0f) + f7) - r8[0];
                float measuredWidth2 = ((f30Var.getMeasuredWidth() / 2.0f) + (z20Var.r.y + z20Var.R)) - r8[1];
                boolean z10 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) u7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + d30Var.getMeasuredWidth() < u7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    d30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / u7Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredHeight();
                    d30Var.setTranslationY((int) (measuredWidth2 - (d30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    d30Var.c(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - d30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / u7Var.getMeasuredHeight(), 1.0f - dp2));
                    d30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - d30Var.getMeasuredWidth()));
                    d30Var.setTranslationY((int) (measuredWidth2 - (d30Var.getMeasuredHeight() * max)));
                    d30Var.c(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= u7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / u7Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredWidth();
                    d30Var.setTranslationX((int) (measuredWidth - (d30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    d30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    d30Var.c(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / u7Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredWidth();
                    d30Var.setTranslationX((int) (measuredWidth - (d30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    d30Var.setTranslationY((int) ((measuredWidth2 - d30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    d30Var.c(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 3:
                ((di.r6) obj).invalidate();
                break;
            default:
                b91 b91Var = (b91) ((j50) obj).b;
                b91Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = b91Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    b91Var.e.setImageDrawable(null);
                    Bitmap bitmap = b91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        b91Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new x61(this, i11));
                b91Var.r = 0;
                break;
        }
        return true;
    }
}
