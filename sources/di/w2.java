package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gb0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class w2 extends gb0 {
    public final /* synthetic */ q4 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(q4 q4Var, Context context, long j10, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, j10, 0L, r2Var, u6Var);
        this.V = q4Var;
    }

    @Override // org.telegram.ui.Components.gb0
    public final void f(Canvas canvas, Rect rect, float f7) {
        q4 q4Var = this.V;
        aa.m0 m0Var = q4Var.E1;
        m0Var.w(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) m0Var.a);
        canvas.drawRoundRect(rectF, f7, f7, q4Var.c2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, q4Var.q0.d("paintDivider"));
        }
    }
}
