package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public gt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.t81 t81Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (t81Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new am0(14, this, t81Var));
        }
    }
}
