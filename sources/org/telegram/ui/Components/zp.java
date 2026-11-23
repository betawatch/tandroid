package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class zp extends LinearLayout {
    public final /* synthetic */ cq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(cq cqVar, Context context) {
        super(context);
        this.a = cqVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        cq.J0(this.a);
    }
}
