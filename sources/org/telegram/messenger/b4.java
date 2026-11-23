package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class b4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ c1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b4(c1 c1Var, Object obj, boolean z10, long j3, Object obj2, int i7) {
        this.a = i7;
        this.d = c1Var;
        this.e = obj;
        this.b = z10;
        this.c = j3;
        this.f = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.g3(new c4((f4) this.d, tLObject, this.c, this.b, (String) this.e, (Runnable) this.f));
                break;
            case 1:
                ti tiVar = (ti) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                di.x3 x3Var = (di.x3) this.f;
                tiVar.getClass();
                g0.g3(new di.k(tiVar, tL_error, tLObject, tL_chatInviteImporter, this.b, this.c, x3Var));
                break;
            case 2:
                np npVar = (np) this.d;
                a0.h hVar = (a0.h) this.e;
                ip ipVar = (ip) this.f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        g0.g3(new gi(13, npVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                g0.g3(new c4(npVar, tL_channels_sendAsPeers, hVar, this.c, ipVar, this.b));
                break;
            case 3:
                g0.g3(new c4((f00) this.d, tLObject, this.b, this.c, (HashSet) this.e, (Runnable) this.f));
                break;
            default:
                g0.g3(new di.k((a10) this.d, (w00) this.e, tLObject, this.b, tL_error, this.c, (HashSet) this.f));
                break;
        }
    }

    public /* synthetic */ b4(f4 f4Var, long j3, boolean z10, String str, Runnable runnable) {
        this.a = 0;
        this.d = f4Var;
        this.c = j3;
        this.b = z10;
        this.e = str;
        this.f = runnable;
    }

    public /* synthetic */ b4(np npVar, a0.h hVar, long j3, ip ipVar, boolean z10) {
        this.a = 2;
        this.d = npVar;
        this.e = hVar;
        this.c = j3;
        this.f = ipVar;
        this.b = z10;
    }

    public /* synthetic */ b4(f00 f00Var, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.a = 3;
        this.d = f00Var;
        this.b = z10;
        this.c = j3;
        this.e = hashSet;
        this.f = runnable;
    }
}
