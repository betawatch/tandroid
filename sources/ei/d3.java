package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d3 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(j4 j4Var, Context context, int i3) {
        super(context);
        this.a = i3;
        this.b = j4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                if (j4Var.p2.getVisibility() == 0 && j4Var.p2.getLayoutParams().width != (x10 = (int) (((j4Var.k2.getX() + j4Var.k2.getMeasuredWidth()) - j4Var.p2.getX()) + org.telegram.messenger.g0.L(10.0f)))) {
                    j4Var.p2.getLayoutParams().width = x10;
                    j4Var.p2.invalidate();
                    j4Var.p2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                j4 j4Var2 = this.b;
                if (j4Var2.n1 && j4Var2.B0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - j4Var2.B0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    float e10 = j4Var2.D0.e(false, j4Var2.F0 ? 1.0f : 0.0f);
                    canvas.scale(e10, e10, j4Var2.B0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.g6 g6Var = j4Var2.B0;
                    g6Var.B = hs.e4;
                    g6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                j4 j4Var3 = this.b;
                if (j4Var3.n1 && j4Var3.A0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - j4Var3.A0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    float e11 = j4Var3.C0.e(false, j4Var3.E0 ? 1.0f : 0.0f);
                    canvas.scale(e11, e11, j4Var3.A0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.g6 g6Var2 = j4Var3.A0;
                    g6Var2.B = hs.e4;
                    g6Var2.draw(canvas);
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
                return drawable == this.b.B0 || super.verifyDrawable(drawable);
            case 2:
                return drawable == this.b.A0 || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
