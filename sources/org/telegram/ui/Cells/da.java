package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.da1;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.x71;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class da implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ da(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                fa faVar = ((ea) obj).a;
                faVar.getViewTreeObserver().removeOnPreDrawListener(this);
                faVar.getTransitionParams().j();
                faVar.getTransitionParams().f();
                faVar.getTransitionParams().g = true;
                faVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new m.a(this, 18));
                ofFloat.start();
                break;
            case 1:
                ((vu) obj).a.c.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 2:
                i30 i30Var = (i30) obj;
                m30 m30Var = i30Var.f;
                org.telegram.ui.x7 x7Var = i30Var.e;
                x7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                x7Var.getLocationOnScreen(i30Var.G);
                float f7 = i30Var.r.x + i30Var.Q;
                o30 o30Var = i30Var.U;
                float measuredWidth = ((o30Var.getMeasuredWidth() / 2.0f) + f7) - r7[0];
                float measuredWidth2 = ((o30Var.getMeasuredWidth() / 2.0f) + (i30Var.r.y + i30Var.R)) - r7[1];
                boolean z10 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) x7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + m30Var.getMeasuredWidth() < x7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    m30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / x7Var.getMeasuredHeight();
                    float dp = AndroidUtilities.dp(40.0f) / m30Var.getMeasuredHeight();
                    m30Var.setTranslationY((int) (measuredWidth2 - (m30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredHeight, 1.0f - dp)))));
                    m30Var.a(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - m30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / m30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / x7Var.getMeasuredHeight(), 1.0f - dp2));
                    m30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - m30Var.getMeasuredWidth()));
                    m30Var.setTranslationY((int) (measuredWidth2 - (m30Var.getMeasuredHeight() * max)));
                    m30Var.a(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= x7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / x7Var.getMeasuredWidth();
                    float dp3 = AndroidUtilities.dp(40.0f) / m30Var.getMeasuredWidth();
                    m30Var.setTranslationX((int) (measuredWidth - (m30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth3, 1.0f - dp3)))));
                    m30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    m30Var.a(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / x7Var.getMeasuredWidth();
                    float dp4 = AndroidUtilities.dp(40.0f) / m30Var.getMeasuredWidth();
                    m30Var.setTranslationX((int) (measuredWidth - (m30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth4, 1.0f - dp4)))));
                    m30Var.setTranslationY((int) ((measuredWidth2 - m30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    m30Var.a(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 3:
                ((ei.g6) obj).invalidate();
                break;
            default:
                da1 da1Var = (da1) ((t50) obj).b;
                da1Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = da1Var.e;
                int i11 = 4;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    da1Var.e.setImageDrawable(null);
                    Bitmap bitmap = da1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        da1Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new x71(this, i11));
                da1Var.r = 0;
                break;
        }
        return true;
    }
}
