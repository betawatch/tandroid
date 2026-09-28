package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dz0 implements cd0, ed0 {
    public final /* synthetic */ fz0 a;

    @Override // org.telegram.ui.Components.cd0
    public String j(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.ed0
    public void q(gd0 gd0Var, int i10) {
        fz0 fz0Var = this.a;
        fz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        fz0Var.invalidate();
        try {
            gd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
