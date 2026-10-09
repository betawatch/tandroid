package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wu extends Dialog {
    public final /* synthetic */ ai.z3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(ai.z3 z3Var, Context context) {
        super(context);
        this.a = z3Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        xu xuVar = (xu) this.a.b;
        xuVar.a.k(false);
        xuVar.a.e();
    }
}
