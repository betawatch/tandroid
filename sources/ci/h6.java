package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class h6 extends View {
    public final /* synthetic */ nb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(nb nbVar, Context context) {
        super(context);
        this.a = nbVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        f6 f6Var = this.a.O0;
        if (f6Var != null) {
            f6Var.d(canvas);
        }
    }
}
