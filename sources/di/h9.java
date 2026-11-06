package di;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
