package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.wu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements wu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ a2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.a = i9;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.wu0
    public final void G(int i9, boolean z10) {
        switch (this.a) {
            case 0:
                t2 t2Var = ((c3) this.b).v;
                if (i9 > AndroidUtilities.dp(20.0f)) {
                    t2Var.e(t2Var.getTopActionBarOffsetY() + (-t2Var.getOffsetY()));
                    break;
                }
                break;
            default:
                ((qh.x1) this.b).getClass();
                break;
        }
    }
}
