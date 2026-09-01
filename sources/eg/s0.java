package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ht0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class s0 extends View {
    public final /* synthetic */ ht0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ht0 ht0Var, Context context) {
        super(context);
        this.a = ht0Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        q0 q0Var = this.a.T0;
        if (q0Var != null) {
            q0Var.d(canvas);
        }
    }
}
