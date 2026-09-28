package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
            AndroidUtilities.runOnUIThread(new sj0(21, this, u71Var));
        }
    }
}
