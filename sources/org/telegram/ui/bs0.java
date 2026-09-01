package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class bs0 implements org.telegram.ui.Components.y30 {
    public final /* synthetic */ PhotoViewer a;

    public bs0(PhotoViewer photoViewer) {
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
