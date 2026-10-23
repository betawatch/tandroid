package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class h3 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(q4 q4Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = q4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.a) {
            case 0:
                q4 q4Var = this.b;
                if (q4Var.F2.getVisibility() == 0 && q4Var.F2.getLayoutParams().width != (x10 = (int) (((q4Var.A2.getX() + q4Var.A2.getMeasuredWidth()) - q4Var.F2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    q4Var.F2.getLayoutParams().width = x10;
                    q4Var.F2.invalidate();
                    q4Var.F2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                q4 q4Var2 = this.b;
                if (q4Var2.D1 && q4Var2.R0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - q4Var2.R0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d = q4Var2.T0.d(q4Var2.V0 ? 1.0f : 0.0f, false);
                    canvas.scale(d, d, q4Var2.R0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.p6 p6Var = q4Var2.R0;
                    p6Var.B = 255;
                    p6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                q4 q4Var3 = this.b;
                if (q4Var3.D1 && q4Var3.Q0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - q4Var3.Q0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d10 = q4Var3.S0.d(q4Var3.U0 ? 1.0f : 0.0f, false);
                    canvas.scale(d10, d10, q4Var3.Q0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.p6 p6Var2 = q4Var3.Q0;
                    p6Var2.B = 255;
                    p6Var2.draw(canvas);
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
