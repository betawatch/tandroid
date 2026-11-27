// default package

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
