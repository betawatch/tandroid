package com.google.android.gms.internal.cast;

import a8.n8;
import java.util.AbstractMap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class k0 extends f0 {
    public final /* synthetic */ l0 c;

    public k0(l0 l0Var) {
        this.c = l0Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        l0 l0Var = this.c;
        n8.a(i7, l0Var.f);
        Object[] objArr = l0Var.e;
        int i10 = i7 + i7;
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
