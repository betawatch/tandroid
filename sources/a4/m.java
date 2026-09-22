package a4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class m implements z3.d {
    public final List a;

    public m(List list) {
        this.a = list;
    }

    @Override // z3.d
    public int a(long j3) {
        return j3 < 0 ? 0 : -1;
    }

    @Override // z3.d
    public long d(int i10) {
        e2.d.b(i10 == 0);
        return 0L;
    }

    @Override // z3.d
    public List f(long j3) {
        return j3 >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // z3.d
    public int g() {
        return 1;
    }

    public m(ArrayList arrayList) {
        this.a = DesugarCollections.unmodifiableList(arrayList);
    }
}
