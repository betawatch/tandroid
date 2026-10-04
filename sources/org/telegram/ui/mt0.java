package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class mt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public mt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.d81 d81Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (d81Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new wj0(19, this, d81Var));
        }
    }
}
