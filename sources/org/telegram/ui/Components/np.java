package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class np extends LinearLayout {
    public final /* synthetic */ qp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np(qp qpVar, Context context) {
        super(context);
        this.a = qpVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        qp.m(this.a);
    }
}
