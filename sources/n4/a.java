package n4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public a(int i9, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.a = i9;
        this.b = i10;
        this.c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f = DesugarCollections.unmodifiableList(list3);
    }
}
