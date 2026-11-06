package di;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class h9 extends x {
    public final /* synthetic */ p9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(Context context, p9 p9Var) {
        super(context);
        this.a = p9Var;
    }

    @Override // di.x, android.view.View
    public final void invalidate() {
        super.invalidate();
        h4 h4Var = this.a.F0;
        if (h4Var != null) {
            h4Var.b();
        }
    }
}
