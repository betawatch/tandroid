package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v0 extends View {
    public final /* synthetic */ ws0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(ws0 ws0Var, Context context) {
        super(context);
        this.a = ws0Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        t0 t0Var = this.a.S0;
        if (t0Var != null) {
            t0Var.d(canvas);
        }
    }
}
