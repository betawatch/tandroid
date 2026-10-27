package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class o5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoader.HttpImageTask b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ o5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
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
