package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
