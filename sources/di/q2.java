package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.ui.Components.g90;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q2 extends g90 {
    public final /* synthetic */ j4 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(j4 j4Var, Context context, long j3, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, j3, 0L, f2Var, h6Var);
        this.V = j4Var;
    }

    @Override // org.telegram.ui.Components.g90
    public final void f(Canvas canvas, Rect rect, float f10) {
        j4 j4Var = this.V;
        a8.b8 b8Var = j4Var.y1;
        b8Var.k(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f10, f10, (Paint) b8Var.a);
        canvas.drawRoundRect(rectF, f10, f10, j4Var.W1);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, j4Var.k0.d("paintDivider"));
        }
    }
}
