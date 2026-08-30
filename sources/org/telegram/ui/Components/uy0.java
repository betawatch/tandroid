package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uy0 implements sc0, uc0 {
    public final /* synthetic */ wy0 a;

    @Override // org.telegram.ui.Components.sc0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.uc0
    public void q(wc0 wc0Var, int i10) {
        wy0 wy0Var = this.a;
        wy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        wy0Var.invalidate();
        try {
            wc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
