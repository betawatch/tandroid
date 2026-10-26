package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gd0 extends jp0 {
    public final /* synthetic */ md0 d;

    public gd0(md0 md0Var) {
        this.d = md0Var;
    }

    @Override // org.telegram.ui.Components.jp0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.jp0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.jp0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.jp0
    public final CharSequence d() {
        md0 md0Var = this.d;
        Utilities.CallbackReturn callbackReturn = md0Var.u0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(md0Var.H)) : md0Var.d(md0Var.H);
    }
}
