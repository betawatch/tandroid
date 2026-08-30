package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fi extends org.telegram.ui.Components.mv {
    public final /* synthetic */ xn T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(xn xnVar, org.telegram.ui.ActionBar.p2 p2Var, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(p2Var, activity, f6Var, arrayList);
        this.T = xnVar;
    }

    @Override // org.telegram.ui.Components.mv, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        xn xnVar = this.T;
        xnVar.getClass();
        xnVar.g8(false, true, 0.0f);
    }
}
