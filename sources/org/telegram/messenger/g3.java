package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FilePathDatabase b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ CountDownLatch e;

    public /* synthetic */ g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.a = i10;
        this.b = filePathDatabase;
        this.c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$isLocallyCreated$8(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$hasAnotherRefOnFile$4(this.c, this.d, this.e);
                break;
        }
    }
}
