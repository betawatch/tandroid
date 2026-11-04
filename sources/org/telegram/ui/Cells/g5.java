package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g5 extends Switch {
    public final /* synthetic */ h5 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(h5 h5Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.b0 = h5Var;
    }

    @Override // org.telegram.ui.Components.Switch
    public final int a(int i3) {
        return this.b0.a(i3);
    }
}
