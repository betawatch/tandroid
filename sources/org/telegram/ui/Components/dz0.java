package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
