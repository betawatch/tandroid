package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class bs0 implements org.telegram.ui.Components.d40 {
    public final /* synthetic */ PhotoViewer a;

    public bs0(PhotoViewer photoViewer) {
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
