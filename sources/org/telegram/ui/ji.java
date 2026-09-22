package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ji extends org.telegram.ui.Components.tv {
    public final /* synthetic */ zn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(zn znVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(n2Var, activity, f6Var, arrayList);
        this.W = znVar;
    }

    @Override // org.telegram.ui.Components.tv, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        zn znVar = this.W;
        znVar.getClass();
        znVar.g8(false, true, 0.0f);
    }
}
