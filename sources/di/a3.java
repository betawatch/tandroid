package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a3 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(j4 j4Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = j4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                if (j4Var.o2.getVisibility() == 0 && j4Var.o2.getLayoutParams().width != (x10 = (int) (((j4Var.j2.getX() + j4Var.j2.getMeasuredWidth()) - j4Var.o2.getX()) + org.telegram.messenger.g0.L(10.0f)))) {
                    j4Var.o2.getLayoutParams().width = x10;
                    j4Var.o2.invalidate();
                    j4Var.o2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                j4 j4Var2 = this.b;
                if (j4Var2.m1 && j4Var2.A0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - j4Var2.A0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    float e10 = j4Var2.C0.e(false, j4Var2.E0 ? 1.0f : 0.0f);
                    canvas.scale(e10, e10, j4Var2.A0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.i6 i6Var = j4Var2.A0;
                    i6Var.B = qs.e4;
                    i6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                j4 j4Var3 = this.b;
                if (j4Var3.m1 && j4Var3.z0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - j4Var3.z0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    float e11 = j4Var3.B0.e(false, j4Var3.D0 ? 1.0f : 0.0f);
                    canvas.scale(e11, e11, j4Var3.z0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.i6 i6Var2 = j4Var3.z0;
                    i6Var2.B = qs.e4;
                    i6Var2.draw(canvas);
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
                return drawable == this.b.A0 || super.verifyDrawable(drawable);
            case 2:
                return drawable == this.b.z0 || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
