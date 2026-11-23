package org.telegram.ui;

import android.media.MediaFormat;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class np0 implements d3.v {
    public final /* synthetic */ PhotoViewer a;

    public np0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // d3.v
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.h61 h61Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (h61Var = photoViewer.G2) != null) {
            org.telegram.messenger.g0.g3(new mp0(0, this, h61Var));
        }
    }
}
