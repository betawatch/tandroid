package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class b4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ f1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b4(f1 f1Var, Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.a = i10;
        this.d = f1Var;
        this.e = obj;
        this.b = z10;
        this.c = j10;
        this.f = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i0.g3(new c4((g4) this.d, tLObject, this.c, this.b, (String) this.e, (Runnable) this.f));
                break;
            case 1:
                vi viVar = (vi) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                oh.g gVar = (oh.g) this.f;
                viVar.getClass();
                i0.g3(new bh(viVar, tL_error, tLObject, tL_chatInviteImporter, this.b, this.c, gVar, 1));
                break;
            case 2:
                vp vpVar = (vp) this.d;
                a0.h hVar = (a0.h) this.e;
                qp qpVar = (qp) this.f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        i0.g3(new oi(12, vpVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                i0.g3(new c4(vpVar, tL_channels_sendAsPeers, hVar, this.c, qpVar, this.b));
                break;
            case 3:
                i0.g3(new c4((x00) this.d, tLObject, this.b, this.c, (HashSet) this.e, (Runnable) this.f));
                break;
            default:
                i0.g3(new bh((t10) this.d, (p10) this.e, tLObject, this.b, tL_error, this.c, (HashSet) this.f));
                break;
        }
    }

    public /* synthetic */ b4(g4 g4Var, long j10, boolean z10, String str, Runnable runnable) {
        this.a = 0;
        this.d = g4Var;
        this.c = j10;
        this.b = z10;
        this.e = str;
        this.f = runnable;
    }

    public /* synthetic */ b4(vp vpVar, a0.h hVar, long j10, qp qpVar, boolean z10) {
        this.a = 2;
        this.d = vpVar;
        this.e = hVar;
        this.c = j10;
        this.f = qpVar;
        this.b = z10;
    }

    public /* synthetic */ b4(x00 x00Var, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.a = 3;
        this.d = x00Var;
        this.b = z10;
        this.c = j10;
        this.e = hashSet;
        this.f = runnable;
    }
}
