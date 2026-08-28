package bg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ g3 b;

    public /* synthetic */ s2(g3 g3Var, int i9) {
        this.a = i9;
        this.b = g3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                g3 g3Var = this.b;
                ArrayList arrayList = g3Var.n0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                d3 d3Var = g3Var.U;
                if (d3Var.J) {
                    d3Var.setLoading(false);
                    if (g3Var.d.C) {
                        g3Var.c0();
                        break;
                    }
                }
                break;
            case 1:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            case 2:
                g3.S(this.b, (TL_account.TL_birthday) obj);
                break;
            default:
                g3 g3Var2 = this.b;
                g3Var2.k0 = (String) obj;
                androidx.activity.i iVar = g3Var2.s0;
                AndroidUtilities.cancelRunOnUIThread(iVar);
                AndroidUtilities.runOnUIThread(iVar, 350L);
                break;
        }
    }
}
