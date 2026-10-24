package com.google.android.gms.internal.cast;

import java.util.AbstractMap;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class n0 extends h0 {
    public final /* synthetic */ o0 c;

    public n0(o0 o0Var) {
        this.c = o0Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        o0 o0Var = this.c;
        v7.l5.a(i10, o0Var.f);
        Object[] objArr = o0Var.e;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
