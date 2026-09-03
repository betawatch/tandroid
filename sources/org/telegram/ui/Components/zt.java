package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zt extends Dialog {
    public final /* synthetic */ eg.y1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt(eg.y1 y1Var, Context context) {
        super(context);
        this.a = y1Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        au auVar = (au) this.a.b;
        auVar.a.k(false);
        auVar.a.e();
    }
}
