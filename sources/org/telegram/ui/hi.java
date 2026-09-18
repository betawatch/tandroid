package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hi extends org.telegram.ui.Components.sv {
    public final /* synthetic */ ii W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(ii iiVar, org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(o2Var, activity, f6Var, arrayList);
        this.W = iiVar;
    }

    @Override // org.telegram.ui.Components.sv, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        bo boVar = this.W.p;
        boVar.getClass();
        boVar.g8(false, true, 0.0f);
    }
}
