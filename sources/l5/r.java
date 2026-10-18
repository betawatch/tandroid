package l5;

import java.util.Set;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
