package com.google.android.play.integrity.internal;

import java.util.List;

/* loaded from: classes.dex */
final class aq extends ar {
    final transient int a;
    final transient int b;
    final /* synthetic */ ar c;

    aq(ar arVar, int i, int i2) {
        this.c = arVar;
        this.a = i;
        this.b = i2;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final int b() {
        return this.c.c() + this.a + this.b;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final int c() {
        return this.c.c() + this.a;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final Object[] e() {
        return this.c.e();
    }

    @Override // com.google.android.play.integrity.internal.ar
    /* renamed from: f */
    public final ar subList(int i, int i2) {
        al.c(i, i2, this.b);
        int i3 = this.a;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        al.a(i, this.b, "index");
        return this.c.get(i + this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // com.google.android.play.integrity.internal.ar, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
