package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jb0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class w2 extends jb0 {
    public final /* synthetic */ p4 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(p4 p4Var, Context context, long j10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, j10, 0L, o2Var, g6Var);
        this.V = p4Var;
    }

    @Override // org.telegram.ui.Components.jb0
    public final void f(Canvas canvas, Rect rect, float f7) {
        p4 p4Var = this.V;
        com.google.firebase.messaging.l lVar = p4Var.P1;
        lVar.w(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) lVar.a);
        canvas.drawRoundRect(rectF, f7, f7, p4Var.n2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, p4Var.B0.d("paintDivider"));
        }
    }
}
