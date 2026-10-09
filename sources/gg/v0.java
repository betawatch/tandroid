package gg;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.kb0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements MediaDataController.KeywordResultCallback, org.telegram.ui.Cells.e2 {
    public final /* synthetic */ j1 a;

    public /* synthetic */ v0(j1 j1Var) {
        this.a = j1Var;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        j1 j1Var = this.a;
        j1Var.N = arrayList;
        j1Var.I = null;
        j1Var.A0 = null;
        j1Var.x = null;
        j1Var.y = null;
        j1Var.J = null;
        j1Var.Q = null;
        j1Var.M = null;
        j1Var.K = null;
        j1Var.P = null;
        j1Var.l();
        kb0 kb0Var = j1Var.V;
        ArrayList arrayList2 = j1Var.N;
        kb0Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
