package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
