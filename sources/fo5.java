// default package

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
