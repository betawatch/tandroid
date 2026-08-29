package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class y2 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(d4 d4Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = d4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x4;
        switch (this.a) {
            case 0:
                d4 d4Var = this.b;
                if (d4Var.B2.getVisibility() == 0 && d4Var.B2.getLayoutParams().width != (x4 = (int) (((d4Var.w2.getX() + d4Var.w2.getMeasuredWidth()) - d4Var.B2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    d4Var.B2.getLayoutParams().width = x4;
                    d4Var.B2.invalidate();
                    d4Var.B2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                d4 d4Var2 = this.b;
                if (d4Var2.z1 && d4Var2.N0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - d4Var2.N0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d = d4Var2.P0.d(d4Var2.R0 ? 1.0f : 0.0f, false);
                    canvas.scale(d, d, d4Var2.N0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.n6 n6Var = d4Var2.N0;
                    n6Var.w = 255;
                    n6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                d4 d4Var3 = this.b;
                if (d4Var3.z1 && d4Var3.M0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - d4Var3.M0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d10 = d4Var3.O0.d(d4Var3.Q0 ? 1.0f : 0.0f, false);
                    canvas.scale(d10, d10, d4Var3.M0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.n6 n6Var2 = d4Var3.M0;
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
                return drawable == this.b.N0 || super.verifyDrawable(drawable);
            case 2:
                return drawable == this.b.M0 || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
