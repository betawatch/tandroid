package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class js0 extends org.telegram.ui.Components.r61 {
    public final /* synthetic */ PhotoViewer d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(PhotoViewer photoViewer, Context context, oq0 oq0Var) {
        super(context, oq0Var);
        this.d0 = photoViewer;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        PhotoViewer.W(this.d0);
    }

    @Override // android.view.View
    public final void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 == 0) {
            PhotoViewer.W(this.d0);
        }
    }
}
