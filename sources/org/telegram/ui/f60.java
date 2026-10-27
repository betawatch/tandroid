package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f60 extends tg.j0 {
    public final /* synthetic */ g60 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f60(g60 g60Var, g60 g60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, i11, activity, g60Var2, u6Var);
        this.X0 = g60Var;
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        this.X0.B0 = false;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onOpenAnimationEnd() {
        this.X0.B0 = false;
    }
}
