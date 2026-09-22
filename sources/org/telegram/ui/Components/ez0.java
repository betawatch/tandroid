package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ez0 implements bd0, dd0 {
    public final /* synthetic */ gz0 a;

    @Override // org.telegram.ui.Components.bd0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.dd0
    public void q(fd0 fd0Var, int i10) {
        gz0 gz0Var = this.a;
        gz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        gz0Var.invalidate();
        try {
            fd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
