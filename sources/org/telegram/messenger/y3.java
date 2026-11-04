package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class y3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ c1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y3(c1 c1Var, Object obj, boolean z10, long j10, Object obj2, int i3) {
        this.a = i3;
        this.d = c1Var;
        this.e = obj;
        this.b = z10;
        this.c = j10;
        this.f = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.h3(new z3((d4) this.d, tLObject, this.c, this.b, (String) this.e, (Runnable) this.f));
                break;
            case 1:
                mi miVar = (mi) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                ci.d4 d4Var = (ci.d4) this.f;
                miVar.getClass();
                g0.h3(new ci.k(miVar, tL_error, tLObject, tL_chatInviteImporter, this.b, this.c, d4Var));
                break;
            case 2:
                hp hpVar = (hp) this.d;
                a0.h hVar = (a0.h) this.e;
                cp cpVar = (cp) this.f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        g0.h3(new yh(17, hpVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                g0.h3(new z3(hpVar, tL_channels_sendAsPeers, hVar, this.c, cpVar, this.b));
                break;
            case 3:
                g0.h3(new z3((c00) this.d, tLObject, this.b, this.c, (HashSet) this.e, (Runnable) this.f));
                break;
            default:
                g0.h3(new ci.k((x00) this.d, (t00) this.e, tLObject, this.b, tL_error, this.c, (HashSet) this.f));
                break;
        }
    }

    public /* synthetic */ y3(d4 d4Var, long j10, boolean z10, String str, Runnable runnable) {
        this.a = 0;
        this.d = d4Var;
        this.c = j10;
        this.b = z10;
        this.e = str;
        this.f = runnable;
    }

    public /* synthetic */ y3(hp hpVar, a0.h hVar, long j10, cp cpVar, boolean z10) {
        this.a = 2;
        this.d = hpVar;
        this.e = hVar;
        this.c = j10;
        this.f = cpVar;
        this.b = z10;
    }

    public /* synthetic */ y3(c00 c00Var, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.a = 3;
        this.d = c00Var;
        this.b = z10;
        this.c = j10;
        this.e = hashSet;
        this.f = runnable;
    }
}
