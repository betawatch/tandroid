package fg;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.sa0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements MediaDataController.KeywordResultCallback, org.telegram.ui.Cells.d2 {
    public final /* synthetic */ l1 a;

    public /* synthetic */ w0(l1 l1Var) {
        this.a = l1Var;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        l1 l1Var = this.a;
        l1Var.N = arrayList;
        l1Var.I = null;
        l1Var.A0 = null;
        l1Var.x = null;
        l1Var.y = null;
        l1Var.J = null;
        l1Var.Q = null;
        l1Var.M = null;
        l1Var.K = null;
        l1Var.P = null;
        l1Var.l();
        sa0 sa0Var = l1Var.V;
        ArrayList arrayList2 = l1Var.N;
        sa0Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
