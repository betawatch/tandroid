// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ng2 implements ic5 {
    public final /* synthetic */ oc5 a;
    public final /* synthetic */ wg2 b;

    public ng2(wg2 wg2Var, oc5 oc5Var) {
        this.b = wg2Var;
        this.a = oc5Var;
    }

    @Override // ic5
    public final void d(TLRPC.User user) {
        this.b.x0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // ic5
    public final void f(int i, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        wg2 wg2Var = this.b;
        wg2Var.getMessagesController().l(wg2Var.n, wg2Var, arrayList, i, new gx(this, (byte) 6), new o52((byte) 1), null);
    }
}
