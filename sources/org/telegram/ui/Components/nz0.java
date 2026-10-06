package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz0 implements cd0, ed0 {
    public final /* synthetic */ pz0 a;

    @Override // org.telegram.ui.Components.cd0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.ed0
    public void q(gd0 gd0Var, int i10) {
        pz0 pz0Var = this.a;
        pz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        pz0Var.invalidate();
        try {
            gd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
