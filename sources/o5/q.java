package o5;

import java.util.Set;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
