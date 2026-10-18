package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz0 implements kd0, md0 {
    public final /* synthetic */ mz0 a;

    @Override // org.telegram.ui.Components.kd0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.md0
    public void q(od0 od0Var, int i10) {
        mz0 mz0Var = this.a;
        mz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        mz0Var.invalidate();
        try {
            od0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
