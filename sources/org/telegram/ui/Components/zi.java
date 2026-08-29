package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zi extends f2.k0 {
    public final /* synthetic */ mh.k r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(mh.k kVar, Context context) {
        super(context);
        this.r = kVar;
    }

    @Override // f2.k0
    public final int k(int i10, View view) {
        return org.telegram.messenger.x3.z(7.0f, ((bj) this.r.R).n.getPaddingTop(), super.k(i10, view));
    }

    @Override // f2.k0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
