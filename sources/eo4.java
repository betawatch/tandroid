// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class eo4 implements do4 {
    public final int a;
    public final /* synthetic */ go4 b;

    public eo4(go4 go4Var, int i) {
        this.b = go4Var;
        this.a = i;
    }

    @Override // do4
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        go4 go4Var = this.b;
        bn4 bn4Var = go4Var.z;
        int i = this.a;
        if (bn4Var == null || i >= 0 || !bn4Var.l().T(-1, 0)) {
            return go4Var.U(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
