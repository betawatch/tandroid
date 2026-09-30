package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class bq extends LinearLayout {
    public final /* synthetic */ eq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(eq eqVar, Context context) {
        super(context);
        this.a = eqVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        eq.m(this.a);
    }
}
