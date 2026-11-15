package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class v2 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(b4 b4Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = b4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.a) {
            case 0:
                b4 b4Var = this.b;
                if (b4Var.p2.getVisibility() == 0 && b4Var.p2.getLayoutParams().width != (x10 = (int) (((b4Var.k2.getX() + b4Var.k2.getMeasuredWidth()) - b4Var.p2.getX()) + org.telegram.messenger.g0.L(10.0f)))) {
                    b4Var.p2.getLayoutParams().width = x10;
                    b4Var.p2.invalidate();
                    b4Var.p2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                b4 b4Var2 = this.b;
                if (b4Var2.n1 && b4Var2.B0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - b4Var2.B0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    float e10 = b4Var2.D0.e(false, b4Var2.F0 ? 1.0f : 0.0f);
                    canvas.scale(e10, e10, b4Var2.B0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.g6 g6Var = b4Var2.B0;
                    g6Var.C = ns.e4;
                    g6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                b4 b4Var3 = this.b;
                if (b4Var3.n1 && b4Var3.A0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - b4Var3.A0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    float e11 = b4Var3.C0.e(false, b4Var3.E0 ? 1.0f : 0.0f);
                    canvas.scale(e11, e11, b4Var3.A0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.g6 g6Var2 = b4Var3.A0;
                    g6Var2.C = ns.e4;
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
