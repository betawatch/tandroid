package com.google.android.gms.internal.cast;

import java.util.AbstractMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class m0 extends g0 {
    public final /* synthetic */ n0 c;

    public m0(n0 n0Var) {
        this.c = n0Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        n0 n0Var = this.c;
        v7.m5.a(i10, n0Var.f);
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
