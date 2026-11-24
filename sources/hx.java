// default package

import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hx implements Runnable {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hx(Object obj, byte b) {
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
                    ((mu1) obj).presentFragment(new NotificationsSettingsActivity());
                    break;
                }
                break;
            default:
                hn7 hn7Var = (hn7) obj;
                hn7Var.a(this.b);
                hn7Var.postDelayed(this, hn7Var.N);
                break;
        }
    }
}
