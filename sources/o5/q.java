package o5;

import java.util.Set;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class q implements l5.f {
    public final Set a;
    public final i b;
    public final s c;

    public q(Set set, i iVar, s sVar) {
        this.a = set;
        this.b = iVar;
        this.c = sVar;
    }

    public final r a(String str, l5.c cVar, l5.e eVar) {
        Set set = this.a;
        if (set.contains(cVar)) {
            return new r(this.b, str, cVar, eVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
