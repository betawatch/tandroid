package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vy0 implements uc0, wc0 {
    public final /* synthetic */ xy0 a;

    @Override // org.telegram.ui.Components.uc0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.wc0
    public void q(yc0 yc0Var, int i10) {
        xy0 xy0Var = this.a;
        xy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        xy0Var.invalidate();
        try {
            yc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
