package ab;

import kotlin.jvm.internal.i;
import w9.j;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
