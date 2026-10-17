package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class gj extends s4.c0 {
    public final /* synthetic */ di.k r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(di.k kVar, Context context) {
        super(context);
        this.r = kVar;
    }

    @Override // s4.c0
    public final int k(int i10, View view) {
        return org.telegram.messenger.q.A(7.0f, ((ij) this.r.R).n.getPaddingTop(), super.k(i10, view));
    }

    @Override // s4.c0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
