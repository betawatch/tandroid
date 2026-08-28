package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FilePathDatabase b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ CountDownLatch e;

    public /* synthetic */ f3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i9) {
        this.a = i9;
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
