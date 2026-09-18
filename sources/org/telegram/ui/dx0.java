package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class dx0 extends ww0 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ org.telegram.ui.Components.ll0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx0(rg.j1 j1Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.s = j1Var;
    }

    @Override // org.telegram.ui.ww0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean q6;
        org.telegram.ui.ActionBar.f6 f6Var2;
        switch (this.r) {
            case 0:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((ex0) this.s).c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f.e);
                premiumPreviewFragment.R.setLocalMatrix(premiumPreviewFragment.S);
                canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.T);
                f6Var = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).resourceProvider;
                if (f6Var != null) {
                    f6Var2 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).resourceProvider;
                    q6 = f6Var2.a();
                } else {
                    q6 = org.telegram.ui.ActionBar.j6.I.q();
                }
                if (q6) {
                    float dp2 = AndroidUtilities.dp(1.0f);
                    premiumPreviewFragment.Q.setStrokeWidth(dp2);
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    rectF.offset(-rectF.left, -rectF.top);
                    float f7 = dp2 / 2.0f;
                    rectF.inset(f7, f7);
                    canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.Q);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
            default:
                RectF rectF2 = AndroidUtilities.rectTmp;
                ImageView imageView2 = this.c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                rg.j1 j1Var = (rg.j1) this.s;
                j1Var.c.p0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f.e, j1Var.c.e0);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), j1Var.c.p0.f);
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx0(ex0 ex0Var, Context context) {
        super(context, null);
        this.s = ex0Var;
    }
}
