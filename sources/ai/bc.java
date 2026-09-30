package ai;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class bc extends k0 {
    public final /* synthetic */ jc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(jc jcVar, Context context) {
        super(context);
        this.a = jcVar;
    }

    @Override // ai.k0, android.view.View
    public final void invalidate() {
        super.invalidate();
        d6 d6Var = this.a.G0;
        if (d6Var != null) {
            d6Var.b();
        }
    }
}
