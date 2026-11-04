package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jo0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;

    public jo0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PhotoViewer photoViewer = this.a;
        org.telegram.messenger.zi ziVar = photoViewer.U4;
        if (ziVar == null) {
            return;
        }
        org.telegram.messenger.w7.G(ziVar.I1).c0(photoViewer.U4.F0(), true, false);
    }
}
