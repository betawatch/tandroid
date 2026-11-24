// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
