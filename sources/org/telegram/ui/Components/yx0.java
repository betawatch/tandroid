package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yx0 implements xb0, zb0 {
    public final /* synthetic */ ay0 a;

    @Override // org.telegram.ui.Components.xb0
    public String g(int i9) {
        return this.a.h[i9];
    }

    @Override // org.telegram.ui.Components.zb0
    public void m(bc0 bc0Var, int i9) {
        ay0 ay0Var = this.a;
        ay0Var.b();
        SharedConfig.updateChatListSwipeSetting(i9);
        ay0Var.invalidate();
        try {
            bc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
