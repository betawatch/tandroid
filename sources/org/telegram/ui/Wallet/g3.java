package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        u61 u61Var;
        switch (this.a) {
            case 0:
                l3 l3Var = (l3) this.b;
                l3Var.getClass();
                if (i10 == NotificationCenter.userInfoDidLoad && i11 == l3Var.w0 && l3Var.x0 != 0 && objArr.length > 1) {
                    Object obj = objArr[0];
                    if ((obj instanceof Long) && ((Long) obj).longValue() == l3Var.x0) {
                        l3Var.p(l3.h((TLRPC.UserFull) objArr[1]), true);
                        break;
                    }
                }
                break;
            default:
                w9 w9Var = (w9) this.b;
                if (!w9Var.n && (u61Var = w9Var.a) != null) {
                    u61Var.W2.N(true);
                    break;
                }
                break;
        }
    }
}
