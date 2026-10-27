package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yz0 implements jd0, ld0 {
    public final /* synthetic */ a01 a;

    @Override // org.telegram.ui.Components.jd0
    public String f(int i10) {
        return this.a.n[i10];
    }

    @Override // org.telegram.ui.Components.ld0
    public void q(nd0 nd0Var, int i10) {
        a01 a01Var = this.a;
        a01Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        a01Var.invalidate();
        try {
            nd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
