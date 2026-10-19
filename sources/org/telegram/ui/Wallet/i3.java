package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.v61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class i3 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        v61 v61Var;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                ((n3) obj).getClass();
                int i13 = NotificationCenter.didReceiveNewMessages;
                break;
            default:
                r9 r9Var = (r9) obj;
                if (!r9Var.n && (v61Var = r9Var.a) != null) {
                    v61Var.W2.N(true);
                    break;
                }
                break;
        }
    }
}
