package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n80 b;
    public final /* synthetic */ org.telegram.messenger.c c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 e;

    public /* synthetic */ m80(n80 n80Var, org.telegram.messenger.c cVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, int i7) {
        this.a = i7;
        this.b = n80Var;
        this.c = cVar;
        this.d = j3;
        this.e = f2Var;
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
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
                long j3 = this.d;
                long j10 = -j3;
                org.telegram.messenger.r3 g12 = s12.g1(j10, false, null);
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j10));
                org.telegram.messenger.qp.s1(i7).j1(j3);
                org.telegram.ui.Components.voip.y1.l(M0, null, false, Boolean.valueOf(g12 == null || !g12.b.rtmp_stream), this.b.h, this.e, cVar);
                break;
        }
    }
}
