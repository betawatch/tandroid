package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.mt0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u0 extends View {
    public final /* synthetic */ mt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(mt0 mt0Var, Context context) {
        super(context);
        this.a = mt0Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        s0 s0Var = this.a.T0;
        if (s0Var != null) {
            s0Var.d(canvas);
        }
    }
}
