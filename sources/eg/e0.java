package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e0 extends TableLayout {
    public final /* synthetic */ c6 a;
    public final /* synthetic */ f0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, Context context, c6 c6Var) {
        super(context);
        this.b = f0Var;
        this.a = c6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        f0 f0Var = this.b;
        f0Var.v.set(0.0f, 0.0f, getWidth(), getHeight());
        f0Var.s.rewind();
        f0Var.s.addRoundRect(f0Var.v, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        f0Var.r.setColor(i0.b.d(0.1f, g6.v0(g6.d7, this.a), -1));
        f0Var.r.setStrokeWidth(AndroidUtilities.dp(1.0f));
        float height = getHeight() / (f0Var.y.getVisibility() == 0 ? 5.0f : 4.0f);
        for (int i10 = 1; i10 <= 4; i10++) {
            float f10 = height * i10;
            canvas.drawLine(0.0f, f10, getWidth(), f10, f0Var.r);
        }
        float right = LocaleController.isRTL ? f0Var.e.getRight() : f0Var.e.getLeft();
        canvas.drawLine(right, 0.0f, right, getHeight(), f0Var.r);
        f0Var.r.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas.drawPath(f0Var.s, f0Var.r);
    }
}
