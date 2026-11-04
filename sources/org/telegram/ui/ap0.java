package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ap0 extends org.telegram.ui.Components.s51 {
    public final /* synthetic */ PhotoViewer i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap0(PhotoViewer photoViewer, Context context, gn0 gn0Var) {
        super(context, gn0Var);
        this.i0 = photoViewer;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        PhotoViewer.X(this.i0);
    }

    @Override // android.view.View
    public final void setVisibility(int i3) {
        super.setVisibility(i3);
        if (i3 == 0) {
            PhotoViewer.X(this.i0);
        }
    }
}
