package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class z61 extends i71 {
    public final /* synthetic */ j71 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z61(j71 j71Var, Context context, boolean z10, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var, z10);
        this.u0 = j71Var;
    }

    @Override // org.telegram.ui.Components.i71
    public final void f(float f10, int i7, int i10) {
        super.f(f10, i7, i10);
        this.u0.v(f10 <= 0.5f ? i7 : i10, i7 < i10);
    }
}
