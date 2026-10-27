package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bj extends org.telegram.ui.Components.aw {
    public final /* synthetic */ wn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(wn wnVar, org.telegram.ui.ActionBar.r2 r2Var, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, ArrayList arrayList) {
        super(r2Var, activity, u6Var, arrayList);
        this.W = wnVar;
    }

    @Override // org.telegram.ui.Components.aw, org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        wn wnVar = this.W;
        wnVar.getClass();
        wnVar.p8(false, true, 0.0f);
    }
}
