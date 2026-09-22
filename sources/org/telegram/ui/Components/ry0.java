package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ry0 implements qc0, sc0 {
    public final /* synthetic */ ty0 a;

    @Override // org.telegram.ui.Components.qc0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.sc0
    public void q(uc0 uc0Var, int i10) {
        ty0 ty0Var = this.a;
        ty0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        ty0Var.invalidate();
        try {
            uc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
