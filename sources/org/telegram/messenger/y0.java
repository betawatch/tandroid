package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ResultCallback b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ y0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = resultCallback;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.onError(this.c);
                break;
            default:
                this.b.onError(this.c);
                break;
        }
    }
}
