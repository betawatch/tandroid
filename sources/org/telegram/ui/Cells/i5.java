package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class i5 extends Switch {
    public final /* synthetic */ j5 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(j5 j5Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.b0 = j5Var;
    }

    @Override // org.telegram.ui.Components.Switch
    public final int a(int i10) {
        return this.b0.a(i10);
    }
}
