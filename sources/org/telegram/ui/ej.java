package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ej extends org.telegram.ui.Components.lv {
    public final /* synthetic */ zn T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(zn znVar, org.telegram.ui.ActionBar.p2 p2Var, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(p2Var, activity, f6Var, arrayList);
        this.T = znVar;
    }

    @Override // org.telegram.ui.Components.lv, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        zn znVar = this.T;
        znVar.getClass();
        znVar.g8(false, true, 0.0f);
    }
}
