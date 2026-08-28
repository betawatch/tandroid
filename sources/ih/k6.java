package ih;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n6 b;

    public /* synthetic */ k6(n6 n6Var, int i9) {
        this.a = i9;
        this.b = n6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        n6 n6Var = this.b;
        switch (i9) {
            case 0:
                NotificationCenter.getInstance(n6Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, n6Var);
                break;
            case 1:
                n6Var.u = false;
                n6Var.w = true;
                NotificationCenter.getInstance(n6Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, n6Var, Boolean.FALSE);
                break;
            case 2:
                n6Var.z = false;
                break;
            default:
                n6Var.k.clear();
                n6Var.d(true);
                break;
        }
    }
}
