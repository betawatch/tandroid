package org.telegram.ui;

import android.media.MediaFormat;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
            org.telegram.messenger.g0.g3(new ve0(24, this, f61Var));
        }
    }
}
