package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
