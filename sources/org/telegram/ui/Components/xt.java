package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xt extends Dialog {
    public final /* synthetic */ cg.z1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt(cg.z1 z1Var, Context context) {
        super(context);
        this.a = z1Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        yt ytVar = (yt) this.a.b;
        ytVar.a.k(false);
        ytVar.a.e();
    }
}
