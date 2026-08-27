package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ay0 implements bc0, dc0 {
    public final /* synthetic */ cy0 a;

    @Override // org.telegram.ui.Components.bc0
    public String g(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.dc0
    public void m(fc0 fc0Var, int i10) {
        cy0 cy0Var = this.a;
        cy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        cy0Var.invalidate();
        try {
            fc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
