package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz0 implements kd0, md0 {
    public final /* synthetic */ mz0 a;

    @Override // org.telegram.ui.Components.kd0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.md0
    public void q(od0 od0Var, int i10) {
        mz0 mz0Var = this.a;
        mz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        mz0Var.invalidate();
        try {
            od0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
