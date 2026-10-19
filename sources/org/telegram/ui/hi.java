package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class hi extends org.telegram.ui.Components.aw {
    public final /* synthetic */ qn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(qn qnVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(n2Var, activity, d6Var, arrayList);
        this.W = qnVar;
    }

    @Override // org.telegram.ui.Components.aw, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        qn qnVar = this.W;
        qnVar.getClass();
        qnVar.j8(false, true, 0.0f);
    }
}
