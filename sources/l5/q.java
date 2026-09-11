package l5;

import java.util.Set;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
