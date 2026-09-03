package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ra0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class r2 extends ra0 {
    public final /* synthetic */ f4 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(f4 f4Var, Context context, long j10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, j10, 0L, p2Var, g6Var);
        this.S = f4Var;
    }

    @Override // org.telegram.ui.Components.ra0
    public final void f(Canvas canvas, Rect rect, float f10) {
        f4 f4Var = this.S;
        a9.a aVar = f4Var.M1;
        aVar.x(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f10, f10, (Paint) aVar.a);
        canvas.drawRoundRect(rectF, f10, f10, f4Var.k2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, f4Var.y0.F("paintDivider"));
        }
    }
}
