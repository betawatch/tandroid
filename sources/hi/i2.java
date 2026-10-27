package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.vw0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements vw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ i2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.vw0
    public final void I(int i10, boolean z10) {
        switch (this.a) {
            case 0:
                d3 d3Var = ((m3) this.b).w;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    d3Var.e(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()));
                    break;
                }
                break;
            default:
                ((li.b2) this.b).getClass();
                break;
        }
    }
}
