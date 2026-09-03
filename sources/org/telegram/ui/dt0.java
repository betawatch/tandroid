package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class dt0 implements i5.n {
    public final /* synthetic */ PhotoViewer a;

    public dt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // i5.n
    public final void a(long j10, long j11, j3.n0 n0Var, MediaFormat mediaFormat) {
        org.telegram.ui.Components.i71 i71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.G4 && (i71Var = photoViewer.C2) != null) {
            AndroidUtilities.runOnUIThread(new gr0(3, this, i71Var));
        }
    }
}
