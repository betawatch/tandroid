package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class m4 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4(e6 e6Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = e6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.a) {
            case 0:
                e6 e6Var = this.b;
                if (e6Var.F2.getVisibility() == 0 && e6Var.F2.getLayoutParams().width != (x10 = (int) (((e6Var.A2.getX() + e6Var.A2.getMeasuredWidth()) - e6Var.F2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    e6Var.F2.getLayoutParams().width = x10;
                    e6Var.F2.invalidate();
                    e6Var.F2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                e6 e6Var2 = this.b;
                if (e6Var2.D1 && e6Var2.R0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - e6Var2.R0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d = e6Var2.T0.d(e6Var2.V0 ? 1.0f : 0.0f, false);
                    canvas.scale(d, d, e6Var2.R0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.o6 o6Var = e6Var2.R0;
                    o6Var.w = 255;
                    o6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                e6 e6Var3 = this.b;
                if (e6Var3.D1 && e6Var3.Q0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - e6Var3.Q0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d10 = e6Var3.S0.d(e6Var3.U0 ? 1.0f : 0.0f, false);
                    canvas.scale(d10, d10, e6Var3.Q0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.o6 o6Var2 = e6Var3.Q0;
                    o6Var2.w = 255;
                    o6Var2.draw(canvas);
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
