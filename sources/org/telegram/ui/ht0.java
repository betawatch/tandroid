package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ht0 extends org.telegram.ui.Components.l81 {
    public final /* synthetic */ PhotoViewer h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht0(PhotoViewer photoViewer, Context context, lr0 lr0Var) {
        super(context, lr0Var);
        this.h0 = photoViewer;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.W(this.h0);
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.W(this.h0);
        }
    }
}
