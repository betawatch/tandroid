package org.telegram.ui;

import android.media.MediaFormat;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class op0 implements d3.w {
    public final /* synthetic */ PhotoViewer a;

    public op0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // d3.w
    public final void b(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.u51 u51Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.I4 && (u51Var = photoViewer.F2) != null) {
            org.telegram.messenger.g0.h3(new sn0(3, this, u51Var));
        }
    }
}
