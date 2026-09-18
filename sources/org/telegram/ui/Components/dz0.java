package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class dz0 implements zc0, bd0 {
    public final /* synthetic */ fz0 a;

    @Override // org.telegram.ui.Components.zc0
    public String j(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.bd0
    public void q(dd0 dd0Var, int i10) {
        fz0 fz0Var = this.a;
        fz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        fz0Var.invalidate();
        try {
            dd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
