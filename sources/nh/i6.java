package nh;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
