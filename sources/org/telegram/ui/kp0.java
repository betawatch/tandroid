package org.telegram.ui;

import android.media.MediaFormat;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class kp0 implements d3.v {
    public final /* synthetic */ PhotoViewer a;

    public kp0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // d3.v
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.u51 u51Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (u51Var = photoViewer.G2) != null) {
            org.telegram.messenger.g0.h3(new jd0(29, this, u51Var));
        }
    }
}
