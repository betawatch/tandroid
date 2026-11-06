package org.telegram.ui;

import android.media.MediaFormat;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class mp0 implements d3.w {
    public final /* synthetic */ PhotoViewer a;

    public mp0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // d3.w
    public final void b(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.t51 t51Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.I4 && (t51Var = photoViewer.F2) != null) {
            org.telegram.messenger.g0.h3(new qn0(3, this, t51Var));
        }
    }
}
