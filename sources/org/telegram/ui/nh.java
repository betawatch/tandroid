package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class nh extends org.telegram.ui.Components.ev {
    public final /* synthetic */ oh R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh(oh ohVar, org.telegram.ui.ActionBar.g2 g2Var, Activity activity, org.telegram.ui.ActionBar.h6 h6Var, ArrayList arrayList) {
        super(g2Var, activity, h6Var, arrayList);
        this.R1 = ohVar;
    }

    @Override // org.telegram.ui.Components.ev, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        bn bnVar = this.R1.p;
        bnVar.getClass();
        bnVar.x8(false, true, 0.0f);
    }
}
