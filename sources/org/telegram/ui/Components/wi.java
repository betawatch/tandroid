package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wi extends f2.n0 {
    public final /* synthetic */ jh.k r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(jh.k kVar, Context context) {
        super(context);
        this.r = kVar;
    }

    @Override // f2.n0
    public final int k(int i9, View view) {
        return org.telegram.messenger.l0.A(7.0f, ((yi) this.r.R).n.getPaddingTop(), super.k(i9, view));
    }

    @Override // f2.n0
    public final int m(int i9) {
        return super.m(i9) * 2;
    }
}
