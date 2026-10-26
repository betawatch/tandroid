package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class is0 implements org.telegram.ui.Components.f40 {
    public final /* synthetic */ PhotoViewer a;

    public is0(PhotoViewer photoViewer) {
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
        photoViewer.D2(i10);
        photoViewer.l5 = false;
    }
}
