package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
