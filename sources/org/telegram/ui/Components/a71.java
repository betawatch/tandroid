package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a71 extends j71 {
    public final /* synthetic */ k71 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a71(k71 k71Var, Context context, boolean z10, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var, z10);
        this.u0 = k71Var;
    }

    @Override // org.telegram.ui.Components.j71
    public final void f(float f10, int i7, int i10) {
        super.f(f10, i7, i10);
        this.u0.w(f10 <= 0.5f ? i7 : i10, i7 < i10);
    }
}
