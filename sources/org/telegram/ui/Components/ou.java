package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ou extends Dialog {
    public final /* synthetic */ bi.v4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou(bi.v4 v4Var, Context context) {
        super(context);
        this.a = v4Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        pu puVar = (pu) this.a.b;
        puVar.a.k(false);
        puVar.a.e();
    }
}
