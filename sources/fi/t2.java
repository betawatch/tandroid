package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class t2 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(z3 z3Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = z3Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.a) {
            case 0:
                z3 z3Var = this.b;
                if (z3Var.p2.getVisibility() == 0 && z3Var.p2.getLayoutParams().width != (x10 = (int) (((z3Var.k2.getX() + z3Var.k2.getMeasuredWidth()) - z3Var.p2.getX()) + org.telegram.messenger.g0.L(10.0f)))) {
                    z3Var.p2.getLayoutParams().width = x10;
                    z3Var.p2.invalidate();
                    z3Var.p2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                z3 z3Var2 = this.b;
                if (z3Var2.n1 && z3Var2.B0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - z3Var2.B0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    float e10 = z3Var2.D0.e(false, z3Var2.F0 ? 1.0f : 0.0f);
                    canvas.scale(e10, e10, z3Var2.B0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.n6 n6Var = z3Var2.B0;
                    n6Var.C = ks.e4;
                    n6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                z3 z3Var3 = this.b;
                if (z3Var3.n1 && z3Var3.A0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - z3Var3.A0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    float e11 = z3Var3.C0.e(false, z3Var3.E0 ? 1.0f : 0.0f);
                    canvas.scale(e11, e11, z3Var3.A0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.n6 n6Var2 = z3Var3.A0;
                    n6Var2.C = ks.e4;
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
                return drawable == this.b.B0 || super.verifyDrawable(drawable);
            case 2:
                return drawable == this.b.A0 || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
