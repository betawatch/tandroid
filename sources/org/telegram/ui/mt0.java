package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
