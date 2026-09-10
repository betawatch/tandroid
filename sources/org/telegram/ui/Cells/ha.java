package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.t50;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ha implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ha(Object obj, int i10) {
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
                ja jaVar = ((ia) obj).a;
                jaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                jaVar.getTransitionParams().j();
                jaVar.getTransitionParams().f();
                jaVar.getTransitionParams().g = true;
                jaVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new v5(this, i11));
                ofFloat.start();
                break;
            case 1:
                ((su) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                j30 j30Var = (j30) obj;
                n30 n30Var = j30Var.f;
                org.telegram.ui.t7 t7Var = j30Var.e;
                t7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                t7Var.getLocationOnScreen(j30Var.G);
                float f7 = j30Var.r.x + j30Var.Q;
                p30 p30Var = j30Var.U;
                float measuredWidth = ((p30Var.getMeasuredWidth() / 2.0f) + f7) - r8[0];
                float measuredWidth2 = ((p30Var.getMeasuredWidth() / 2.0f) + (j30Var.r.y + j30Var.R)) - r8[1];
                boolean z10 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) t7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + n30Var.getMeasuredWidth() < t7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    n30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / t7Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / n30Var.getMeasuredHeight();
                    n30Var.setTranslationY((int) (measuredWidth2 - (n30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    n30Var.c(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - n30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / n30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / t7Var.getMeasuredHeight(), 1.0f - dp2));
                    n30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - n30Var.getMeasuredWidth()));
                    n30Var.setTranslationY((int) (measuredWidth2 - (n30Var.getMeasuredHeight() * max)));
                    n30Var.c(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= t7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / t7Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / n30Var.getMeasuredWidth();
                    n30Var.setTranslationX((int) (measuredWidth - (n30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    n30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    n30Var.c(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / t7Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / n30Var.getMeasuredWidth();
                    n30Var.setTranslationX((int) (measuredWidth - (n30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    n30Var.setTranslationY((int) ((measuredWidth2 - n30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    n30Var.c(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 3:
                ((bi.s7) obj).invalidate();
                break;
            default:
                o91 o91Var = (o91) ((t50) obj).b;
                o91Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = o91Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    o91Var.e.setImageDrawable(null);
                    Bitmap bitmap = o91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        o91Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new k71(this, i11));
                o91Var.r = 0;
                break;
        }
        return true;
    }
}
