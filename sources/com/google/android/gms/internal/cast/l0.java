package com.google.android.gms.internal.cast;

import java.util.AbstractMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l0 extends f0 {
    public final /* synthetic */ m0 c;

    public l0(m0 m0Var) {
        this.c = m0Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        m0 m0Var = this.c;
        j7.t5.a(i10, m0Var.f);
        Object[] objArr = m0Var.e;
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
