package ai;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
