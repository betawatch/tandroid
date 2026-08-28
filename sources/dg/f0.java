package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f0 extends TableLayout {
    public final /* synthetic */ b6 a;
    public final /* synthetic */ g0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, Context context, b6 b6Var) {
        super(context);
        this.b = g0Var;
        this.a = b6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g0 g0Var = this.b;
        g0Var.v.set(0.0f, 0.0f, getWidth(), getHeight());
        g0Var.s.rewind();
        g0Var.s.addRoundRect(g0Var.v, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        g0Var.r.setColor(i0.a.d(0.1f, f6.v0(f6.d7, this.a), -1));
        g0Var.r.setStrokeWidth(AndroidUtilities.dp(1.0f));
        float height = getHeight() / (g0Var.y.getVisibility() == 0 ? 5.0f : 4.0f);
        for (int i9 = 1; i9 <= 4; i9++) {
            float f10 = height * i9;
            canvas.drawLine(0.0f, f10, getWidth(), f10, g0Var.r);
        }
        float right = LocaleController.isRTL ? g0Var.e.getRight() : g0Var.e.getLeft();
        canvas.drawLine(right, 0.0f, right, getHeight(), g0Var.r);
        g0Var.r.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas.drawPath(g0Var.s, g0Var.r);
    }
}
