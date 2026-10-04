package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class fe extends org.telegram.ui.Components.bm0 {
    public final /* synthetic */ ie b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(ie ieVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, me meVar) {
        super(context, d6Var, meVar);
        this.b0 = ieVar;
    }

    @Override // org.telegram.ui.Components.g91, android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.b0.w.T1 && super.canScrollHorizontally(i10);
    }
}
