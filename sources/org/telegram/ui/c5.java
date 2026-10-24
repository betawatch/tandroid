package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class c5 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ d5 a;

    public c5(d5 d5Var) {
        this.a = d5Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d5 d5Var = this.a;
        if (d5Var.g && i10 == d5Var.e) {
            d5Var.b(objArr);
        }
    }
}
