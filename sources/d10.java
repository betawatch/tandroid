// default package

import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class d10 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i20 b;
    public final /* synthetic */ cs5 c;

    public /* synthetic */ d10(i20 i20Var, cs5 cs5Var, byte b) {
        this.a = b;
        this.b = i20Var;
        this.c = cs5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cs5 cs5Var = this.c;
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                cs5Var.u();
                i20Var.J0(1);
                break;
            case 1:
                cs5Var.u();
                i20Var.J0(2);
                break;
            case 2:
                cs5Var.u();
                i20Var.J0(4);
                break;
            case 3:
                cs5Var.u();
                i20Var.J0(7);
                break;
            default:
                i20Var.O0(true);
                ir2.v(null, 2131753909, new u21((FrameLayout) i20Var.b, i20Var.J0), R.raw.saved_messages, 36);
                cs5Var.u();
                break;
        }
    }
}
