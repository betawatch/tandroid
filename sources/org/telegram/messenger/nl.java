package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class nl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ long d;

    public /* synthetic */ nl(vp vpVar, TLRPC.TL_error tL_error, long j10, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = tL_error;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.d;
        TLRPC.TL_error tL_error = this.c;
        vp vpVar = this.b;
        switch (i10) {
            case 0:
                vpVar.F(j10, tL_error.text);
                zs.f(vpVar.currentAccount).k(zs.E5, Long.valueOf(j10));
                break;
            default:
                vpVar.getClass();
                vpVar.F(j10, tL_error.text);
                vpVar.s1.remove(Long.valueOf(j10));
                break;
        }
    }
}
