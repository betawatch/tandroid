package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        u61 u61Var;
        switch (this.a) {
            case 0:
                k3 k3Var = (k3) this.b;
                k3Var.getClass();
                if (i10 == NotificationCenter.userInfoDidLoad && i11 == k3Var.w0 && k3Var.x0 != 0 && objArr.length > 1) {
                    Object obj = objArr[0];
                    if ((obj instanceof Long) && ((Long) obj).longValue() == k3Var.x0) {
                        k3Var.p(k3.h((TLRPC.UserFull) objArr[1]), true);
                        break;
                    }
                }
                break;
            default:
                t9 t9Var = (t9) this.b;
                if (!t9Var.n && (u61Var = t9Var.a) != null) {
                    u61Var.W2.N(true);
                    break;
                }
                break;
        }
    }
}
