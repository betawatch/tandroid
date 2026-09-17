package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final /* synthetic */ class v4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ v4(int i10, String str, long j3, long j10) {
        this.d = i10;
        this.e = str;
        this.b = j3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ImageLoader.5.lambda$fileLoadProgressChanged$8(this.d, this.e, this.b, this.c);
                break;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.b, this.c, this.d, this.e);
                break;
        }
    }

    public /* synthetic */ v4(long j3, long j10, int i10, String str) {
        this.b = j3;
        this.c = j10;
        this.d = i10;
        this.e = str;
    }
}
