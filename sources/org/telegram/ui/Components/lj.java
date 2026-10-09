package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lj extends s4.e0 {
    public final /* synthetic */ bi.l r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(bi.l lVar, Context context) {
        super(context);
        this.r = lVar;
    }

    @Override // s4.e0
    public final int k(int i10, View view) {
        return org.telegram.messenger.q.A(7.0f, ((nj) this.r.R).n.getPaddingTop(), super.k(i10, view));
    }

    @Override // s4.e0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
