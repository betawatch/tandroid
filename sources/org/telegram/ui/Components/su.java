package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class su extends Dialog {
    public final /* synthetic */ bi.o3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(bi.o3 o3Var, Context context) {
        super(context);
        this.a = o3Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        tu tuVar = (tu) this.a.b;
        tuVar.a.k(false);
        tuVar.a.e();
    }
}
