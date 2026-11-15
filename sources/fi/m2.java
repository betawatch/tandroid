package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.ui.Components.j90;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m2 extends j90 {
    public final /* synthetic */ b4 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(b4 b4Var, Context context, long j3, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j3, 0L, e2Var, e6Var);
        this.W = b4Var;
    }

    @Override // org.telegram.ui.Components.j90
    public final void f(Canvas canvas, Rect rect, float f10) {
        b4 b4Var = this.W;
        a8.b8 b8Var = b4Var.z1;
        b8Var.k(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f10, f10, (Paint) b8Var.a);
        canvas.drawRoundRect(rectF, f10, f10, b4Var.X1);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, b4Var.l0.d("paintDivider"));
        }
    }
}
