package bi;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class xb implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k3[] b;

    public xb(boolean[] zArr, org.telegram.ui.ActionBar.k3[] k3VarArr) {
        this.a = zArr;
        this.b = k3VarArr;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.k3 k3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.a[0] && (k3Var = this.b[0]) != null) {
            k3Var.dismiss();
        }
    }
}
