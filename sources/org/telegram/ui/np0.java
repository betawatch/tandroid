package org.telegram.ui;

import android.media.MediaFormat;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class np0 implements d3.v {
    public final /* synthetic */ PhotoViewer a;

    public np0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // d3.v
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.i61 i61Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (i61Var = photoViewer.G2) != null) {
            org.telegram.messenger.g0.g3(new fe0(26, this, i61Var));
        }
    }
}
