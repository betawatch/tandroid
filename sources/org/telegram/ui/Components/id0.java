package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class id0 extends zo0 {
    public final /* synthetic */ od0 d;

    public id0(od0 od0Var) {
        this.d = od0Var;
    }

    @Override // org.telegram.ui.Components.zo0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.zo0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.zo0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.zo0
    public final CharSequence d() {
        od0 od0Var = this.d;
        Utilities.CallbackReturn callbackReturn = od0Var.s0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(od0Var.G)) : od0Var.d(od0Var.G);
    }
}
