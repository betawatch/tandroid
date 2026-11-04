package com.google.android.gms.internal.cast;

import b8.ba;
import java.util.AbstractMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l0 extends g0 {
    public final /* synthetic */ m0 c;

    public l0(m0 m0Var) {
        this.c = m0Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i3) {
        m0 m0Var = this.c;
        ba.a(i3, m0Var.f);
        Object[] objArr = m0Var.e;
        int i10 = i3 + i3;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
