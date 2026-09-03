package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class a3 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(f4 f4Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = f4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.a) {
            case 0:
                f4 f4Var = this.b;
                if (f4Var.C2.getVisibility() == 0 && f4Var.C2.getLayoutParams().width != (x10 = (int) (((f4Var.x2.getX() + f4Var.x2.getMeasuredWidth()) - f4Var.C2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    f4Var.C2.getLayoutParams().width = x10;
                    f4Var.C2.invalidate();
                    f4Var.C2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                f4 f4Var2 = this.b;
                if (f4Var2.A1 && f4Var2.O0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - f4Var2.O0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d = f4Var2.Q0.d(f4Var2.S0 ? 1.0f : 0.0f, false);
                    canvas.scale(d, d, f4Var2.O0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.j6 j6Var = f4Var2.O0;
                    j6Var.w = 255;
                    j6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                f4 f4Var3 = this.b;
                if (f4Var3.A1 && f4Var3.N0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - f4Var3.N0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d10 = f4Var3.P0.d(f4Var3.R0 ? 1.0f : 0.0f, false);
                    canvas.scale(d10, d10, f4Var3.N0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.j6 j6Var2 = f4Var3.N0;
                    j6Var2.w = 255;
                    j6Var2.draw(canvas);
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
                return drawable == this.b.O0 || super.verifyDrawable(drawable);
            case 2:
                return drawable == this.b.N0 || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
