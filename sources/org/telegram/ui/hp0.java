package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hp0 extends org.telegram.ui.Components.a61 {
    public final /* synthetic */ PhotoViewer i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(PhotoViewer photoViewer, Context context, nn0 nn0Var) {
        super(context, nn0Var);
        this.i0 = photoViewer;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        PhotoViewer.Q(this.i0);
    }

    @Override // android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 0) {
            PhotoViewer.Q(this.i0);
        }
    }
}
