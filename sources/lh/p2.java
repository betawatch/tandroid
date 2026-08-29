package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ka0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class p2 extends ka0 {
    public final /* synthetic */ d4 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(d4 d4Var, Context context, long j10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, j10, 0L, o2Var, c6Var);
        this.R = d4Var;
    }

    @Override // org.telegram.ui.Components.ka0
    public final void f(Canvas canvas, Rect rect, float f9) {
        d4 d4Var = this.R;
        bg.c2 c2Var = d4Var.L1;
        c2Var.w(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f9, f9, (Paint) c2Var.d);
        canvas.drawRoundRect(rectF, f9, f9, d4Var.j2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, d4Var.x0.G("paintDivider"));
        }
    }
}
