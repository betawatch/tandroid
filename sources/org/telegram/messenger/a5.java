package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class a5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoader.ArtworkLoadTask b;

    public /* synthetic */ a5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.a = i10;
        this.b = artworkLoadTask;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onCancelled$2();
                break;
            default:
                this.b.lambda$onPostExecute$1();
                break;
        }
    }
}
