package ai;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
