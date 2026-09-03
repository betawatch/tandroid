package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uy0 implements uc0, wc0 {
    public final /* synthetic */ wy0 a;

    @Override // org.telegram.ui.Components.uc0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.wc0
    public void q(yc0 yc0Var, int i10) {
        wy0 wy0Var = this.a;
        wy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        wy0Var.invalidate();
        try {
            yc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
