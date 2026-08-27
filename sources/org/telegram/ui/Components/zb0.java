package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zb0 extends nn0 {
    public final /* synthetic */ fc0 d;

    public zb0(fc0 fc0Var) {
        this.d = fc0Var;
    }

    @Override // org.telegram.ui.Components.nn0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.nn0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.nn0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.nn0
    public final CharSequence d() {
        fc0 fc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = fc0Var.o0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(fc0Var.C)) : fc0Var.d(fc0Var.C);
    }
}
