package o5;

import java.util.Set;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class r implements l5.f {
    public final Set a;
    public final i b;
    public final t c;

    public r(Set set, i iVar, t tVar) {
        this.a = set;
        this.b = iVar;
        this.c = tVar;
    }

    public final s a(String str, l5.c cVar, l5.e eVar) {
        Set set = this.a;
        if (set.contains(cVar)) {
            return new s(this.b, str, cVar, eVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
