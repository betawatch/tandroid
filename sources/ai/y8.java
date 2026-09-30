package ai;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
