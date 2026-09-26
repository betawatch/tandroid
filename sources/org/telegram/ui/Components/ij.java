package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ij extends s4.d0 {
    public final /* synthetic */ bi.l r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(bi.l lVar, Context context) {
        super(context);
        this.r = lVar;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        return org.telegram.messenger.f0.A(7.0f, ((kj) this.r.R).n.getPaddingTop(), super.k(i10, view));
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
