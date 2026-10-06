package ai;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
