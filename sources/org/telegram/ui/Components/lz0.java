package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class lz0 implements kd0, md0 {
    public final /* synthetic */ nz0 a;

    @Override // org.telegram.ui.Components.kd0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.md0
    public void q(od0 od0Var, int i10) {
        nz0 nz0Var = this.a;
        nz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        nz0Var.invalidate();
        try {
            od0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
