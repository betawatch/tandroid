package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ai extends org.telegram.ui.Components.aw {
    public final /* synthetic */ sn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(sn snVar, org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList) {
        super(o2Var, activity, g6Var, arrayList);
        this.W = snVar;
    }

    @Override // org.telegram.ui.Components.aw, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        sn snVar = this.W;
        snVar.getClass();
        snVar.j8(false, true, 0.0f);
    }
}
