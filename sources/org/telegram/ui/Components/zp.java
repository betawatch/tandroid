package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zp extends LinearLayout {
    public final /* synthetic */ cq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(cq cqVar, Context context) {
        super(context);
        this.a = cqVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        cq.m(this.a);
    }
}
