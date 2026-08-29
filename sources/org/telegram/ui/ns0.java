package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ns0 implements g5.n {
    public final /* synthetic */ PhotoViewer a;

    public ns0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // g5.n
    public final void a(long j10, long j11, j3.t0 t0Var, MediaFormat mediaFormat) {
        org.telegram.ui.Components.x61 x61Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F4 && (x61Var = photoViewer.B2) != null) {
            AndroidUtilities.runOnUIThread(new lf0(25, this, x61Var));
        }
    }
}
