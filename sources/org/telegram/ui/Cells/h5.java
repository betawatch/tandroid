package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
