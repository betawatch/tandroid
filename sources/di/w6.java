package di;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
