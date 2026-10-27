package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.m71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        m71 m71Var;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                ((m3) obj).getClass();
                int i13 = NotificationCenter.didReceiveNewMessages;
                break;
            default:
                r9 r9Var = (r9) obj;
                if (!r9Var.r && (m71Var = r9Var.a) != null) {
                    m71Var.g3.O(true);
                    break;
                }
                break;
        }
    }
}
