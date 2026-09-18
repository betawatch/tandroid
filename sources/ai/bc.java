package ai;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        e6 e6Var = this.a.G0;
        if (e6Var != null) {
            e6Var.b();
        }
    }
}
