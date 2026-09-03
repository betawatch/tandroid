package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
