package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tt extends Dialog {
    public final /* synthetic */ kg.q1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(kg.q1 q1Var, Context context) {
        super(context);
        this.a = q1Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ut utVar = (ut) this.a.b;
        utVar.a.k(false);
        utVar.a.e();
    }
}
