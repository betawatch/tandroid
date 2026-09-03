package lh;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class e9 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g3[] b;

    public e9(boolean[] zArr, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.a = zArr;
        this.b = g3VarArr;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.g3 g3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.a[0] && (g3Var = this.b[0]) != null) {
            g3Var.dismiss();
        }
    }
}
