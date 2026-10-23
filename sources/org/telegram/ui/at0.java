package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class at0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public at0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void c(long j10, long j11, b2.w wVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.j81 j81Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (j81Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new bh0(24, this, j81Var));
        }
    }
}
