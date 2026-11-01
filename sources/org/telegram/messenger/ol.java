package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class ol implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ long d;

    public /* synthetic */ ol(wp wpVar, TLRPC.TL_error tL_error, long j10, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.c = tL_error;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.d;
        TLRPC.TL_error tL_error = this.c;
        wp wpVar = this.b;
        switch (i10) {
            case 0:
                wpVar.F(j10, tL_error.text);
                at.f(wpVar.currentAccount).k(at.E5, Long.valueOf(j10));
                break;
            default:
                wpVar.getClass();
                wpVar.F(j10, tL_error.text);
                wpVar.s1.remove(Long.valueOf(j10));
                break;
        }
    }
}
