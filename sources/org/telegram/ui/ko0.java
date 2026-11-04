package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ko0 implements org.telegram.ui.Components.g20 {
    public final /* synthetic */ PhotoViewer a;

    public ko0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i3) {
        PhotoViewer photoViewer = this.a;
        photoViewer.Q4 = -1;
        org.telegram.messenger.cc ccVar = photoViewer.k5;
        if (ccVar != null) {
            ccVar.a();
            photoViewer.k5 = null;
        }
        photoViewer.m5 = true;
        photoViewer.E2(i3);
        photoViewer.m5 = false;
    }
}
