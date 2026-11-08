package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ht extends Dialog {
    public final /* synthetic */ bi.w4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht(bi.w4 w4Var, Context context) {
        super(context);
        this.a = w4Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        jt jtVar = (jt) this.a.b;
        jtVar.a.k(false);
        jtVar.a.e();
    }
}
