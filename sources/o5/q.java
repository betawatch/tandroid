package o5;

import java.util.Set;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
