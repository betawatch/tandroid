package jg;

import org.telegram.messenger.np;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class z0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ np c;
    public final /* synthetic */ vr d;
    public final /* synthetic */ h1 e;

    public z0(h1 h1Var, String str, String str2, np npVar, vr vrVar) {
        this.e = h1Var;
        this.a = str;
        this.b = str2;
        this.c = npVar;
        this.d = vrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h1 h1Var = this.e;
        if (h1Var.z0 != this) {
            return;
        }
        h1Var.z0 = null;
        TLRPC.User user = h1Var.x0;
        if (user != null || h1Var.w0) {
            if (h1Var.w0) {
                return;
            }
            h1Var.T(true, user, this.a, "");
            return;
        }
        String str = this.b;
        h1Var.r0 = str;
        np npVar = this.c;
        TLObject f22 = npVar.f2(str);
        if (f22 instanceof TLRPC.User) {
            h1Var.R((TLRPC.User) f22);
            return;
        }
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = h1Var.r0;
        h1Var.u0 = ConnectionsManager.getInstance(h1Var.f).sendRequest(tL_contacts_resolveUsername, new bi.l1(this, str, npVar, this.d, 8));
    }
}
