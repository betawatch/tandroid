package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jy0 implements mc0, oc0 {
    public final /* synthetic */ ly0 a;

    @Override // org.telegram.ui.Components.mc0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.oc0
    public void q(qc0 qc0Var, int i10) {
        ly0 ly0Var = this.a;
        ly0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        ly0Var.invalidate();
        try {
            qc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
