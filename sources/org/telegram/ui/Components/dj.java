package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class dj extends v4.d0 {
    public final /* synthetic */ gi.g r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(gi.g gVar, Context context) {
        super(context);
        this.r = gVar;
    }

    @Override // v4.d0
    public final int k(int i7, View view) {
        return org.telegram.messenger.f3.B(7.0f, ((fj) this.r.R).n.getPaddingTop(), super.k(i7, view));
    }

    @Override // v4.d0
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
