package a4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
