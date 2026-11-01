package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ee extends org.telegram.ui.Components.wk0 {
    public final /* synthetic */ he c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(he heVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, le leVar) {
        super(context, p6Var, leVar);
        this.c0 = heVar;
    }

    @Override // org.telegram.ui.Components.x71, android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.c0.x.Q0 && super.canScrollHorizontally(i10);
    }
}
