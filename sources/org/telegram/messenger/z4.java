package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoader.ArtworkLoadTask b;

    public /* synthetic */ z4(ImageLoader.ArtworkLoadTask artworkLoadTask, int i9) {
        this.a = i9;
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
