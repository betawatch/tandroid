package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pq extends LinearLayout {
    public final /* synthetic */ sq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq(sq sqVar, Context context) {
        super(context);
        this.a = sqVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        sq.o(this.a);
    }
}
