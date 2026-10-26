package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.uw0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements uw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ i2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.uw0
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
