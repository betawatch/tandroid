package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ee extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ he c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(he heVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, le leVar) {
        super(context, p6Var, leVar);
        this.c0 = heVar;
    }

    @Override // org.telegram.ui.Components.w71, android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.c0.x.Q0 && super.canScrollHorizontally(i10);
    }
}
