package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class s2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoadOperation b;
    public final /* synthetic */ FileLoadOperation.RequestInfo c;

    public /* synthetic */ s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.a = i10;
        this.b = fileLoadOperation;
        this.c = requestInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$startDownloadRequest$27(this.c);
                break;
            default:
                this.b.lambda$clearOperation$24(this.c);
                break;
        }
    }
}
