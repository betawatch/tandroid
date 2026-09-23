package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oa0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class c4 extends oa0 {
    public final /* synthetic */ e6 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(e6 e6Var, Context context, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, j3, 0L, n2Var, d6Var);
        this.V = e6Var;
    }

    @Override // org.telegram.ui.Components.oa0
    public final void f(Canvas canvas, Rect rect, float f7) {
        e6 e6Var = this.V;
        com.google.firebase.messaging.n nVar = e6Var.P1;
        nVar.z(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.a);
        canvas.drawRoundRect(rectF, f7, f7, e6Var.n2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, e6Var.B0.G("paintDivider"));
        }
    }
}
