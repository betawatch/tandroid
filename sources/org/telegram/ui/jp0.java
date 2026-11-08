package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class jp0 extends org.telegram.ui.Components.z51 {
    public final /* synthetic */ PhotoViewer h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp0(PhotoViewer photoViewer, Context context, ln0 ln0Var) {
        super(context, ln0Var);
        this.h0 = photoViewer;
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        PhotoViewer.P(this.h0);
    }

    @Override // android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 0) {
            PhotoViewer.P(this.h0);
        }
    }
}
