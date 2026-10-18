package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class nu extends Dialog {
    public final /* synthetic */ ai.z4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu(ai.z4 z4Var, Context context) {
        super(context);
        this.a = z4Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ou ouVar = (ou) this.a.b;
        ouVar.a.k(false);
        ouVar.a.e();
    }
}
