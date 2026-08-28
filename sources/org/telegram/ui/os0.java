package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class os0 implements e5.n {
    public final /* synthetic */ PhotoViewer a;

    public os0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // e5.n
    public final void a(long j10, long j11, h3.t0 t0Var, MediaFormat mediaFormat) {
        org.telegram.ui.Components.k61 k61Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F4 && (k61Var = photoViewer.B2) != null) {
            AndroidUtilities.runOnUIThread(new cf0(28, this, k61Var));
        }
    }
}
