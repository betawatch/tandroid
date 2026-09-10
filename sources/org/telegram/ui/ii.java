package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ii extends org.telegram.ui.Components.wv {
    public final /* synthetic */ ji W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(ji jiVar, org.telegram.ui.ActionBar.p2 p2Var, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(p2Var, activity, f6Var, arrayList);
        this.W = jiVar;
    }

    @Override // org.telegram.ui.Components.wv, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        eo eoVar = this.W.p;
        eoVar.getClass();
        eoVar.g8(false, true, 0.0f);
    }
}
