package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.mt0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s0 extends View {
    public final /* synthetic */ mt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(mt0 mt0Var, Context context) {
        super(context);
        this.a = mt0Var;
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
