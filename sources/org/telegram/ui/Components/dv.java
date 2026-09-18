package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class dv extends sv {
    public final /* synthetic */ sv W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(sv svVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(o2Var, context, f6Var, arrayList);
        this.W = svVar;
    }

    @Override // org.telegram.ui.Components.sv
    public final void Y() {
        this.W.dismiss();
    }
}
