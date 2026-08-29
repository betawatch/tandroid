package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.w20;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z9 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z9(Object obj, int i10) {
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
                ba baVar = ((aa) obj).a;
                baVar.getViewTreeObserver().removeOnPreDrawListener(this);
                baVar.getTransitionParams().j();
                baVar.getTransitionParams().f();
                baVar.getTransitionParams().g = true;
                baVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new nh.q5(this, 21));
                ofFloat.start();
                break;
            case 1:
                ((fu) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                w20 w20Var = (w20) obj;
                a30 a30Var = w20Var.f;
                org.telegram.ui.s7 s7Var = w20Var.e;
                s7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                s7Var.getLocationOnScreen(w20Var.C);
                float f9 = w20Var.r.x + w20Var.M;
                c30 c30Var = w20Var.Q;
                float measuredWidth = ((c30Var.getMeasuredWidth() / 2.0f) + f9) - r8[0];
                float measuredWidth2 = ((c30Var.getMeasuredWidth() / 2.0f) + (w20Var.r.y + w20Var.N)) - r8[1];
                boolean z10 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) s7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + a30Var.getMeasuredWidth() < s7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    a30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / s7Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / a30Var.getMeasuredHeight();
                    a30Var.setTranslationY((int) (measuredWidth2 - (a30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    a30Var.c(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - a30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / a30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / s7Var.getMeasuredHeight(), 1.0f - dp2));
                    a30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - a30Var.getMeasuredWidth()));
                    a30Var.setTranslationY((int) (measuredWidth2 - (a30Var.getMeasuredHeight() * max)));
                    a30Var.c(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= s7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / s7Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / a30Var.getMeasuredWidth();
                    a30Var.setTranslationX((int) (measuredWidth - (a30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    a30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    a30Var.c(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / s7Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / a30Var.getMeasuredWidth();
                    a30Var.setTranslationX((int) (measuredWidth - (a30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    a30Var.setTranslationY((int) ((measuredWidth2 - a30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    a30Var.c(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 3:
                ((cg.i0) obj).invalidate();
                break;
            default:
                s81 s81Var = (s81) ((gh.h) obj).b;
                s81Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = s81Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    s81Var.e.setImageDrawable(null);
                    Bitmap bitmap = s81Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        s81Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new o61(this, i11));
                s81Var.r = 0;
                break;
        }
        return true;
    }
}
