package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.iw0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements iw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ a2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.iw0
    public final void H(int i10, boolean z10) {
        switch (this.a) {
            case 0:
                u2 u2Var = ((d3) this.b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    u2Var.e(u2Var.getTopActionBarOffsetY() + (-u2Var.getOffsetY()));
                    break;
                }
                break;
            default:
                ((ki.d2) this.b).getClass();
                break;
        }
    }
}
