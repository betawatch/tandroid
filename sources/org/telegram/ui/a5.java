package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a5 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ b5 a;

    public a5(b5 b5Var) {
        this.a = b5Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b5 b5Var = this.a;
        if (b5Var.g && i10 == b5Var.e) {
            b5Var.b(objArr);
        }
    }
}
