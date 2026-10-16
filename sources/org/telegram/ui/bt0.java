package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bt0 implements org.telegram.ui.Components.h40 {
    public final /* synthetic */ PhotoViewer a;

    public bt0(PhotoViewer photoViewer) {
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
        photoViewer.B2(i10);
        photoViewer.l5 = false;
    }
}
