package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qy0 implements rc0, tc0 {
    public final /* synthetic */ sy0 a;

    @Override // org.telegram.ui.Components.rc0
    public String f(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.tc0
    public void s(vc0 vc0Var, int i10) {
        sy0 sy0Var = this.a;
        sy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        sy0Var.invalidate();
        try {
            vc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
