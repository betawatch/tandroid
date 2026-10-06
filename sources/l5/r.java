package l5;

import java.util.Set;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
