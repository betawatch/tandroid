package cg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;

    public /* synthetic */ k2(y2 y2Var, int i10) {
        this.a = i10;
        this.b = y2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                y2 y2Var = this.b;
                ArrayList arrayList = y2Var.n0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                v2 v2Var = y2Var.U;
                if (v2Var.J) {
                    v2Var.setLoading(false);
                    if (y2Var.d.C) {
                        y2Var.d0();
                        break;
                    }
                }
                break;
            case 1:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            case 2:
                y2.T(this.b, (TL_account.TL_birthday) obj);
                break;
            default:
                y2 y2Var2 = this.b;
                y2Var2.k0 = (String) obj;
                a8.b bVar = y2Var2.s0;
                AndroidUtilities.cancelRunOnUIThread(bVar);
                AndroidUtilities.runOnUIThread(bVar, 350L);
                break;
        }
    }
}
