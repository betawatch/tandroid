package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class ns0 implements org.telegram.ui.Components.x30 {
    public final /* synthetic */ PhotoViewer a;

    public ns0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.j5 = null;
        }
        photoViewer.l5 = true;
        photoViewer.A2(i10);
        photoViewer.l5 = false;
    }
}
