package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class jt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public jt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.s71 s71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (s71Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new sj0(21, this, s71Var));
        }
    }
}
