package a4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class l implements z3.d {
    public final List a;

    public l(List list) {
        this.a = list;
    }

    @Override // z3.d
    public int c(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // z3.d
    public long d(int i10) {
        u6.g(i10 == 0);
        return 0L;
    }

    @Override // z3.d
    public List e(long j10) {
        return j10 >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // z3.d
    public int h() {
        return 1;
    }

    public l(ArrayList arrayList) {
        this.a = DesugarCollections.unmodifiableList(arrayList);
    }
}
