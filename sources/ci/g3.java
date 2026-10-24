package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class g3 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3(p4 p4Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = p4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.a) {
            case 0:
                p4 p4Var = this.b;
                if (p4Var.F2.getVisibility() == 0 && p4Var.F2.getLayoutParams().width != (x10 = (int) (((p4Var.A2.getX() + p4Var.A2.getMeasuredWidth()) - p4Var.F2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    p4Var.F2.getLayoutParams().width = x10;
                    p4Var.F2.invalidate();
                    p4Var.F2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                p4 p4Var2 = this.b;
                if (p4Var2.D1 && p4Var2.R0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - p4Var2.R0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d = p4Var2.T0.d(p4Var2.V0 ? 1.0f : 0.0f, false);
                    canvas.scale(d, d, p4Var2.R0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.p6 p6Var = p4Var2.R0;
                    p6Var.B = 255;
                    p6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                p4 p4Var3 = this.b;
                if (p4Var3.D1 && p4Var3.Q0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - p4Var3.Q0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d10 = p4Var3.S0.d(p4Var3.U0 ? 1.0f : 0.0f, false);
                    canvas.scale(d10, d10, p4Var3.Q0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.p6 p6Var2 = p4Var3.Q0;
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
