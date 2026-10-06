package ab;

import kotlin.jvm.internal.i;
import w9.j;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class a {
    public final ie.d a;
    public j b = null;

    public a(ie.d dVar) {
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && i.a(this.b, aVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j jVar = this.b;
        return hashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
    }
}
