// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ea {
    public final long a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public ea(long j, int i, ArrayList arrayList, List list, List list2, List list3) {
        this.a = j;
        this.b = i;
        this.c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f = DesugarCollections.unmodifiableList(list3);
    }
}
