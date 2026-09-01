package oh;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
