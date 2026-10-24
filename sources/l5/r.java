package l5;

import java.util.Set;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class r implements i5.f {
    public final Set a;
    public final i b;
    public final t c;

    public r(Set set, i iVar, t tVar) {
        this.a = set;
        this.b = iVar;
        this.c = tVar;
    }

    public final s a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.a;
        if (set.contains(cVar)) {
            return new s(this.b, str, cVar, eVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
