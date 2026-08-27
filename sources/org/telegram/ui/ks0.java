package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ks0 extends org.telegram.ui.Components.t61 {
    public final /* synthetic */ PhotoViewer d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(PhotoViewer photoViewer, Context context, pq0 pq0Var) {
        super(context, pq0Var);
        this.d0 = photoViewer;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.X(this.d0);
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.X(this.d0);
        }
    }
}
