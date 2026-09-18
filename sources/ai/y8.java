package ai;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;

    public /* synthetic */ y8(d9 d9Var, int i10) {
        this.a = i10;
        this.b = d9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        d9 d9Var = this.b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(d9Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var);
                break;
            case 1:
                d9Var.u = false;
                d9Var.w = true;
                NotificationCenter.getInstance(d9Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var, Boolean.FALSE);
                break;
            case 2:
                d9Var.z = false;
                break;
            default:
                d9Var.k.clear();
                d9Var.d(true);
                break;
        }
    }
}
