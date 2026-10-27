package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class s2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoadOperation.RequestInfo b;

    public /* synthetic */ s2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.a = i10;
        this.b = requestInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$26(this.b);
                break;
            default:
                FileLoadOperation.lambda$cancelRequests$17(this.b);
                break;
        }
    }
}
