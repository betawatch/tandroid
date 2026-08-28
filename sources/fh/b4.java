package fh;

import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.zy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b4 extends f2.x {
    public final /* synthetic */ d4 c;

    public b4(d4 d4Var) {
        this.c = d4Var;
    }

    @Override // f2.x
    public final int i(int i9) {
        int i10;
        d4 d4Var = this.c;
        zy zyVar = d4Var.W;
        z41 z41Var = d4Var.Z;
        if (z41Var == null) {
            return zyVar.J;
        }
        l41 G = z41Var.G(i9 - 1);
        return (G == null || (i10 = G.u) == -1) ? zyVar.J : i10;
    }
}
