package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class nh extends org.telegram.ui.Components.ru {
    public final /* synthetic */ oh N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh(oh ohVar, org.telegram.ui.ActionBar.f2 f2Var, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(f2Var, activity, f6Var, arrayList);
        this.N1 = ohVar;
    }

    @Override // org.telegram.ui.Components.ru, org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        an anVar = this.N1.p;
        anVar.getClass();
        anVar.v8(false, true, 0.0f);
    }
}
