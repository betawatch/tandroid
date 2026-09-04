package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class hj extends s4.d0 {
    public final /* synthetic */ ci.k r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(ci.k kVar, Context context) {
        super(context);
        this.r = kVar;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        return org.telegram.messenger.w1.z(7.0f, ((jj) this.r.R).n.getPaddingTop(), super.k(i10, view));
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
