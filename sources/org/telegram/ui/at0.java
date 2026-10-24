package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
