package ai;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class cc extends k0 {
    public final /* synthetic */ kc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(kc kcVar, Context context) {
        super(context);
        this.a = kcVar;
    }

    @Override // ai.k0, android.view.View
    public final void invalidate() {
        super.invalidate();
        e6 e6Var = this.a.G0;
        if (e6Var != null) {
            e6Var.b();
        }
    }
}
