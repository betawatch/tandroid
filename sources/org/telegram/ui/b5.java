package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
