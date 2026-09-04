package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class f5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoader.HttpImageTask b;
    public final /* synthetic */ Boolean c;

    public /* synthetic */ f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
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
