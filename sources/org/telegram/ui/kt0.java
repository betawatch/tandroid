package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class kt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public kt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void b(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.f71 f71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (f71Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new gl0(16, this, f71Var));
        }
    }
}
