package bi;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
