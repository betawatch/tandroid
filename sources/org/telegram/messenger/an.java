package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class an implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ an(yo yoVar, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = yoVar;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            default:
                this.b.e(this.c);
                break;
        }
    }
}
