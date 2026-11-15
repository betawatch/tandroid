package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class m80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n80 b;
    public final /* synthetic */ org.telegram.messenger.c c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 e;

    public /* synthetic */ m80(n80 n80Var, org.telegram.messenger.c cVar, long j3, org.telegram.ui.ActionBar.e2 e2Var, int i7) {
        this.a = i7;
        this.b = n80Var;
        this.c = cVar;
        this.d = j3;
        this.e = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new m80(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                org.telegram.messenger.c cVar = this.c;
                int i7 = cVar.a;
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
                long j3 = this.d;
                long j10 = -j3;
                org.telegram.messenger.r3 g12 = s12.g1(j10, false, null);
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(j10));
                org.telegram.messenger.np.s1(i7).j1(j3);
                org.telegram.ui.Components.voip.c2.l(M0, null, false, Boolean.valueOf(g12 == null || !g12.b.rtmp_stream), this.b.h, this.e, cVar);
                break;
        }
    }
}
