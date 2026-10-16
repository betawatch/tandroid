package bi;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ j8(o8 o8Var, int i10) {
        this.a = i10;
        this.b = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        o8 o8Var = this.b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(o8Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, o8Var);
                break;
            case 1:
                o8Var.u = false;
                o8Var.w = true;
                NotificationCenter.getInstance(o8Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, o8Var, Boolean.FALSE);
                break;
            case 2:
                o8Var.z = false;
                break;
            default:
                o8Var.k.clear();
                o8Var.d(true);
                break;
        }
    }
}
