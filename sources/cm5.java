// default package

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class cm5 extends qm5 {
    public static cm5 g(HashMap hashMap) {
        Set entrySet = hashMap.entrySet();
        bm5 bm5Var = new bm5(entrySet != null ? entrySet.size() : 4);
        bm5Var.E(entrySet);
        return bm5Var.C();
    }

    @Override // qm5
    /* renamed from: f */
    public final gm5 values() {
        v59 v59Var = ((v59) this).n;
        ym5 ym5Var = v59Var.b;
        if (ym5Var != null) {
            return ym5Var;
        }
        z59 d = v59Var.d();
        v59Var.b = d;
        return d;
    }

    @Override // qm5, java.util.Map
    public final Collection values() {
        v59 v59Var = ((v59) this).n;
        ym5 ym5Var = v59Var.b;
        if (ym5Var != null) {
            return ym5Var;
        }
        z59 d = v59Var.d();
        v59Var.b = d;
        return d;
    }
}
