package bf;

import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h {
    public final ArrayList a;

    public h(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final g a(int i10) {
        return (g) this.a.get(i10);
    }

    public h(g gVar) {
        ArrayList arrayList = new ArrayList(1);
        this.a = arrayList;
        arrayList.add(gVar);
    }
}
