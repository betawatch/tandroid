package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mh extends org.telegram.ui.Components.bv {
    public final /* synthetic */ nh R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh(nh nhVar, org.telegram.ui.ActionBar.h2 h2Var, Activity activity, org.telegram.ui.ActionBar.i6 i6Var, ArrayList arrayList) {
        super(h2Var, activity, i6Var, arrayList);
        this.R1 = nhVar;
    }

    @Override // org.telegram.ui.Components.bv, org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        super.dismiss();
        bn bnVar = this.R1.p;
        bnVar.getClass();
        bnVar.x8(false, true, 0.0f);
    }
}
