package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class tt extends Dialog {
    public final /* synthetic */ bi.y8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(bi.y8 y8Var, Context context) {
        super(context);
        this.a = y8Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ut utVar = (ut) this.a.b;
        utVar.a.k(false);
        utVar.a.e();
    }
}
