package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ft0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u0 extends View {
    public final /* synthetic */ ft0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ft0 ft0Var, Context context) {
        super(context);
        this.a = ft0Var;
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
