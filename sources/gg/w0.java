package gg;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.wa0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements MediaDataController.KeywordResultCallback, org.telegram.ui.Cells.e2 {
    public final /* synthetic */ k1 a;

    public /* synthetic */ w0(k1 k1Var) {
        this.a = k1Var;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        k1 k1Var = this.a;
        k1Var.N = arrayList;
        k1Var.I = null;
        k1Var.A0 = null;
        k1Var.x = null;
        k1Var.y = null;
        k1Var.J = null;
        k1Var.Q = null;
        k1Var.M = null;
        k1Var.K = null;
        k1Var.P = null;
        k1Var.l();
        wa0 wa0Var = k1Var.V;
        ArrayList arrayList2 = k1Var.N;
        wa0Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
