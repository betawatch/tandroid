package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class bq0 implements org.telegram.ui.Components.c30 {
    public final /* synthetic */ PhotoViewer a;

    public bq0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.P4 = -1;
        org.telegram.messenger.lc lcVar = photoViewer.j5;
        if (lcVar != null) {
            lcVar.a();
            photoViewer.j5 = null;
        }
        photoViewer.l5 = true;
        photoViewer.E2(i10);
        photoViewer.l5 = false;
    }
}
