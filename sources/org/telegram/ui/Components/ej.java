package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ej extends v4.d0 {
    public final /* synthetic */ gi.g r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(gi.g gVar, Context context) {
        super(context);
        this.r = gVar;
    }

    @Override // v4.d0
    public final int k(int i7, View view) {
        return org.telegram.messenger.f3.B(7.0f, ((gj) this.r.R).n.getPaddingTop(), super.k(i7, view));
    }

    @Override // v4.d0
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
