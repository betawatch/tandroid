package n7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
