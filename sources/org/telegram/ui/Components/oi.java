package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oi extends u4.c0 {
    public final /* synthetic */ fi.g r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(fi.g gVar, Context context) {
        super(context);
        this.r = gVar;
    }

    @Override // u4.c0
    public final int k(int i3, View view) {
        return org.telegram.messenger.k5.B(7.0f, ((qi) this.r.R).n.getPaddingTop(), super.k(i3, view));
    }

    @Override // u4.c0
    public final int m(int i3) {
        return super.m(i3) * 2;
    }
}
