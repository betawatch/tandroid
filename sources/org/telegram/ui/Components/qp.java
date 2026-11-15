package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class qp extends LinearLayout {
    public final /* synthetic */ tp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(tp tpVar, Context context) {
        super(context);
        this.a = tpVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        tp.I0(this.a);
    }
}
