package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final /* synthetic */ class e5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoader.HttpImageTask b;

    public /* synthetic */ e5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.a = i10;
        this.b = httpImageTask;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onCancelled$6();
                break;
            case 1:
                this.b.lambda$onCancelled$8();
                break;
            case 2:
                this.b.lambda$onPostExecute$5();
                break;
            default:
                this.b.lambda$onCancelled$7();
                break;
        }
    }
}
