package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoader.ArtworkLoadTask b;

    public /* synthetic */ z4(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
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
