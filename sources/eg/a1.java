package eg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.rp;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class a1 extends k6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ c1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(c1 c1Var, Context context, int i10) {
        super(context, true, true, true);
        this.s = i10;
        this.v = c1Var;
    }

    @Override // org.telegram.ui.Components.k6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                c1 c1Var = this.v;
                if (c1Var.J > 0.0f) {
                    if (c1Var.I == null) {
                        c1Var.I = new rp(c1Var.d.getTextColor());
                    }
                    int dp = (int) ((1.0f - c1Var.J) * AndroidUtilities.dp(24.0f));
                    c1Var.I.setBounds(0, dp, getWidth(), getHeight() + dp);
                    c1Var.I.setAlpha((int) (c1Var.J * 255.0f));
                    c1Var.I.draw(canvas);
                    invalidate();
                }
                float f10 = c1Var.J;
                if (f10 < 1.0f) {
                    if (f10 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (c1Var.J * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (c1Var.J * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
            default:
                c1 c1Var2 = this.v;
                if (c1Var2.J > 0.0f) {
                    if (c1Var2.I == null) {
                        c1Var2.I = new rp(c1Var2.d.getTextColor());
                    }
                    int dp2 = (int) ((1.0f - c1Var2.J) * AndroidUtilities.dp(24.0f));
                    c1Var2.I.setBounds(0, dp2, getWidth(), getHeight() + dp2);
                    c1Var2.I.setAlpha((int) (c1Var2.J * 255.0f));
                    c1Var2.I.draw(canvas);
                    invalidate();
                }
                float f11 = c1Var2.J;
                if (f11 < 1.0f) {
                    if (f11 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (c1Var2.J * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (c1Var2.J * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }
}
