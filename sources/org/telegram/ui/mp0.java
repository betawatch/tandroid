package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class mp0 extends org.telegram.ui.Components.z51 {
    public final /* synthetic */ PhotoViewer h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp0(PhotoViewer photoViewer, Context context, on0 on0Var) {
        super(context, on0Var);
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
