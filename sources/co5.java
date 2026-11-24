// default package

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class co5 extends qo5 {
    public static co5 g(HashMap hashMap) {
        Set entrySet = hashMap.entrySet();
        bo5 bo5Var = new bo5(entrySet != null ? entrySet.size() : 4);
        bo5Var.E(entrySet);
        return bo5Var.C();
    }

    @Override // qo5
    /* renamed from: f */
    public final go5 values() {
        x79 x79Var = ((x79) this).n;
        yo5 yo5Var = x79Var.b;
        if (yo5Var != null) {
            return yo5Var;
        }
        b89 d = x79Var.d();
        x79Var.b = d;
        return d;
    }

    @Override // qo5, java.util.Map
    public final Collection values() {
        x79 x79Var = ((x79) this).n;
        yo5 yo5Var = x79Var.b;
        if (yo5Var != null) {
            return yo5Var;
        }
        b89 d = x79Var.d();
        x79Var.b = d;
        return d;
    }
}
