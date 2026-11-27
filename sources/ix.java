// default package

import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
