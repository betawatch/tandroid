package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class nu extends Dialog {
    public final /* synthetic */ ai.a5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu(ai.a5 a5Var, Context context) {
        super(context);
        this.a = a5Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ou ouVar = (ou) this.a.b;
        ouVar.a.k(false);
        ouVar.a.e();
    }
}
