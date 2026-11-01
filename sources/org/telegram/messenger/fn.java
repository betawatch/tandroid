package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class fn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ fn(hp hpVar, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = hpVar;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
