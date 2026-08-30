package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class y4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ y4(int i10, String str, long j10, long j11) {
        this.d = i10;
        this.e = str;
        this.b = j10;
        this.c = j11;
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

    public /* synthetic */ y4(long j10, long j11, int i10, String str) {
        this.b = j10;
        this.c = j11;
        this.d = i10;
        this.e = str;
    }
}
