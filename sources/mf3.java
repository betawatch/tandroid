// default package

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mf3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oh3 b;

    public /* synthetic */ mf3(oh3 oh3Var, byte b) {
        this.a = b;
        this.b = oh3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        byte b = this.a;
        oh3 oh3Var = this.b;
        switch (b) {
            case 0:
                cj3 cj3Var = oh3Var.P0;
                if (!cj3Var.M || !cj3Var.t3().H()) {
                    cj3Var.N4(true, true);
                    break;
                } else {
                    cj3Var.F0.h();
                    break;
                }
                break;
            case 1:
                oh3Var.P0.F0.j(0L);
                break;
            case 2:
                Bundle bundle = new Bundle();
                cj3 cj3Var2 = oh3Var.P0;
                i = ((d) cj3Var2).currentAccount;
                bundle.putLong("dialog_id", y6c.h(i).e());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                bundle.putInt("start_from", 9);
                cj3Var2.presentFragment(new zj6(bundle, null));
                break;
            default:
                Bundle bundle2 = new Bundle();
                cj3 cj3Var3 = oh3Var.P0;
                i2 = ((d) cj3Var3).currentAccount;
                bundle2.putLong("dialog_id", y6c.h(i2).e());
                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                cj3Var3.presentFragment(new zj6(bundle2, null));
                break;
        }
    }
}
