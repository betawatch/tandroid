package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class z2 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(e4 e4Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = e4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x8;
        switch (this.a) {
            case 0:
                e4 e4Var = this.b;
                if (e4Var.B2.getVisibility() == 0 && e4Var.B2.getLayoutParams().width != (x8 = (int) (((e4Var.w2.getX() + e4Var.w2.getMeasuredWidth()) - e4Var.B2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    e4Var.B2.getLayoutParams().width = x8;
                    e4Var.B2.invalidate();
                    e4Var.B2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                e4 e4Var2 = this.b;
                if (e4Var2.z1 && e4Var2.N0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - e4Var2.N0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d = e4Var2.P0.d(e4Var2.R0 ? 1.0f : 0.0f, false);
                    canvas.scale(d, d, e4Var2.N0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.i6 i6Var = e4Var2.N0;
                    i6Var.w = 255;
                    i6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                e4 e4Var3 = this.b;
                if (e4Var3.z1 && e4Var3.M0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - e4Var3.M0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d10 = e4Var3.O0.d(e4Var3.Q0 ? 1.0f : 0.0f, false);
                    canvas.scale(d10, d10, e4Var3.M0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.i6 i6Var2 = e4Var3.M0;
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
