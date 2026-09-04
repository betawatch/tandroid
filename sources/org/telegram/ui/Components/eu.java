package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
