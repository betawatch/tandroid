package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
