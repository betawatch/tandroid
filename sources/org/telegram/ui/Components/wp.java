package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wp extends LinearLayout {
    public final /* synthetic */ zp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp(zp zpVar, Context context) {
        super(context);
        this.a = zpVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        zp.J0(this.a);
    }
}
