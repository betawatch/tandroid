// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class b48 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a58 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b48(a58 a58Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = a58Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x;
        byte b = this.a;
        a58 a58Var = this.b;
        switch (b) {
            case 0:
                if (a58Var.v2.getVisibility() == 0 && a58Var.v2.getLayoutParams().width != (x = (int) (((a58Var.q2.getX() + a58Var.q2.getMeasuredWidth()) - a58Var.v2.getX()) + gm.L(10.0f)))) {
                    a58Var.v2.getLayoutParams().width = x;
                    a58Var.v2.invalidate();
                    a58Var.v2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                if (a58Var.t1 && a58Var.H0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - a58Var.H0.c()) - gm.L(6.0f), 0.0f);
                    float e = a58Var.J0.e(false, a58Var.L0 ? 1.0f : 0.0f);
                    canvas.scale(e, e, a58Var.H0.c() / 2.0f, gm.L(20.0f));
                    ho hoVar = a58Var.H0;
                    hoVar.C = nm7.d4;
                    hoVar.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                if (a58Var.t1 && a58Var.G0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - a58Var.G0.c()) - gm.L(6.0f), 0.0f);
                    float e2 = a58Var.I0.e(false, a58Var.K0 ? 1.0f : 0.0f);
                    canvas.scale(e2, e2, a58Var.G0.c() / 2.0f, gm.L(20.0f));
                    ho hoVar2 = a58Var.G0;
                    hoVar2.C = nm7.d4;
                    hoVar2.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        byte b = this.a;
        a58 a58Var = this.b;
        switch (b) {
            case 1:
                return drawable == a58Var.H0 || super.verifyDrawable(drawable);
            case 2:
                return drawable == a58Var.G0 || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
