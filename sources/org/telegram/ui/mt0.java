package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class mt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public mt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.e81 e81Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (e81Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new wj0(19, this, e81Var));
        }
    }
}
