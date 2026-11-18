package org.telegram.ui;

import android.media.MediaFormat;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class np0 implements d3.v {
    public final /* synthetic */ PhotoViewer a;

    public np0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // d3.v
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.f61 f61Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (f61Var = photoViewer.G2) != null) {
            org.telegram.messenger.g0.g3(new we0(24, this, f61Var));
        }
    }
}
