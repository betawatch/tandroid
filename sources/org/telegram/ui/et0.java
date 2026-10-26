package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class et0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public et0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.s81 s81Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (s81Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new yl0(13, this, s81Var));
        }
    }
}
