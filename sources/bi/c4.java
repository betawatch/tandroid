package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class c4 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ q5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4(q5 q5Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = q5Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.a) {
            case 0:
                q5 q5Var = this.b;
                if (q5Var.F2.getVisibility() == 0 && q5Var.F2.getLayoutParams().width != (x10 = (int) (((q5Var.A2.getX() + q5Var.A2.getMeasuredWidth()) - q5Var.F2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    q5Var.F2.getLayoutParams().width = x10;
                    q5Var.F2.invalidate();
                    q5Var.F2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                q5 q5Var2 = this.b;
                if (q5Var2.D1 && q5Var2.R0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - q5Var2.R0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d = q5Var2.T0.d(q5Var2.V0 ? 1.0f : 0.0f, false);
                    canvas.scale(d, d, q5Var2.R0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.r6 r6Var = q5Var2.R0;
                    r6Var.B = 255;
                    r6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                q5 q5Var3 = this.b;
                if (q5Var3.D1 && q5Var3.Q0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - q5Var3.Q0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d10 = q5Var3.S0.d(q5Var3.U0 ? 1.0f : 0.0f, false);
                    canvas.scale(d10, d10, q5Var3.Q0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.r6 r6Var2 = q5Var3.Q0;
                    r6Var2.B = 255;
                    r6Var2.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 1:
                return drawable == this.b.R0 || super.verifyDrawable(drawable);
            case 2:
                return drawable == this.b.Q0 || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
