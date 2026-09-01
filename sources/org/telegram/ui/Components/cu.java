package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class cu extends Dialog {
    public final /* synthetic */ fg.x1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu(fg.x1 x1Var, Context context) {
        super(context);
        this.a = x1Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        du duVar = (du) this.a.b;
        duVar.a.k(false);
        duVar.a.e();
    }
}
