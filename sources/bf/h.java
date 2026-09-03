package bf;

import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
