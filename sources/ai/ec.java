package ai;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
