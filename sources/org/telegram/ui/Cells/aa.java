package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.h30;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.z61;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class aa implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aa(Object obj, int i10) {
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
                ca caVar = ((ba) obj).a;
                caVar.getViewTreeObserver().removeOnPreDrawListener(this);
                caVar.getTransitionParams().j();
                caVar.getTransitionParams().f();
                caVar.getTransitionParams().g = true;
                caVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.u5(this, 12));
                ofFloat.start();
                break;
            case 1:
                ((hu) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                b30 b30Var = (b30) obj;
                f30 f30Var = b30Var.f;
                org.telegram.ui.y7 y7Var = b30Var.e;
                y7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                y7Var.getLocationOnScreen(b30Var.D);
                float f10 = b30Var.r.x + b30Var.N;
                h30 h30Var = b30Var.R;
                float measuredWidth = ((h30Var.getMeasuredWidth() / 2.0f) + f10) - r8[0];
                float measuredWidth2 = ((h30Var.getMeasuredWidth() / 2.0f) + (b30Var.r.y + b30Var.O)) - r8[1];
                boolean z4 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) y7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + f30Var.getMeasuredWidth() < y7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z4) {
                    f30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / y7Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / f30Var.getMeasuredHeight();
                    f30Var.setTranslationY((int) (measuredWidth2 - (f30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    f30Var.c(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - f30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z4) {
                    float dp2 = AndroidUtilities.dp(40.0f) / f30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / y7Var.getMeasuredHeight(), 1.0f - dp2));
                    f30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - f30Var.getMeasuredWidth()));
                    f30Var.setTranslationY((int) (measuredWidth2 - (f30Var.getMeasuredHeight() * max)));
                    f30Var.c(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= y7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / y7Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / f30Var.getMeasuredWidth();
                    f30Var.setTranslationX((int) (measuredWidth - (f30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    f30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    f30Var.c(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / y7Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / f30Var.getMeasuredWidth();
                    f30Var.setTranslationX((int) (measuredWidth - (f30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    f30Var.setTranslationY((int) ((measuredWidth2 - f30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    f30Var.c(measuredWidth, measuredWidth2, 3);
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
