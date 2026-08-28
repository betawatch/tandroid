package of;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.r90;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements MediaDataController.KeywordResultCallback, d2 {
    public final /* synthetic */ f1 a;

    public /* synthetic */ s0(f1 f1Var) {
        this.a = f1Var;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        f1 f1Var = this.a;
        f1Var.J = arrayList;
        f1Var.E = null;
        f1Var.w0 = null;
        f1Var.x = null;
        f1Var.y = null;
        f1Var.F = null;
        f1Var.M = null;
        f1Var.I = null;
        f1Var.G = null;
        f1Var.L = null;
        f1Var.l();
        r90 r90Var = f1Var.R;
        ArrayList arrayList2 = f1Var.J;
        r90Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
