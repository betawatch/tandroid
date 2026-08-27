package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qt extends Dialog {
    public final /* synthetic */ ag.r2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt(ag.r2 r2Var, Context context) {
        super(context);
        this.a = r2Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        rt rtVar = (rt) this.a.b;
        rtVar.a.k(false);
        rtVar.a.e();
    }
}
