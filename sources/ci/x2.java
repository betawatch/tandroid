package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ib0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class x2 extends ib0 {
    public final /* synthetic */ q4 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(q4 q4Var, Context context, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, j10, 0L, n2Var, d6Var);
        this.V = q4Var;
    }

    @Override // org.telegram.ui.Components.ib0
    public final void f(Canvas canvas, Rect rect, float f7) {
        q4 q4Var = this.V;
        com.google.firebase.messaging.l lVar = q4Var.P1;
        lVar.E(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) lVar.a);
        canvas.drawRoundRect(rectF, f7, f7, q4Var.n2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, q4Var.B0.n("paintDivider"));
        }
    }
}
