package di;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;

    public /* synthetic */ w6(z6 z6Var, int i10) {
        this.a = i10;
        this.b = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        z6 z6Var = this.b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(z6Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, z6Var);
                break;
            case 1:
                z6Var.u = false;
                z6Var.w = true;
                NotificationCenter.getInstance(z6Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, z6Var, Boolean.FALSE);
                break;
            case 2:
                z6Var.z = false;
                break;
            default:
                z6Var.k.clear();
                z6Var.d(true);
                break;
        }
    }
}
