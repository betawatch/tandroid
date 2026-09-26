package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
