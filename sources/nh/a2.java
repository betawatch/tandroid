package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.yu0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements yu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ a2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.yu0
    public final void H(int i10, boolean z10) {
        switch (this.a) {
            case 0:
                s2 s2Var = ((b3) this.b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    s2Var.e(s2Var.getTopActionBarOffsetY() + (-s2Var.getOffsetY()));
                    break;
                }
                break;
            default:
                ((rh.x1) this.b).getClass();
                break;
        }
    }
}
