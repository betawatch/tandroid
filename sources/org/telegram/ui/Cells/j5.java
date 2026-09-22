package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class j5 extends Switch {
    public final /* synthetic */ k5 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(k5 k5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.b0 = k5Var;
    }

    @Override // org.telegram.ui.Components.Switch
    public final int a(int i10) {
        return this.b0.a(i10);
    }
}
