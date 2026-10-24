package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.d71;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        d71 d71Var;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                ((m3) obj).getClass();
                int i13 = NotificationCenter.didReceiveNewMessages;
                break;
            default:
                s9 s9Var = (s9) obj;
                if (!s9Var.n && (d71Var = s9Var.a) != null) {
                    d71Var.Z2.N(true);
                    break;
                }
                break;
        }
    }
}
