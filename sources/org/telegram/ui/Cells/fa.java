package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.qu;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                ((qu) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                c30 c30Var = (c30) obj;
                g30 g30Var = c30Var.f;
                org.telegram.ui.u7 u7Var = c30Var.e;
                u7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                u7Var.getLocationOnScreen(c30Var.G);
                float f7 = c30Var.r.x + c30Var.Q;
                i30 i30Var = c30Var.U;
                float measuredWidth = ((i30Var.getMeasuredWidth() / 2.0f) + f7) - r7[0];
                float measuredWidth2 = ((i30Var.getMeasuredWidth() / 2.0f) + (c30Var.r.y + c30Var.R)) - r7[1];
                boolean z10 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) u7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + g30Var.getMeasuredWidth() < u7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    g30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / u7Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredHeight();
                    g30Var.setTranslationY((int) (measuredWidth2 - (g30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    g30Var.c(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - g30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / u7Var.getMeasuredHeight(), 1.0f - dp2));
                    g30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - g30Var.getMeasuredWidth()));
                    g30Var.setTranslationY((int) (measuredWidth2 - (g30Var.getMeasuredHeight() * max)));
                    g30Var.c(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= u7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / u7Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredWidth();
                    g30Var.setTranslationX((int) (measuredWidth - (g30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    g30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    g30Var.c(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / u7Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredWidth();
                    g30Var.setTranslationX((int) (measuredWidth - (g30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    g30Var.setTranslationY((int) ((measuredWidth2 - g30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    g30Var.c(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 3:
                ((ci.r6) obj).invalidate();
                break;
            default:
                q91 q91Var = (q91) ((ki.d) obj).b;
                q91Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = q91Var.e;
                int i11 = 4;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    q91Var.e.setImageDrawable(null);
                    Bitmap bitmap = q91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        q91Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new i71(this, i11));
                q91Var.r = 0;
                break;
        }
        return true;
    }
}
