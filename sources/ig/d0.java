package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d0 extends TableLayout {
    public final /* synthetic */ f6 a;
    public final /* synthetic */ e0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, Context context, f6 f6Var) {
        super(context);
        this.b = e0Var;
        this.a = f6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e0 e0Var = this.b;
        e0Var.v.set(0.0f, 0.0f, getWidth(), getHeight());
        e0Var.s.rewind();
        e0Var.s.addRoundRect(e0Var.v, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        e0Var.r.setColor(i0.a.d(0.1f, j6.v0(j6.d7, this.a), -1));
        e0Var.r.setStrokeWidth(AndroidUtilities.dp(1.0f));
        float height = getHeight() / (e0Var.y.getVisibility() == 0 ? 5.0f : 4.0f);
        for (int i10 = 1; i10 <= 4; i10++) {
            float f10 = height * i10;
            canvas.drawLine(0.0f, f10, getWidth(), f10, e0Var.r);
        }
        float right = LocaleController.isRTL ? e0Var.e.getRight() : e0Var.e.getLeft();
        canvas.drawLine(right, 0.0f, right, getHeight(), e0Var.r);
        e0Var.r.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas.drawPath(e0Var.s, e0Var.r);
    }
}
