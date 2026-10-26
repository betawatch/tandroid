package bi;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
