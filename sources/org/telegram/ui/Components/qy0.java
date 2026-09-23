package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class qy0 implements pc0, rc0 {
    public final /* synthetic */ sy0 a;

    @Override // org.telegram.ui.Components.pc0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.rc0
    public void q(tc0 tc0Var, int i10) {
        sy0 sy0Var = this.a;
        sy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        sy0Var.invalidate();
        try {
            tc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
