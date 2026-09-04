package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class gi extends org.telegram.ui.Components.rv {
    public final /* synthetic */ hi W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(hi hiVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(n2Var, activity, f6Var, arrayList);
        this.W = hiVar;
    }

    @Override // org.telegram.ui.Components.rv, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        co coVar = this.W.p;
        coVar.getClass();
        coVar.g8(false, true, 0.0f);
    }
}
