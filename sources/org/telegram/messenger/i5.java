package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class i5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoader.HttpImageTask b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ i5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.a = i10;
        this.b = httpImageTask;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$reportProgress$0(this.c, this.d);
                break;
            default:
                this.b.lambda$reportProgress$1(this.c, this.d);
                break;
        }
    }
}
