package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oa0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class p3 extends oa0 {
    public final /* synthetic */ o5 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(o5 o5Var, Context context, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j3, 0L, n2Var, f6Var);
        this.V = o5Var;
    }

    @Override // org.telegram.ui.Components.oa0
    public final void f(Canvas canvas, Rect rect, float f7) {
        o5 o5Var = this.V;
        com.google.firebase.messaging.n nVar = o5Var.P1;
        nVar.z(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.a);
        canvas.drawRoundRect(rectF, f7, f7, o5Var.n2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, o5Var.B0.G("paintDivider"));
        }
    }
}
