package l5;

import java.util.Set;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class q implements i5.f {
    public final Set a;
    public final i b;
    public final s c;

    public q(Set set, i iVar, s sVar) {
        this.a = set;
        this.b = iVar;
        this.c = sVar;
    }

    public final r a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.a;
        if (set.contains(cVar)) {
            return new r(this.b, str, cVar, eVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
