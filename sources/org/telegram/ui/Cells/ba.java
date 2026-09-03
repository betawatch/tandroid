package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.ku;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ((ku) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                c30 c30Var = (c30) obj;
                g30 g30Var = c30Var.f;
                org.telegram.ui.w7 w7Var = c30Var.e;
                w7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                w7Var.getLocationOnScreen(c30Var.D);
                float f10 = c30Var.r.x + c30Var.N;
                i30 i30Var = c30Var.R;
                float measuredWidth = ((i30Var.getMeasuredWidth() / 2.0f) + f10) - r8[0];
                float measuredWidth2 = ((i30Var.getMeasuredWidth() / 2.0f) + (c30Var.r.y + c30Var.O)) - r8[1];
                boolean z4 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) w7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + g30Var.getMeasuredWidth() < w7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z4) {
                    g30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / w7Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredHeight();
                    g30Var.setTranslationY((int) (measuredWidth2 - (g30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    g30Var.c(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - g30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z4) {
                    float dp2 = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / w7Var.getMeasuredHeight(), 1.0f - dp2));
                    g30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - g30Var.getMeasuredWidth()));
                    g30Var.setTranslationY((int) (measuredWidth2 - (g30Var.getMeasuredHeight() * max)));
                    g30Var.c(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= w7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / w7Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredWidth();
                    g30Var.setTranslationX((int) (measuredWidth - (g30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    g30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    g30Var.c(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / w7Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredWidth();
                    g30Var.setTranslationX((int) (measuredWidth - (g30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    g30Var.setTranslationY((int) ((measuredWidth2 - g30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    g30Var.c(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 3:
                ((fg.i0) obj).invalidate();
                break;
            default:
                e91 e91Var = (e91) ((jh.h) obj).b;
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
                AndroidUtilities.runOnUIThread(new a71(this, i11));
                e91Var.r = 0;
                break;
        }
        return true;
    }
}
