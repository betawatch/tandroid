package ai;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class ec implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3[] b;

    public ec(boolean[] zArr, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.a = zArr;
        this.b = h3VarArr;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.h3 h3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.a[0] && (h3Var = this.b[0]) != null) {
            h3Var.dismiss();
        }
    }
}
