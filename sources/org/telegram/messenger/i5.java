package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class i5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoader.HttpImageTask b;
    public final /* synthetic */ Boolean c;

    public /* synthetic */ i5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.a = i10;
        this.b = httpImageTask;
        this.c = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onPostExecute$3(this.c);
                break;
            default:
                this.b.lambda$onPostExecute$4(this.c);
                break;
        }
    }
}
