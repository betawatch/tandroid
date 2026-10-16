package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz0 implements qd0, sd0 {
    public final /* synthetic */ rz0 a;

    @Override // org.telegram.ui.Components.qd0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.sd0
    public void r(ud0 ud0Var, int i10) {
        rz0 rz0Var = this.a;
        rz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        rz0Var.invalidate();
        try {
            ud0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
