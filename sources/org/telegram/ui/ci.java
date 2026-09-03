package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ci extends org.telegram.ui.Components.ov {
    public final /* synthetic */ di T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(di diVar, org.telegram.ui.ActionBar.p2 p2Var, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList) {
        super(p2Var, activity, g6Var, arrayList);
        this.T = diVar;
    }

    @Override // org.telegram.ui.Components.ov, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        xn xnVar = this.T.p;
        xnVar.getClass();
        xnVar.g8(false, true, 0.0f);
    }
}
