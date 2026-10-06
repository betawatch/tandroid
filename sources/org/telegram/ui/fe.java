package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class fe extends org.telegram.ui.Components.bm0 {
    public final /* synthetic */ ie c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(ie ieVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, me meVar) {
        super(context, d6Var, meVar);
        this.c0 = ieVar;
    }

    @Override // org.telegram.ui.Components.h91, android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.c0.w.Q0 && super.canScrollHorizontally(i10);
    }
}
