// default package

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class j9d implements sgd {
    public transient f7d a;
    public transient d3 b;

    public final Map a() {
        d3 d3Var = this.b;
        if (d3Var != null) {
            return d3Var;
        }
        l9d l9dVar = (l9d) this;
        d3 d3Var2 = new d3(l9dVar, l9dVar.c, (byte) 2);
        this.b = d3Var2;
        return d3Var2;
    }

    public final Set b() {
        f7d f7dVar = this.a;
        if (f7dVar != null) {
            return f7dVar;
        }
        l9d l9dVar = (l9d) this;
        f7d f7dVar2 = new f7d(l9dVar, l9dVar.c);
        this.a = f7dVar2;
        return f7dVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sgd) {
            return a().equals(((j9d) ((sgd) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((dq2) ((d3) a()).d).hashCode();
    }

    public final String toString() {
        return ((dq2) ((d3) a()).d).toString();
    }
}
