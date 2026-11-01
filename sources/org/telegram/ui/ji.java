package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ji extends org.telegram.ui.Components.cv {
    public final /* synthetic */ ki N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(ki kiVar, org.telegram.ui.ActionBar.k2 k2Var, Activity activity, org.telegram.ui.ActionBar.p6 p6Var, ArrayList arrayList) {
        super(k2Var, activity, p6Var, arrayList);
        this.N1 = kiVar;
    }

    @Override // org.telegram.ui.Components.cv, org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        un unVar = this.N1.p;
        unVar.getClass();
        unVar.s8(false, true, 0.0f);
    }
}
