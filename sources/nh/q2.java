package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pa0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class q2 extends pa0 {
    public final /* synthetic */ d4 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(d4 d4Var, Context context, long j10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j10, 0L, p2Var, f6Var);
        this.S = d4Var;
    }

    @Override // org.telegram.ui.Components.pa0
    public final void f(Canvas canvas, Rect rect, float f10) {
        d4 d4Var = this.S;
        a9.a aVar = d4Var.M1;
        aVar.w(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f10, f10, (Paint) aVar.a);
        canvas.drawRoundRect(rectF, f10, f10, d4Var.k2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, d4Var.y0.G("paintDivider"));
        }
    }
}
