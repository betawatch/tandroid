package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class i5 extends Switch {
    public final /* synthetic */ j5 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(j5 j5Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.b0 = j5Var;
    }

    @Override // org.telegram.ui.Components.Switch
    public final int a(int i10) {
        return this.b0.a(i10);
    }
}
