package org.telegram.ui;

import android.media.MediaFormat;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class lp0 implements d3.w {
    public final /* synthetic */ PhotoViewer a;

    public lp0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // d3.w
    public final void b(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.n51 n51Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.I4 && (n51Var = photoViewer.F2) != null) {
            org.telegram.messenger.g0.h3(new qn0(3, this, n51Var));
        }
    }
}
