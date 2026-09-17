package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final /* synthetic */ class e5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoader.HttpImageTask b;
    public final /* synthetic */ Boolean c;

    public /* synthetic */ e5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
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
