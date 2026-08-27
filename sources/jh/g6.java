package jh;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j6 b;

    public /* synthetic */ g6(j6 j6Var, int i10) {
        this.a = i10;
        this.b = j6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        j6 j6Var = this.b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(j6Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, j6Var);
                break;
            case 1:
                j6Var.u = false;
                j6Var.w = true;
                NotificationCenter.getInstance(j6Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, j6Var, Boolean.FALSE);
                break;
            case 2:
                j6Var.z = false;
                break;
            default:
                j6Var.k.clear();
                j6Var.d(true);
                break;
        }
    }
}
