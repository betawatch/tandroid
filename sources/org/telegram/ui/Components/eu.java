package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class eu extends Dialog {
    public final /* synthetic */ bi.l3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(bi.l3 l3Var, Context context) {
        super(context);
        this.a = l3Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        fu fuVar = (fu) this.a.b;
        fuVar.a.k(false);
        fuVar.a.e();
    }
}
