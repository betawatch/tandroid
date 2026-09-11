package bi;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class g8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;

    public /* synthetic */ g8(l8 l8Var, int i10) {
        this.a = i10;
        this.b = l8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        l8 l8Var = this.b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(l8Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l8Var);
                break;
            case 1:
                l8Var.u = false;
                l8Var.w = true;
                NotificationCenter.getInstance(l8Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l8Var, Boolean.FALSE);
                break;
            case 2:
                l8Var.z = false;
                break;
            default:
                l8Var.k.clear();
                l8Var.d(true);
                break;
        }
    }
}
