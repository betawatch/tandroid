package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uy0 implements tc0, vc0 {
    public final /* synthetic */ wy0 a;

    @Override // org.telegram.ui.Components.tc0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.vc0
    public void q(xc0 xc0Var, int i10) {
        wy0 wy0Var = this.a;
        wy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        wy0Var.invalidate();
        try {
            xc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
