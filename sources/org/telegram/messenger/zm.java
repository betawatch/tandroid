package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class zm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ zm(xo xoVar, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = xoVar;
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
