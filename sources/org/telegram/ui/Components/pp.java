package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pp extends LinearLayout {
    public final /* synthetic */ sp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(sp spVar, Context context) {
        super(context);
        this.a = spVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        sp.I0(this.a);
    }
}
