package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class a3 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(i4 i4Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = i4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                if (i4Var.o2.getVisibility() == 0 && i4Var.o2.getLayoutParams().width != (x10 = (int) (((i4Var.j2.getX() + i4Var.j2.getMeasuredWidth()) - i4Var.o2.getX()) + org.telegram.messenger.g0.L(10.0f)))) {
                    i4Var.o2.getLayoutParams().width = x10;
                    i4Var.o2.invalidate();
                    i4Var.o2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                i4 i4Var2 = this.b;
                if (i4Var2.m1 && i4Var2.A0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - i4Var2.A0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    float e10 = i4Var2.C0.e(false, i4Var2.E0 ? 1.0f : 0.0f);
                    canvas.scale(e10, e10, i4Var2.A0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.i6 i6Var = i4Var2.A0;
                    i6Var.B = qs.e4;
                    i6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                i4 i4Var3 = this.b;
                if (i4Var3.m1 && i4Var3.z0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - i4Var3.z0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    float e11 = i4Var3.B0.e(false, i4Var3.D0 ? 1.0f : 0.0f);
                    canvas.scale(e11, e11, i4Var3.z0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.i6 i6Var2 = i4Var3.z0;
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
