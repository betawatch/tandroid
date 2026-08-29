package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class is0 extends org.telegram.ui.Components.d71 {
    public final /* synthetic */ PhotoViewer d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(PhotoViewer photoViewer, Context context, oq0 oq0Var) {
        super(context, oq0Var);
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
