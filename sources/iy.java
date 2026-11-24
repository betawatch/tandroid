// default package

import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iy implements Runnable {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iy(Object obj, byte b) {
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
                    ((yv1) obj).presentFragment(new NotificationsSettingsActivity());
                    break;
                }
                break;
            default:
                lp7 lp7Var = (lp7) obj;
                lp7Var.a(this.b);
                lp7Var.postDelayed(this, lp7Var.N);
                break;
        }
    }
}
