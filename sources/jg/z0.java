package jg;

import bi.m2;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ mp c;
    public final /* synthetic */ tr d;
    public final /* synthetic */ h1 e;

    public z0(h1 h1Var, String str, String str2, mp mpVar, tr trVar) {
        this.e = h1Var;
        this.a = str;
        this.b = str2;
        this.c = mpVar;
        this.d = trVar;
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
        mp mpVar = this.c;
        TLObject h22 = mpVar.h2(str);
        if (h22 instanceof TLRPC.User) {
            h1Var.R((TLRPC.User) h22);
            return;
        }
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = h1Var.r0;
        h1Var.u0 = ConnectionsManager.getInstance(h1Var.f).sendRequest(tL_contacts_resolveUsername, new m2(this, str, mpVar, this.d, 8));
    }
}
