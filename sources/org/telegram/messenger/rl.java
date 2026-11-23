package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class rl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ long d;

    public /* synthetic */ rl(mp mpVar, TLRPC.TL_error tL_error, long j3, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = tL_error;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.d;
        TLRPC.TL_error tL_error = this.c;
        mp mpVar = this.b;
        switch (i7) {
            case 0:
                mpVar.F(j3, tL_error.text);
                ks.f(mpVar.currentAccount).k(ks.H5, Long.valueOf(j3));
                break;
            default:
                mpVar.getClass();
                mpVar.F(j3, tL_error.text);
                mpVar.v1.remove(Long.valueOf(j3));
                break;
        }
    }
}
