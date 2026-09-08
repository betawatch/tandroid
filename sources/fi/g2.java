package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.nv0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements nv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ g2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.nv0
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
                ((ji.c2) this.b).getClass();
                break;
        }
    }
}
