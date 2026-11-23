package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q80 b;
    public final /* synthetic */ org.telegram.messenger.c c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 e;

    public /* synthetic */ p80(q80 q80Var, org.telegram.messenger.c cVar, long j3, org.telegram.ui.ActionBar.g2 g2Var, int i7) {
        this.a = i7;
        this.b = q80Var;
        this.c = cVar;
        this.d = j3;
        this.e = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new p80(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                org.telegram.messenger.c cVar = this.c;
                int i7 = cVar.a;
                org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
                long j3 = this.d;
                long j10 = -j3;
                org.telegram.messenger.t3 i12 = u12.i1(j10, false, null);
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(j10));
                org.telegram.messenger.np.u1(i7).l1(j3);
                org.telegram.ui.Components.voip.b2.l(O0, null, false, Boolean.valueOf(i12 == null || !i12.b.rtmp_stream), this.b.h, this.e, cVar);
                break;
        }
    }
}
