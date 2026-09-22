package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class gi extends org.telegram.ui.Components.sv {
    public final /* synthetic */ hi W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(hi hiVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(n2Var, activity, e6Var, arrayList);
        this.W = hiVar;
    }

    @Override // org.telegram.ui.Components.sv, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        bo boVar = this.W.p;
        boVar.getClass();
        boVar.g8(false, true, 0.0f);
    }
}
