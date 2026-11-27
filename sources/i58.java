// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class i58 extends b27 {
    public final /* synthetic */ o68 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i58(o68 o68Var, Context context, long j, e eVar, x53 x53Var) {
        super(context, j, 0L, eVar, x53Var);
        this.V = o68Var;
    }

    @Override // b27
    public final void f(Canvas canvas, Rect rect, float f) {
        o68 o68Var = this.V;
        fp fpVar = o68Var.z1;
        fpVar.i(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = hl.P;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f, f, (Paint) fpVar.a);
        canvas.drawRoundRect(rectF, f, f, o68Var.X1);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, o68Var.l0.d("paintDivider"));
        }
    }
}
