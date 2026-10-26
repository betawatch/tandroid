package m5;

import java.util.Set;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class r implements j5.f {
    public final Set a;
    public final i b;
    public final t c;

    public r(Set set, i iVar, t tVar) {
        this.a = set;
        this.b = iVar;
        this.c = tVar;
    }

    public final s a(String str, j5.c cVar, j5.e eVar) {
        Set set = this.a;
        if (set.contains(cVar)) {
            return new s(this.b, str, cVar, eVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
