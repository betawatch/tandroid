package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class n2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoadOperation.RequestInfo b;

    public /* synthetic */ n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
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
