package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class i6 extends View {
    public final /* synthetic */ qb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(qb qbVar, Context context) {
        super(context);
        this.a = qbVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        g6 g6Var = this.a.O0;
        if (g6Var != null) {
            g6Var.d(canvas);
        }
    }
}
