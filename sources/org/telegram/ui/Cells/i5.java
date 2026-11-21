package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class i5 extends Switch {
    public final /* synthetic */ j5 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(j5 j5Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.b0 = j5Var;
    }

    @Override // org.telegram.ui.Components.Switch
    public final int a(int i7) {
        return this.b0.a(i7);
    }
}
