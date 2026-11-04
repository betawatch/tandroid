package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.ui.Components.c90;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u2 extends c90 {
    public final /* synthetic */ j4 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(j4 j4Var, Context context, long j10, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j10, 0L, d2Var, e6Var);
        this.W = j4Var;
    }

    @Override // org.telegram.ui.Components.c90
    public final void f(Canvas canvas, Rect rect, float f10) {
        j4 j4Var = this.W;
        l2.e eVar = j4Var.z1;
        eVar.m(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f10, f10, (Paint) eVar.a);
        canvas.drawRoundRect(rectF, f10, f10, j4Var.X1);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, j4Var.l0.d("paintDivider"));
        }
    }
}
