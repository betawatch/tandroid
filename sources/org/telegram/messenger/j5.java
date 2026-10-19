package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class j5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoader.HttpImageTask b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ j5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
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
