package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cq0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;

    public cq0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PhotoViewer photoViewer = this.a;
        org.telegram.messenger.jj jjVar = photoViewer.T4;
        if (jjVar == null) {
            return;
        }
        org.telegram.messenger.b8.G(jjVar.I1).c0(photoViewer.T4.F0(), true, false);
    }
}
