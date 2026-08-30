package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xi extends f2.j0 {
    public final /* synthetic */ oh.k r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(oh.k kVar, Context context) {
        super(context);
        this.r = kVar;
    }

    @Override // f2.j0
    public final int k(int i10, View view) {
        return org.telegram.messenger.y3.z(7.0f, ((zi) this.r.R).n.getPaddingTop(), super.k(i10, view));
    }

    @Override // f2.j0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
