package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ij extends s4.c0 {
    public final /* synthetic */ ci.k r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(ci.k kVar, Context context) {
        super(context);
        this.r = kVar;
    }

    @Override // s4.c0
    public final int k(int i10, View view) {
        return org.telegram.messenger.g0.A(7.0f, ((kj) this.r.R).n.getPaddingTop(), super.k(i10, view));
    }

    @Override // s4.c0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
