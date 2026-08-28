package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class y5 extends View {
    public final /* synthetic */ ya a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(ya yaVar, Context context) {
        super(context);
        this.a = yaVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        w5 w5Var = this.a.K0;
        if (w5Var != null) {
            w5Var.d(canvas);
        }
    }
}
