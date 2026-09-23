package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class gi extends org.telegram.ui.Components.tv {
    public final /* synthetic */ xn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(xn xnVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(n2Var, activity, d6Var, arrayList);
        this.W = xnVar;
    }

    @Override // org.telegram.ui.Components.tv, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        xn xnVar = this.W;
        xnVar.getClass();
        xnVar.g8(false, true, 0.0f);
    }
}
