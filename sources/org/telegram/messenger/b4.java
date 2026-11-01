package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                wi wiVar = (wi) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                oh.g gVar = (oh.g) this.f;
                wiVar.getClass();
                i0.g3(new ch(wiVar, tL_error, tLObject, tL_chatInviteImporter, this.b, this.c, gVar, 1));
                break;
            case 2:
                wp wpVar = (wp) this.d;
                a0.h hVar = (a0.h) this.e;
                rp rpVar = (rp) this.f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        i0.g3(new pi(12, wpVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                i0.g3(new c4(wpVar, tL_channels_sendAsPeers, hVar, this.c, rpVar, this.b));
                break;
            case 3:
                i0.g3(new c4((y00) this.d, tLObject, this.b, this.c, (HashSet) this.e, (Runnable) this.f));
                break;
            default:
                i0.g3(new ch((u10) this.d, (q10) this.e, tLObject, this.b, tL_error, this.c, (HashSet) this.f));
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

    public /* synthetic */ b4(wp wpVar, a0.h hVar, long j10, rp rpVar, boolean z10) {
        this.a = 2;
        this.d = wpVar;
        this.e = hVar;
        this.c = j10;
        this.f = rpVar;
        this.b = z10;
    }

    public /* synthetic */ b4(y00 y00Var, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.a = 3;
        this.d = y00Var;
        this.b = z10;
        this.c = j10;
        this.e = hashSet;
        this.f = runnable;
    }
}
