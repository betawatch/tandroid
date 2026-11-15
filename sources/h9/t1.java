package h9;

import a8.ja;
import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class t1 extends i0 {
    public final /* synthetic */ u1 c;

    public t1(u1 u1Var) {
        this.c = u1Var;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        u1 u1Var = this.c;
        ja.j(i7, u1Var.h);
        Object[] objArr = u1Var.e;
        int i10 = i7 * 2;
        int i11 = u1Var.f;
        Object obj = objArr[i10 + i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + (i11 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // h9.d0
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.h;
    }
}
