package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class wl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ long d;

    public /* synthetic */ wl(np npVar, TLRPC.TL_error tL_error, long j3, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = tL_error;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.d;
        TLRPC.TL_error tL_error = this.c;
        np npVar = this.b;
        switch (i7) {
            case 0:
                npVar.F(j3, tL_error.text);
                ns.f(npVar.currentAccount).k(ns.E5, Long.valueOf(j3));
                break;
            default:
                npVar.getClass();
                npVar.F(j3, tL_error.text);
                npVar.t1.remove(Long.valueOf(j3));
                break;
        }
    }
}
