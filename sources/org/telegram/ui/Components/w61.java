package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class w61 extends f71 {
    public final /* synthetic */ g71 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w61(g71 g71Var, Context context, boolean z10, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var, z10);
        this.u0 = g71Var;
    }

    @Override // org.telegram.ui.Components.f71
    public final void f(float f10, int i7, int i10) {
        super.f(f10, i7, i10);
        this.u0.v(f10 <= 0.5f ? i7 : i10, i7 < i10);
    }
}
