package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bz0 implements ad0, cd0 {
    public final /* synthetic */ dz0 a;

    @Override // org.telegram.ui.Components.ad0
    public String j(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.cd0
    public void q(ed0 ed0Var, int i10) {
        dz0 dz0Var = this.a;
        dz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        dz0Var.invalidate();
        try {
            ed0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
