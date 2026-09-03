package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class dt0 implements i5.n {
    public final /* synthetic */ PhotoViewer a;

    public dt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // i5.n
    public final void a(long j10, long j11, j3.n0 n0Var, MediaFormat mediaFormat) {
        org.telegram.ui.Components.j71 j71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.G4 && (j71Var = photoViewer.C2) != null) {
            AndroidUtilities.runOnUIThread(new pr0(2, this, j71Var));
        }
    }
}
