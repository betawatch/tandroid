package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
