package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class tt extends Dialog {
    public final /* synthetic */ bi.z8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(bi.z8 z8Var, Context context) {
        super(context);
        this.a = z8Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ut utVar = (ut) this.a.b;
        utVar.a.k(false);
        utVar.a.e();
    }
}
