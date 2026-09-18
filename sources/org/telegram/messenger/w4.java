package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class w4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ w4(int i10, String str, long j3, long j10) {
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

    public /* synthetic */ w4(long j3, long j10, int i10, String str) {
        this.b = j3;
        this.c = j10;
        this.d = i10;
        this.e = str;
    }
}
