// default package

import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ix implements Runnable {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ix(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                this.b = false;
                break;
            case 1:
                if (!this.b) {
                    this.b = true;
                    ((zu1) obj).presentFragment(new NotificationsSettingsActivity());
                    break;
                }
                break;
            default:
                hq7 hq7Var = (hq7) obj;
                hq7Var.a(this.b);
                hq7Var.postDelayed(this, hq7Var.N);
                break;
        }
    }
}
