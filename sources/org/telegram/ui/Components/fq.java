package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fq extends LinearLayout {
    public final /* synthetic */ iq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq(iq iqVar, Context context) {
        super(context);
        this.a = iqVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        iq.m(this.a);
    }
}
