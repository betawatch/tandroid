package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.lw0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements lw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ h2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.lw0
    public final void F(int i10, boolean z10) {
        switch (this.a) {
            case 0:
                b3 b3Var = ((l3) this.b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    b3Var.e(b3Var.getTopActionBarOffsetY() + (-b3Var.getOffsetY()));
                    break;
                }
                break;
            default:
                ((ii.e2) this.b).getClass();
                break;
        }
    }
}
