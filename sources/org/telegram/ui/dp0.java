package org.telegram.ui;

import android.media.MediaFormat;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dp0 implements c3.w {
    public final /* synthetic */ PhotoViewer a;

    public dp0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // c3.w
    public final void a(long j10, long j11, d2.v vVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.m51 m51Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.K4 && (m51Var = photoViewer.G2) != null) {
            org.telegram.messenger.g0.h3(new hk0(7, this, m51Var));
        }
    }
}
