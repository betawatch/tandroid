package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ai extends org.telegram.ui.Components.jv {
    public final /* synthetic */ tn S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(tn tnVar, org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(o2Var, activity, c6Var, arrayList);
        this.S = tnVar;
    }

    @Override // org.telegram.ui.Components.jv, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        tn tnVar = this.S;
        tnVar.getClass();
        tnVar.g8(false, true, 0.0f);
    }
}
