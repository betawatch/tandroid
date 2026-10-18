package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        u61 u61Var;
        switch (this.a) {
            case 0:
                m3 m3Var = (m3) this.b;
                m3Var.getClass();
                if (i10 == NotificationCenter.userInfoDidLoad && i11 == m3Var.w0 && m3Var.x0 != 0 && objArr.length > 1) {
                    Object obj = objArr[0];
                    if ((obj instanceof Long) && ((Long) obj).longValue() == m3Var.x0) {
                        m3Var.p(m3.h((TLRPC.UserFull) objArr[1]), true);
                        break;
                    }
                }
                break;
            default:
                r9 r9Var = (r9) this.b;
                if (!r9Var.n && (u61Var = r9Var.a) != null) {
                    u61Var.W2.N(true);
                    break;
                }
                break;
        }
    }
}
