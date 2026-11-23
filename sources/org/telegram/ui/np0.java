package org.telegram.ui;

import android.media.MediaFormat;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
