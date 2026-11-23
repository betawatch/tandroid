package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q8 extends w8 {
    public final /* synthetic */ p8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(x8 x8Var, Activity activity, p8 p8Var) {
        super(x8Var, activity);
        this.H = p8Var;
    }

    @Override // org.telegram.ui.Components.w8, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
