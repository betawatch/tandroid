package com.google.android.gms.internal.cast;

import a8.ea;
import java.util.AbstractMap;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k0 extends f0 {
    public final /* synthetic */ l0 c;

    public k0(l0 l0Var) {
        this.c = l0Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        l0 l0Var = this.c;
        ea.a(i10, l0Var.f);
        Object[] objArr = l0Var.e;
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
