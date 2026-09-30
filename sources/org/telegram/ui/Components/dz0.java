package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dz0 implements cd0, ed0 {
    public final /* synthetic */ fz0 a;

    @Override // org.telegram.ui.Components.cd0
    public String j(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.ed0
    public void q(gd0 gd0Var, int i10) {
        fz0 fz0Var = this.a;
        fz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        fz0Var.invalidate();
        try {
            gd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
