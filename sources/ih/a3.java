package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class a3 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(i4 i4Var, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = i4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                if (i4Var.B2.getVisibility() == 0 && i4Var.B2.getLayoutParams().width != (x10 = (int) (((i4Var.w2.getX() + i4Var.w2.getMeasuredWidth()) - i4Var.B2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    i4Var.B2.getLayoutParams().width = x10;
                    i4Var.B2.invalidate();
                    i4Var.B2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                i4 i4Var2 = this.b;
                if (i4Var2.z1 && i4Var2.N0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - i4Var2.N0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d = i4Var2.P0.d(i4Var2.R0 ? 1.0f : 0.0f, false);
                    canvas.scale(d, d, i4Var2.N0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.i6 i6Var = i4Var2.N0;
                    i6Var.w = 255;
                    i6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                i4 i4Var3 = this.b;
                if (i4Var3.z1 && i4Var3.M0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - i4Var3.M0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d9 = i4Var3.O0.d(i4Var3.Q0 ? 1.0f : 0.0f, false);
                    canvas.scale(d9, d9, i4Var3.M0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.i6 i6Var2 = i4Var3.M0;
                    i6Var2.w = 255;
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
                return drawable == this.b.N0 || super.verifyDrawable(drawable);
            case 2:
                return drawable == this.b.M0 || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
