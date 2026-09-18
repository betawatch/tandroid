package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class oi extends org.telegram.ui.Components.sv {
    public final /* synthetic */ zn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(zn znVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(n2Var, activity, e6Var, arrayList);
        this.W = znVar;
    }

    @Override // org.telegram.ui.Components.sv, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        zn znVar = this.W;
        znVar.getClass();
        znVar.g8(false, true, 0.0f);
    }
}
