package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class h5 extends Switch {
    public final /* synthetic */ i5 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(i5 i5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.b0 = i5Var;
    }

    @Override // org.telegram.ui.Components.Switch
    public final int a(int i10) {
        return this.b0.a(i10);
    }
}
