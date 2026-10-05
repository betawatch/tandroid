package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
