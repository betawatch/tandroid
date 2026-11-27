// default package

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class k99 extends po5 {
    public final /* synthetic */ l99 c;

    public k99(l99 l99Var) {
        this.c = l99Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        l99 l99Var = this.c;
        yve.j(i, l99Var.h);
        Object[] objArr = l99Var.e;
        int i2 = i << 1;
        boolean z = l99Var.f;
        Object obj = objArr[i2 + (z ? 1 : 0)];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (!z ? 1 : 0)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // jo5
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.h;
    }
}
