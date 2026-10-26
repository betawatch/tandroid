package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xz0 implements id0, kd0 {
    public final /* synthetic */ zz0 a;

    @Override // org.telegram.ui.Components.id0
    public String f(int i10) {
        return this.a.n[i10];
    }

    @Override // org.telegram.ui.Components.kd0
    public void q(md0 md0Var, int i10) {
        zz0 zz0Var = this.a;
        zz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        zz0Var.invalidate();
        try {
            md0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
