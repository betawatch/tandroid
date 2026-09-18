package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sy0 implements qc0, sc0 {
    public final /* synthetic */ uy0 a;

    @Override // org.telegram.ui.Components.qc0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.sc0
    public void q(uc0 uc0Var, int i10) {
        uy0 uy0Var = this.a;
        uy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        uy0Var.invalidate();
        try {
            uc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
