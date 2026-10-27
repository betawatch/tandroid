package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoader.HttpImageTask b;

    public /* synthetic */ m5(ImageLoader.HttpImageTask httpImageTask, int i10) {
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
