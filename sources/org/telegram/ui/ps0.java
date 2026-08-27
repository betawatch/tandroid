package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ps0 implements e5.m {
    public final /* synthetic */ PhotoViewer a;

    public ps0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // e5.m
    public final void a(long j10, long j11, h3.t0 t0Var, MediaFormat mediaFormat) {
        org.telegram.ui.Components.m61 m61Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F4 && (m61Var = photoViewer.B2) != null) {
            AndroidUtilities.runOnUIThread(new ff0(28, this, m61Var));
        }
    }
}
