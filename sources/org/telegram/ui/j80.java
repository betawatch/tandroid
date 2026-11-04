package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k80 b;
    public final /* synthetic */ org.telegram.messenger.c c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 e;

    public /* synthetic */ j80(k80 k80Var, org.telegram.messenger.c cVar, long j10, org.telegram.ui.ActionBar.d2 d2Var, int i3) {
        this.a = i3;
        this.b = k80Var;
        this.c = cVar;
        this.d = j10;
        this.e = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new j80(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                org.telegram.messenger.c cVar = this.c;
                int i3 = cVar.a;
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
                long j10 = this.d;
                long j11 = -j10;
                org.telegram.messenger.r3 g12 = s12.g1(j11, false, null);
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(j11));
                org.telegram.messenger.hp.s1(i3).j1(j10);
                org.telegram.ui.Components.voip.n1.l(M0, null, false, Boolean.valueOf(g12 == null || !g12.b.rtmp_stream), this.b.h, this.e, cVar);
                break;
        }
    }
}
