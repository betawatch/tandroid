package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.pv0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements pv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ g2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.pv0
    public final void H(int i10, boolean z10) {
        switch (this.a) {
            case 0:
                a3 a3Var = ((k3) this.b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
                    break;
                }
                break;
            default:
                ((ii.d2) this.b).getClass();
                break;
        }
    }
}
