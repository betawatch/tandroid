package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoadOperation.RequestInfo b;

    public /* synthetic */ o2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.a = i10;
        this.b = requestInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$25(this.b);
                break;
            default:
                FileLoadOperation.lambda$cancelRequests$16(this.b);
                break;
        }
    }
}
