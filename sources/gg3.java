// default package

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gg3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ii3 b;

    public /* synthetic */ gg3(ii3 ii3Var, byte b) {
        this.a = b;
        this.b = ii3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        byte b = this.a;
        ii3 ii3Var = this.b;
        switch (b) {
            case 0:
                uj3 uj3Var = ii3Var.P0;
                if (!uj3Var.M || !uj3Var.v3().H()) {
                    uj3Var.R4(true, true);
                    break;
                } else {
                    uj3Var.F0.h();
                    break;
                }
                break;
            case 1:
                ii3Var.P0.F0.j(0L);
                break;
            case 2:
                Bundle bundle = new Bundle();
                uj3 uj3Var2 = ii3Var.P0;
                i = ((e) uj3Var2).currentAccount;
                bundle.putLong("dialog_id", yac.h(i).e());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                bundle.putInt("start_from", 9);
                uj3Var2.presentFragment(new em6(bundle, null));
                break;
            default:
                Bundle bundle2 = new Bundle();
                uj3 uj3Var3 = ii3Var.P0;
                i2 = ((e) uj3Var3).currentAccount;
                bundle2.putLong("dialog_id", yac.h(i2).e());
                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                uj3Var3.presentFragment(new em6(bundle2, null));
                break;
        }
    }
}
