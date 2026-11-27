// default package

import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d10 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j20 b;
    public final /* synthetic */ fu5 c;

    public /* synthetic */ d10(j20 j20Var, fu5 fu5Var, byte b) {
        this.a = b;
        this.b = j20Var;
        this.c = fu5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fu5 fu5Var = this.c;
        j20 j20Var = this.b;
        switch (b) {
            case 0:
                fu5Var.u();
                j20Var.K0(1);
                break;
            case 1:
                fu5Var.u();
                j20Var.K0(2);
                break;
            case 2:
                fu5Var.u();
                j20Var.K0(4);
                break;
            case 3:
                fu5Var.u();
                j20Var.K0(7);
                break;
            default:
                j20Var.P0(true);
                bs2.v(null, 2131753905, new d31((FrameLayout) j20Var.b, j20Var.J0), R.raw.saved_messages, 36);
                fu5Var.u();
                break;
        }
    }
}
