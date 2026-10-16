package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ob0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class s3 extends ob0 {
    public final /* synthetic */ q5 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(q5 q5Var, Context context, long j10, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, j10, 0L, m2Var, c6Var);
        this.V = q5Var;
    }

    @Override // org.telegram.ui.Components.ob0
    public final void f(Canvas canvas, Rect rect, float f7) {
        q5 q5Var = this.V;
        com.google.firebase.messaging.m mVar = q5Var.P1;
        mVar.z(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) mVar.a);
        canvas.drawRoundRect(rectF, f7, f7, q5Var.n2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, q5Var.B0.F("paintDivider"));
        }
    }
}
