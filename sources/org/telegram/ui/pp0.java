package org.telegram.ui;

import android.media.MediaFormat;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pp0 implements d3.w {
    public final /* synthetic */ PhotoViewer a;

    public pp0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // d3.w
    public final void b(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.t51 t51Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.I4 && (t51Var = photoViewer.F2) != null) {
            org.telegram.messenger.g0.h3(new tn0(4, this, t51Var));
        }
    }
}
