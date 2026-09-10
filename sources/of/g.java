package of;

import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g {
    public final ArrayList a;

    public g(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final f a(int i10) {
        return (f) this.a.get(i10);
    }

    public g(f fVar) {
        ArrayList arrayList = new ArrayList(1);
        this.a = arrayList;
        arrayList.add(fVar);
    }
}
