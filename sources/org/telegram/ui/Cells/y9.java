package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.yt;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y9 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y9(Object obj, int i10) {
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
                aa aaVar = ((z9) obj).a;
                aaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                aaVar.getTransitionParams().j();
                aaVar.getTransitionParams().f();
                aaVar.getTransitionParams().g = true;
                aaVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new lh.h9(this, 21));
                ofFloat.start();
                break;
            case 1:
                ((yt) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                n20 n20Var = (n20) obj;
                r20 r20Var = n20Var.f;
                org.telegram.ui.u7 u7Var = n20Var.e;
                u7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                u7Var.getLocationOnScreen(n20Var.C);
                float f10 = n20Var.r.x + n20Var.M;
                t20 t20Var = n20Var.Q;
                float measuredWidth = ((t20Var.getMeasuredWidth() / 2.0f) + f10) - r8[0];
                float measuredWidth2 = ((t20Var.getMeasuredWidth() / 2.0f) + (n20Var.r.y + n20Var.N)) - r8[1];
                boolean z10 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) u7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + r20Var.getMeasuredWidth() < u7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    r20Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / u7Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / r20Var.getMeasuredHeight();
                    r20Var.setTranslationY((int) (measuredWidth2 - (r20Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    r20Var.c(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - r20Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / r20Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / u7Var.getMeasuredHeight(), 1.0f - dp2));
                    r20Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - r20Var.getMeasuredWidth()));
                    r20Var.setTranslationY((int) (measuredWidth2 - (r20Var.getMeasuredHeight() * max)));
                    r20Var.c(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= u7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / u7Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / r20Var.getMeasuredWidth();
                    r20Var.setTranslationX((int) (measuredWidth - (r20Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    r20Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    r20Var.c(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / u7Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / r20Var.getMeasuredWidth();
                    r20Var.setTranslationX((int) (measuredWidth - (r20Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    r20Var.setTranslationY((int) ((measuredWidth2 - r20Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    r20Var.c(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 3:
                ((ag.t0) obj).invalidate();
                break;
            default:
                i81 i81Var = (i81) ((eh.h) obj).b;
                i81Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = i81Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    i81Var.e.setImageDrawable(null);
                    Bitmap bitmap = i81Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        i81Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new d61(this, i11));
                i81Var.r = 0;
                break;
        }
        return true;
    }
}
