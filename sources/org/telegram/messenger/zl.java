package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class zl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ long d;

    public /* synthetic */ zl(qp qpVar, TLRPC.TL_error tL_error, long j3, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = tL_error;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.d;
        TLRPC.TL_error tL_error = this.c;
        qp qpVar = this.b;
        switch (i7) {
            case 0:
                qpVar.F(j3, tL_error.text);
                qs.f(qpVar.currentAccount).k(qs.E5, Long.valueOf(j3));
                break;
            default:
                qpVar.getClass();
                qpVar.F(j3, tL_error.text);
                qpVar.s1.remove(Long.valueOf(j3));
                break;
        }
    }
}
