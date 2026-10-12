package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class s80 extends mm0 {
    public final /* synthetic */ w80 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s80(w80 w80Var, Context context) {
        super(context, null);
        this.V2 = w80Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2.n) {
            return;
        }
        super.requestLayout();
    }
}
