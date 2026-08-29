package eg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ i2(w2 w2Var, int i10) {
        this.a = i10;
        this.b = w2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                w2 w2Var = this.b;
                ArrayList arrayList = w2Var.n0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                t2 t2Var = w2Var.U;
                if (t2Var.J) {
                    t2Var.setLoading(false);
                    if (w2Var.d.C) {
                        w2Var.d0();
                        break;
                    }
                }
                break;
            case 1:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            case 2:
                w2.T(this.b, (TL_account.TL_birthday) obj);
                break;
            default:
                w2 w2Var2 = this.b;
                w2Var2.k0 = (String) obj;
                ag.q1 q1Var = w2Var2.s0;
                AndroidUtilities.cancelRunOnUIThread(q1Var);
                AndroidUtilities.runOnUIThread(q1Var, 350L);
                break;
        }
    }
}
