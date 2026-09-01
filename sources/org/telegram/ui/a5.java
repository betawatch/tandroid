package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
