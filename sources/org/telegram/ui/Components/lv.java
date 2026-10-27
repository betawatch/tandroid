package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lv extends aw {
    public final /* synthetic */ aw W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(aw awVar, org.telegram.ui.ActionBar.r2 r2Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, ArrayList arrayList) {
        super(r2Var, context, u6Var, arrayList);
        this.W = awVar;
    }

    @Override // org.telegram.ui.Components.aw
    public final void i0() {
        this.W.dismiss();
    }
}
