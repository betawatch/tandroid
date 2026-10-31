package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k5 extends Switch {
    public final /* synthetic */ l5 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(l5 l5Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.a0 = l5Var;
    }

    @Override // org.telegram.ui.Components.Switch
    public final int a(int i10) {
        return this.a0.a(i10);
    }
}
