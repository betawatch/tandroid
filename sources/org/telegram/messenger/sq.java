package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class sq implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ sq(hs hsVar, long j10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.e = hsVar;
        this.b = j10;
        this.d = z10;
        this.f = inputPeer;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.a;
        TLObject tLObject = this.f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                ((hs) obj).getMessagesController().y3(this.b, this.d, (TLRPC.InputPeer) tLObject, this.c);
                break;
            default:
                rh.e6 e6Var = (rh.e6) obj;
                int i11 = e6Var.a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j10 = this.b;
                    long j11 = this.c;
                    if (j10 == 0) {
                        TLRPC.UserFull a2 = vp.r1(i11).a2(j11);
                        if (a2 != null && (peerSettings = a2.settings) != null) {
                            peerSettings.flags &= -16385;
                            peerSettings.charge_paid_message_stars = 0L;
                        }
                        vp.r1(i11).e7.edit().putLong(a1.g.l(j11, "dialog_bar_paying_"), 0L).apply();
                        vp.r1(i11).Y2(vp.r1(i11).Z1(Long.valueOf(j11)), vp.r1(i11).L0(Long.valueOf(-j11)), true);
                        i5.r(i11).D(true);
                        zs.f(i11).k(zs.N3, Long.valueOf(j11));
                        break;
                    } else {
                        e6Var.a0(-j10, j11, this.d);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ sq(rh.e6 e6Var, TLObject tLObject, long j10, long j11, boolean z10) {
        this.e = e6Var;
        this.f = tLObject;
        this.b = j10;
        this.c = j11;
        this.d = z10;
    }
}
