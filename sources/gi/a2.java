package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.nw0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements nw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ a2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.nw0
    public final void G(int i10, boolean z10) {
        switch (this.a) {
            case 0:
                u2 u2Var = ((d3) this.b).w;
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
