package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class oz0 implements qd0, sd0 {
    public final /* synthetic */ qz0 a;

    @Override // org.telegram.ui.Components.qd0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.sd0
    public void r(ud0 ud0Var, int i10) {
        qz0 qz0Var = this.a;
        qz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        qz0Var.invalidate();
        try {
            ud0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
