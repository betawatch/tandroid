package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ResultCallback b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ f1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
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
