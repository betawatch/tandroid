package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz0 implements md0, od0 {
    public final /* synthetic */ rz0 a;

    @Override // org.telegram.ui.Components.md0
    public String e(int i10) {
        return this.a.n[i10];
    }

    @Override // org.telegram.ui.Components.od0
    public void n(qd0 qd0Var, int i10) {
        rz0 rz0Var = this.a;
        rz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        rz0Var.invalidate();
        try {
            qd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
