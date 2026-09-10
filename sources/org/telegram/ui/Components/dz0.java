package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class dz0 implements zc0, bd0 {
    public final /* synthetic */ fz0 a;

    @Override // org.telegram.ui.Components.zc0
    public String k(int i10) {
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
