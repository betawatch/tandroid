package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mi extends org.telegram.ui.Components.cv {
    public final /* synthetic */ un N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(un unVar, org.telegram.ui.ActionBar.k2 k2Var, Activity activity, org.telegram.ui.ActionBar.p6 p6Var, ArrayList arrayList) {
        super(k2Var, activity, p6Var, arrayList);
        this.N1 = unVar;
    }

    @Override // org.telegram.ui.Components.cv, org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        un unVar = this.N1;
        unVar.getClass();
        unVar.o8(false, true, 0.0f);
    }
}
