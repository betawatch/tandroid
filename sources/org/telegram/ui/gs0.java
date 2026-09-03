package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gs0 implements org.telegram.ui.Components.x30 {
    public final /* synthetic */ PhotoViewer a;

    public gs0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.M4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.g5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.g5 = null;
        }
        photoViewer.i5 = true;
        photoViewer.B2(i10);
        photoViewer.i5 = false;
    }
}
