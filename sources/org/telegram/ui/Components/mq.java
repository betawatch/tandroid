package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class mq extends LinearLayout {
    public final /* synthetic */ pq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq(pq pqVar, Context context) {
        super(context);
        this.a = pqVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        pq.n(this.a);
    }
}
