// default package

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class fo5 extends to5 {
    public static fo5 g(HashMap hashMap) {
        Set entrySet = hashMap.entrySet();
        eo5 eo5Var = new eo5(entrySet != null ? entrySet.size() : 4);
        eo5Var.G(entrySet);
        return eo5Var.D();
    }

    @Override // to5
    /* renamed from: f */
    public final jo5 values() {
        i99 i99Var = ((i99) this).n;
        bp5 bp5Var = i99Var.b;
        if (bp5Var != null) {
            return bp5Var;
        }
        m99 d = i99Var.d();
        i99Var.b = d;
        return d;
    }

    @Override // to5, java.util.Map
    public final Collection values() {
        i99 i99Var = ((i99) this).n;
        bp5 bp5Var = i99Var.b;
        if (bp5Var != null) {
            return bp5Var;
        }
        m99 d = i99Var.d();
        i99Var.b = d;
        return d;
    }
}
