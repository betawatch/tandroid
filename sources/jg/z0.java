package jg;

import bi.g2;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class z0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qp c;
    public final /* synthetic */ yr d;
    public final /* synthetic */ i1 e;

    public z0(i1 i1Var, String str, String str2, qp qpVar, yr yrVar) {
        this.e = i1Var;
        this.a = str;
        this.b = str2;
        this.c = qpVar;
        this.d = yrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i1 i1Var = this.e;
        if (i1Var.y0 != this) {
            return;
        }
        i1Var.y0 = null;
        TLRPC.User user = i1Var.w0;
        if (user != null || i1Var.v0) {
            if (i1Var.v0) {
                return;
            }
            i1Var.T(true, user, this.a, "");
            return;
        }
        String str = this.b;
        i1Var.q0 = str;
        qp qpVar = this.c;
        TLObject f22 = qpVar.f2(str);
        if (f22 instanceof TLRPC.User) {
            i1Var.R((TLRPC.User) f22);
            return;
        }
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = i1Var.q0;
        i1Var.t0 = ConnectionsManager.getInstance(i1Var.f).sendRequest(tL_contacts_resolveUsername, new g2(this, str, qpVar, this.d, 7));
    }
}
