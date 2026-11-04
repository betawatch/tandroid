package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class pl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ long d;

    public /* synthetic */ pl(hp hpVar, TLRPC.TL_error tL_error, long j10, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.c = tL_error;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        long j10 = this.d;
        TLRPC.TL_error tL_error = this.c;
        hp hpVar = this.b;
        switch (i3) {
            case 0:
                hpVar.F(j10, tL_error.text);
                hs.f(hpVar.currentAccount).k(hs.E5, Long.valueOf(j10));
                break;
            default:
                hpVar.getClass();
                hpVar.F(j10, tL_error.text);
                hpVar.t1.remove(Long.valueOf(j10));
                break;
        }
    }
}
