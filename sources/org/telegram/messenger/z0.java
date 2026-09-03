package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ResultCallback b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ z0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
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
