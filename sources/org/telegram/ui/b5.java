package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b5 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ c5 a;

    public b5(c5 c5Var) {
        this.a = c5Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c5 c5Var = this.a;
        if (c5Var.g && i10 == c5Var.e) {
            c5Var.b(objArr);
        }
    }
}
