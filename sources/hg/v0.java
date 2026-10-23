package hg;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.eb0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements MediaDataController.KeywordResultCallback, org.telegram.ui.Cells.d2 {
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
        eb0 eb0Var = j1Var.V;
        ArrayList arrayList2 = j1Var.N;
        eb0Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
