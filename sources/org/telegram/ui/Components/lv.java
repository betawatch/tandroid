package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class lv extends aw {
    public final /* synthetic */ aw W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(aw awVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList) {
        super(o2Var, context, g6Var, arrayList);
        this.W = awVar;
    }

    @Override // org.telegram.ui.Components.aw
    public final void i0() {
        this.W.dismiss();
    }
}
