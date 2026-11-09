package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class y3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ c1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y3(c1 c1Var, Object obj, boolean z9, long j3, Object obj2, int i7) {
        this.a = i7;
        this.d = c1Var;
        this.e = obj;
        this.b = z9;
        this.c = j3;
        this.f = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.h3(new z3((d4) this.d, tLObject, this.c, this.b, (String) this.e, (Runnable) this.f));
                break;
            case 1:
                vi viVar = (vi) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                bi.t4 t4Var = (bi.t4) this.f;
                viVar.getClass();
                g0.h3(new bi.l(viVar, tL_error, tLObject, tL_chatInviteImporter, this.b, this.c, t4Var));
                break;
            case 2:
                qp qpVar = (qp) this.d;
                a0.h hVar = (a0.h) this.e;
                lp lpVar = (lp) this.f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        g0.h3(new hi(17, qpVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                g0.h3(new z3(qpVar, tL_channels_sendAsPeers, hVar, this.c, lpVar, this.b));
                break;
            case 3:
                g0.h3(new z3((k00) this.d, tLObject, this.b, this.c, (HashSet) this.e, (Runnable) this.f));
                break;
            default:
                g0.h3(new bi.l((f10) this.d, (b10) this.e, tLObject, this.b, tL_error, this.c, (HashSet) this.f));
                break;
        }
    }

    public /* synthetic */ y3(d4 d4Var, long j3, boolean z9, String str, Runnable runnable) {
        this.a = 0;
        this.d = d4Var;
        this.c = j3;
        this.b = z9;
        this.e = str;
        this.f = runnable;
    }

    public /* synthetic */ y3(qp qpVar, a0.h hVar, long j3, lp lpVar, boolean z9) {
        this.a = 2;
        this.d = qpVar;
        this.e = hVar;
        this.c = j3;
        this.f = lpVar;
        this.b = z9;
    }

    public /* synthetic */ y3(k00 k00Var, boolean z9, long j3, HashSet hashSet, Runnable runnable) {
        this.a = 3;
        this.d = k00Var;
        this.b = z9;
        this.c = j3;
        this.e = hashSet;
        this.f = runnable;
    }
}
