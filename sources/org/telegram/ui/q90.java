package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r90 b;
    public final /* synthetic */ org.telegram.messenger.c c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 e;

    public /* synthetic */ q90(r90 r90Var, org.telegram.messenger.c cVar, long j10, org.telegram.ui.ActionBar.k2 k2Var, int i10) {
        this.a = i10;
        this.b = r90Var;
        this.c = cVar;
        this.d = j10;
        this.e = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new q90(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                org.telegram.messenger.c cVar = this.c;
                int i10 = cVar.a;
                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
                long j10 = this.d;
                long j11 = -j10;
                org.telegram.messenger.u3 f12 = r12.f1(j11, false, null);
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(j11));
                org.telegram.messenger.vp.r1(i10).i1(j10);
                org.telegram.ui.Components.voip.m1.l(L0, null, false, Boolean.valueOf(f12 == null || !f12.b.rtmp_stream), this.b.h, this.e, cVar);
                break;
        }
    }
}
