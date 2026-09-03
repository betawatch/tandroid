package com.google.android.gms.internal.cast;

import java.util.AbstractMap;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m0 extends g0 {
    public final /* synthetic */ n0 c;

    public m0(n0 n0Var) {
        this.c = n0Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        n0 n0Var = this.c;
        j7.v5.a(i10, n0Var.f);
        Object[] objArr = n0Var.e;
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
