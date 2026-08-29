package lh;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k6 b;

    public /* synthetic */ h6(k6 k6Var, int i10) {
        this.a = i10;
        this.b = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        k6 k6Var = this.b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(k6Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, k6Var);
                break;
            case 1:
                k6Var.u = false;
                k6Var.w = true;
                NotificationCenter.getInstance(k6Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, k6Var, Boolean.FALSE);
                break;
            case 2:
                k6Var.z = false;
                break;
            default:
                k6Var.k.clear();
                k6Var.d(true);
                break;
        }
    }
}
