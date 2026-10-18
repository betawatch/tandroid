package ci;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a7 b;

    public /* synthetic */ x6(a7 a7Var, int i10) {
        this.a = i10;
        this.b = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a7 a7Var = this.b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(a7Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, a7Var);
                break;
            case 1:
                a7Var.u = false;
                a7Var.w = true;
                NotificationCenter.getInstance(a7Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, a7Var, Boolean.FALSE);
                break;
            case 2:
                a7Var.z = false;
                break;
            default:
                a7Var.k.clear();
                a7Var.d(true);
                break;
        }
    }
}
