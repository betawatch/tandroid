package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class g3 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3(q4 q4Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = q4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x9;
        switch (this.a) {
            case 0:
                q4 q4Var = this.b;
                if (q4Var.u2.getVisibility() == 0 && q4Var.u2.getLayoutParams().width != (x9 = (int) (((q4Var.p2.getX() + q4Var.p2.getMeasuredWidth()) - q4Var.u2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    q4Var.u2.getLayoutParams().width = x9;
                    q4Var.u2.invalidate();
                    q4Var.u2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                q4 q4Var2 = this.b;
                if (q4Var2.s1 && q4Var2.G0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - q4Var2.G0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d = q4Var2.I0.d(q4Var2.K0 ? 1.0f : 0.0f, false);
                    canvas.scale(d, d, q4Var2.G0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.r6 r6Var = q4Var2.G0;
                    r6Var.B = 255;
                    r6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                q4 q4Var3 = this.b;
                if (q4Var3.s1 && q4Var3.F0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - q4Var3.F0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d10 = q4Var3.H0.d(q4Var3.J0 ? 1.0f : 0.0f, false);
                    canvas.scale(d10, d10, q4Var3.F0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.r6 r6Var2 = q4Var3.F0;
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
                return drawable == this.b.G0 || super.verifyDrawable(drawable);
            case 2:
                return drawable == this.b.F0 || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
