package di;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class q9 extends y {
    public final /* synthetic */ y9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(Context context, y9 y9Var) {
        super(context);
        this.a = y9Var;
    }

    @Override // di.y, android.view.View
    public final void invalidate() {
        super.invalidate();
        p4 p4Var = this.a.G0;
        if (p4Var != null) {
            p4Var.b();
        }
    }
}
