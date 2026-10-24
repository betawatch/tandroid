package n7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class p extends m {
    public final /* synthetic */ q c;

    public p(q qVar) {
        this.c = qVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        q qVar = this.c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.c.f.get(i10), qVar.d.d.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.d.d.size();
    }
}
