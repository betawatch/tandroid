package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class h6 extends View {
    public final /* synthetic */ mb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(mb mbVar, Context context) {
        super(context);
        this.a = mbVar;
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
