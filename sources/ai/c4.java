package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ya0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class c4 extends ya0 {
    public final /* synthetic */ f6 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(f6 f6Var, Context context, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var2) {
        super(context, j3, 0L, n2Var, f6Var2);
        this.V = f6Var;
    }

    @Override // org.telegram.ui.Components.ya0
    public final void f(Canvas canvas, Rect rect, float f7) {
        f6 f6Var = this.V;
        com.google.firebase.messaging.n nVar = f6Var.P1;
        nVar.z(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.a);
        canvas.drawRoundRect(rectF, f7, f7, f6Var.n2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, f6Var.B0.G("paintDivider"));
        }
    }
}
