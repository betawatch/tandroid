package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class d5 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ e5 a;

    public d5(e5 e5Var) {
        this.a = e5Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e5 e5Var = this.a;
        if (e5Var.g && i10 == e5Var.e) {
            e5Var.b(objArr);
        }
    }
}
