package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class h5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoader.ArtworkLoadTask b;

    public /* synthetic */ h5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
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
