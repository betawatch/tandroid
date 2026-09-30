package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class jt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public jt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.u71 u71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (u71Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new xi0(22, this, u71Var));
        }
    }
}
