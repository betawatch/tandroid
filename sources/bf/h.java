package bf;

import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
