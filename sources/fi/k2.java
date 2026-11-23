package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.ui.Components.v90;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class k2 extends v90 {
    public final /* synthetic */ z3 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(z3 z3Var, Context context, long j3, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, j3, 0L, g2Var, h6Var);
        this.W = z3Var;
    }

    @Override // org.telegram.ui.Components.v90
    public final void f(Canvas canvas, Rect rect, float f10) {
        z3 z3Var = this.W;
        a8.b8 b8Var = z3Var.z1;
        b8Var.k(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f10, f10, (Paint) b8Var.a);
        canvas.drawRoundRect(rectF, f10, f10, z3Var.X1);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, z3Var.l0.g("paintDivider"));
        }
    }
}
