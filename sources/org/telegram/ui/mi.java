package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class mi extends org.telegram.ui.Components.tv {
    public final /* synthetic */ wn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(wn wnVar, org.telegram.ui.ActionBar.m2 m2Var, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(m2Var, activity, d6Var, arrayList);
        this.W = wnVar;
    }

    @Override // org.telegram.ui.Components.tv, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        wn wnVar = this.W;
        wnVar.getClass();
        wnVar.g8(false, true, 0.0f);
    }
}
