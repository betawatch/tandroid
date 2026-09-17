package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final class i6 extends View {
    public final /* synthetic */ rb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(rb rbVar, Context context) {
        super(context);
        this.a = rbVar;
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
