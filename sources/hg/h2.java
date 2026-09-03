package hg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ h2(v2 v2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                v2 v2Var = this.b;
                ArrayList arrayList = v2Var.o0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                s2 s2Var = v2Var.V;
                if (s2Var.K) {
                    s2Var.setLoading(false);
                    if (v2Var.d.D) {
                        v2Var.d0();
                        break;
                    }
                }
                break;
            case 1:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            case 2:
                v2.T(this.b, (TL_account.TL_birthday) obj);
                break;
            default:
                v2 v2Var2 = this.b;
                v2Var2.l0 = (String) obj;
                androidx.activity.i iVar = v2Var2.t0;
                AndroidUtilities.cancelRunOnUIThread(iVar);
                AndroidUtilities.runOnUIThread(iVar, 350L);
                break;
        }
    }
}
