package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class m4 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4(f6 f6Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = f6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.a) {
            case 0:
                f6 f6Var = this.b;
                if (f6Var.F2.getVisibility() == 0 && f6Var.F2.getLayoutParams().width != (x10 = (int) (((f6Var.A2.getX() + f6Var.A2.getMeasuredWidth()) - f6Var.F2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    f6Var.F2.getLayoutParams().width = x10;
                    f6Var.F2.invalidate();
                    f6Var.F2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                f6 f6Var2 = this.b;
                if (f6Var2.D1 && f6Var2.R0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - f6Var2.R0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d = f6Var2.T0.d(f6Var2.V0 ? 1.0f : 0.0f, false);
                    canvas.scale(d, d, f6Var2.R0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.n6 n6Var = f6Var2.R0;
                    n6Var.w = 255;
                    n6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                f6 f6Var3 = this.b;
                if (f6Var3.D1 && f6Var3.Q0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - f6Var3.Q0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d10 = f6Var3.S0.d(f6Var3.U0 ? 1.0f : 0.0f, false);
                    canvas.scale(d10, d10, f6Var3.Q0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.n6 n6Var2 = f6Var3.Q0;
                    n6Var2.w = 255;
                    n6Var2.draw(canvas);
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
