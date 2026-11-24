// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class h58 {
    public final String a;
    public final long b;
    public final List c;
    public final List d;

    public h58(String str, long j, ArrayList arrayList, List list) {
        this.a = str;
        this.b = j;
        this.c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
