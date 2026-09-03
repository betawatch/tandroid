package nh;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;

    public /* synthetic */ i6(l6 l6Var, int i10) {
        this.a = i10;
        this.b = l6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        l6 l6Var = this.b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(l6Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l6Var);
                break;
            case 1:
                l6Var.u = false;
                l6Var.w = true;
                NotificationCenter.getInstance(l6Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l6Var, Boolean.FALSE);
                break;
            case 2:
                l6Var.z = false;
                break;
            default:
                l6Var.k.clear();
                l6Var.d(true);
                break;
        }
    }
}
