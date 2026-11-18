package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class al extends hi.m3 {
    public final /* synthetic */ bn X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(bn bnVar, Activity activity) {
        super(activity, 3);
        this.X0 = bnVar;
    }

    @Override // hi.m3, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        setTranslationY(((-getTop()) - org.telegram.messenger.g0.L(120.0f)) + this.X0.R1);
    }
}
