package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jh extends org.telegram.ui.Components.pu {
    public final /* synthetic */ kh O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh(kh khVar, org.telegram.ui.ActionBar.d2 d2Var, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(d2Var, activity, e6Var, arrayList);
        this.O1 = khVar;
    }

    @Override // org.telegram.ui.Components.pu, org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        wm wmVar = this.O1.p;
        wmVar.getClass();
        wmVar.v8(false, true, 0.0f);
    }
}
