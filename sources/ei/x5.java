package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class x5 extends View {
    public final /* synthetic */ xa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(xa xaVar, Context context) {
        super(context);
        this.a = xaVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        v5 v5Var = this.a.O0;
        if (v5Var != null) {
            v5Var.d(canvas);
        }
    }
}
