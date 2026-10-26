package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.ma1;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.wu;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        int i11 = 9;
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
                ofFloat.addUpdateListener(new r(this, i11));
                ofFloat.addListener(new kg.e(this, 20));
                ofFloat.start();
                break;
            case 1:
                ((wu) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                k30 k30Var = (k30) obj;
                o30 o30Var = k30Var.f;
                org.telegram.ui.a8 a8Var = k30Var.e;
                a8Var.getViewTreeObserver().removeOnPreDrawListener(this);
                a8Var.getLocationOnScreen(k30Var.G);
                float f7 = k30Var.r.x + k30Var.Q;
                q30 q30Var = k30Var.U;
                float measuredWidth = ((q30Var.getMeasuredWidth() / 2.0f) + f7) - r7[0];
                float measuredWidth2 = ((q30Var.getMeasuredWidth() / 2.0f) + (k30Var.r.y + k30Var.R)) - r7[1];
                boolean z10 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) a8Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + o30Var.getMeasuredWidth() < a8Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    o30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / a8Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / o30Var.getMeasuredHeight();
                    o30Var.setTranslationY((int) (measuredWidth2 - (o30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    o30Var.a(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - o30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / o30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / a8Var.getMeasuredHeight(), 1.0f - dp2));
                    o30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - o30Var.getMeasuredWidth()));
                    o30Var.setTranslationY((int) (measuredWidth2 - (o30Var.getMeasuredHeight() * max)));
                    o30Var.a(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= a8Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / a8Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / o30Var.getMeasuredWidth();
                    o30Var.setTranslationX((int) (measuredWidth - (o30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    o30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    o30Var.a(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / a8Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / o30Var.getMeasuredWidth();
                    o30Var.setTranslationX((int) (measuredWidth - (o30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    o30Var.setTranslationY((int) ((measuredWidth2 - o30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    o30Var.a(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 3:
                ((fi.f6) obj).invalidate();
                break;
            default:
                ma1 ma1Var = (ma1) ((v50) obj).b;
                ma1Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = ma1Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    ma1Var.e.setImageDrawable(null);
                    Bitmap bitmap = ma1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        ma1Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new s51(this, 9));
                ma1Var.r = 0;
                break;
        }
        return true;
    }
}
