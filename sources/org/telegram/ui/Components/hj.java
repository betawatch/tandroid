package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class hj extends s4.d0 {
    public final /* synthetic */ bi.l r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(bi.l lVar, Context context) {
        super(context);
        this.r = lVar;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        return org.telegram.messenger.l0.A(7.0f, ((jj) this.r.R).n.getPaddingTop(), super.k(i10, view));
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
