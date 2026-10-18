package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
