package fg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gw0;
import org.telegram.ui.ow0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class b2 extends gw0 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ rl0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.s = c2Var;
    }

    @Override // org.telegram.ui.gw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g6 g6Var;
        boolean q10;
        g6 g6Var2;
        switch (this.r) {
            case 0:
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                c2 c2Var = (c2) this.s;
                c2Var.c.m0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f.e, c2Var.c.b0);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), c2Var.c.m0.f);
                super.dispatchDraw(canvas);
                break;
            default:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                ImageView imageView2 = this.c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((ow0) this.s).c;
                premiumPreviewFragment.P.reset();
                premiumPreviewFragment.P.postScale(1.0f, premiumPreviewFragment.K / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.P.postTranslate(0.0f, -this.f.e);
                premiumPreviewFragment.O.setLocalMatrix(premiumPreviewFragment.P);
                canvas.drawRoundRect(rectF2, dp, dp, premiumPreviewFragment.Q);
                g6Var = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).resourceProvider;
                if (g6Var != null) {
                    g6Var2 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).resourceProvider;
                    q10 = g6Var2.a();
                } else {
                    q10 = k6.I.q();
                }
                if (q10) {
                    float dp2 = AndroidUtilities.dp(1.0f);
                    premiumPreviewFragment.N.setStrokeWidth(dp2);
                    canvas.save();
                    canvas.translate(rectF2.left, rectF2.top);
                    rectF2.offset(-rectF2.left, -rectF2.top);
                    float f10 = dp2 / 2.0f;
                    rectF2.inset(f10, f10);
                    canvas.drawRoundRect(rectF2, dp, dp, premiumPreviewFragment.N);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(ow0 ow0Var, Context context) {
        super(context, null);
        this.s = ow0Var;
    }
}
