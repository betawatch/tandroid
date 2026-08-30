package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.z61;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ba implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ba(Object obj, int i10) {
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
                da daVar = ((ca) obj).a;
                daVar.getViewTreeObserver().removeOnPreDrawListener(this);
                daVar.getTransitionParams().j();
                daVar.getTransitionParams().f();
                daVar.getTransitionParams().g = true;
                daVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.s5(this, 12));
                ofFloat.start();
                break;
            case 1:
                ((iu) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                a30 a30Var = (a30) obj;
                e30 e30Var = a30Var.f;
                org.telegram.ui.w7 w7Var = a30Var.e;
                w7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                w7Var.getLocationOnScreen(a30Var.D);
                float f10 = a30Var.r.x + a30Var.N;
                g30 g30Var = a30Var.R;
                float measuredWidth = ((g30Var.getMeasuredWidth() / 2.0f) + f10) - r8[0];
                float measuredWidth2 = ((g30Var.getMeasuredWidth() / 2.0f) + (a30Var.r.y + a30Var.O)) - r8[1];
                boolean z4 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) w7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + e30Var.getMeasuredWidth() < w7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z4) {
                    e30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / w7Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredHeight();
                    e30Var.setTranslationY((int) (measuredWidth2 - (e30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    e30Var.c(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - e30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z4) {
                    float dp2 = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / w7Var.getMeasuredHeight(), 1.0f - dp2));
                    e30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - e30Var.getMeasuredWidth()));
                    e30Var.setTranslationY((int) (measuredWidth2 - (e30Var.getMeasuredHeight() * max)));
                    e30Var.c(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= w7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / w7Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredWidth();
                    e30Var.setTranslationX((int) (measuredWidth - (e30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    e30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    e30Var.c(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / w7Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredWidth();
                    e30Var.setTranslationX((int) (measuredWidth - (e30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    e30Var.setTranslationY((int) ((measuredWidth2 - e30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    e30Var.c(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 3:
                ((eg.i0) obj).invalidate();
                break;
            default:
                e91 e91Var = (e91) ((ih.h) obj).b;
                e91Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = e91Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    e91Var.e.setImageDrawable(null);
                    Bitmap bitmap = e91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        e91Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new z61(this, i11));
                e91Var.r = 0;
                break;
        }
        return true;
    }
}
