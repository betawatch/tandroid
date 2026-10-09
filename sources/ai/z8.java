package ai;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;

    public /* synthetic */ z8(e9 e9Var, int i10) {
        this.a = i10;
        this.b = e9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        e9 e9Var = this.b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(e9Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, e9Var);
                break;
            case 1:
                e9Var.u = false;
                e9Var.w = true;
                NotificationCenter.getInstance(e9Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, e9Var, Boolean.FALSE);
                break;
            case 2:
                e9Var.z = false;
                break;
            default:
                e9Var.k.clear();
                e9Var.d(true);
                break;
        }
    }
}
