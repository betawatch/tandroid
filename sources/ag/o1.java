package ag;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.j6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o1 extends j6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ s1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(s1 s1Var, Context context, int i10) {
        super(context, true, true, true);
        this.s = i10;
        this.v = s1Var;
    }

    @Override // org.telegram.ui.Components.j6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                s1 s1Var = this.v;
                if (s1Var.I > 0.0f) {
                    if (s1Var.H == null) {
                        s1Var.H = new hp(s1Var.d.getTextColor());
                    }
                    int dp = (int) ((1.0f - s1Var.I) * AndroidUtilities.dp(24.0f));
                    s1Var.H.setBounds(0, dp, getWidth(), getHeight() + dp);
                    s1Var.H.setAlpha((int) (s1Var.I * 255.0f));
                    s1Var.H.draw(canvas);
                    invalidate();
                }
                float f10 = s1Var.I;
                if (f10 < 1.0f) {
                    if (f10 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (s1Var.I * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (s1Var.I * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
            default:
                s1 s1Var2 = this.v;
                if (s1Var2.I > 0.0f) {
                    if (s1Var2.H == null) {
                        s1Var2.H = new hp(s1Var2.d.getTextColor());
                    }
                    int dp2 = (int) ((1.0f - s1Var2.I) * AndroidUtilities.dp(24.0f));
                    s1Var2.H.setBounds(0, dp2, getWidth(), getHeight() + dp2);
                    s1Var2.H.setAlpha((int) (s1Var2.I * 255.0f));
                    s1Var2.H.draw(canvas);
                    invalidate();
                }
                float f11 = s1Var2.I;
                if (f11 < 1.0f) {
                    if (f11 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (s1Var2.I * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (s1Var2.I * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }
}
