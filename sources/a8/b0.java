package a8;

import java.util.AbstractMap;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b0 extends u {
    public final /* synthetic */ c0 c;

    public b0(c0 c0Var) {
        this.c = c0Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i7) {
        c0 c0Var = this.c;
        x0.a(i7, c0Var.e);
        int i10 = i7 + i7;
        Object[] objArr = c0Var.d;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
