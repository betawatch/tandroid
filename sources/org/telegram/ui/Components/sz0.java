package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sz0 implements qd0, sd0 {
    public final /* synthetic */ uz0 a;

    @Override // org.telegram.ui.Components.qd0
    public String i(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.sd0
    public void r(ud0 ud0Var, int i10) {
        uz0 uz0Var = this.a;
        uz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        uz0Var.invalidate();
        try {
            ud0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
