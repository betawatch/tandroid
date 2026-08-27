package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.rv0;
import org.telegram.ui.yv0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w2 extends rv0 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ yk0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.s = x2Var;
    }

    @Override // org.telegram.ui.rv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c6 c6Var;
        boolean q6;
        c6 c6Var2;
        switch (this.r) {
            case 0:
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                x2 x2Var = (x2) this.s;
                x2Var.c.l0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f.e, x2Var.c.a0);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), x2Var.c.l0.f);
                super.dispatchDraw(canvas);
                break;
            default:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                ImageView imageView2 = this.c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((yv0) this.s).c;
                premiumPreviewFragment.O.reset();
                premiumPreviewFragment.O.postScale(1.0f, premiumPreviewFragment.J / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.O.postTranslate(0.0f, -this.f.e);
                premiumPreviewFragment.N.setLocalMatrix(premiumPreviewFragment.O);
                canvas.drawRoundRect(rectF2, dp, dp, premiumPreviewFragment.P);
                c6Var = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).resourceProvider;
                if (c6Var != null) {
                    c6Var2 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).resourceProvider;
                    q6 = c6Var2.a();
                } else {
                    q6 = g6.I.q();
                }
                if (q6) {
                    float dp2 = AndroidUtilities.dp(1.0f);
                    premiumPreviewFragment.M.setStrokeWidth(dp2);
                    canvas.save();
                    canvas.translate(rectF2.left, rectF2.top);
                    rectF2.offset(-rectF2.left, -rectF2.top);
                    float f10 = dp2 / 2.0f;
                    rectF2.inset(f10, f10);
                    canvas.drawRoundRect(rectF2, dp, dp, premiumPreviewFragment.M);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(yv0 yv0Var, Context context) {
        super(context, null);
        this.s = yv0Var;
    }
}
