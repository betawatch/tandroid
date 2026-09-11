package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class z3 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3(o5 o5Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = o5Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.a) {
            case 0:
                o5 o5Var = this.b;
                if (o5Var.F2.getVisibility() == 0 && o5Var.F2.getLayoutParams().width != (x10 = (int) (((o5Var.A2.getX() + o5Var.A2.getMeasuredWidth()) - o5Var.F2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    o5Var.F2.getLayoutParams().width = x10;
                    o5Var.F2.invalidate();
                    o5Var.F2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                o5 o5Var2 = this.b;
                if (o5Var2.D1 && o5Var2.R0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - o5Var2.R0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d = o5Var2.T0.d(o5Var2.V0 ? 1.0f : 0.0f, false);
                    canvas.scale(d, d, o5Var2.R0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.p6 p6Var = o5Var2.R0;
                    p6Var.w = 255;
                    p6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                o5 o5Var3 = this.b;
                if (o5Var3.D1 && o5Var3.Q0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - o5Var3.Q0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d10 = o5Var3.S0.d(o5Var3.U0 ? 1.0f : 0.0f, false);
                    canvas.scale(d10, d10, o5Var3.Q0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.p6 p6Var2 = o5Var3.Q0;
                    p6Var2.w = 255;
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
