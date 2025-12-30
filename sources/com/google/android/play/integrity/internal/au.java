package com.google.android.play.integrity.internal;

import java.util.Iterator;

/* loaded from: classes.dex */
final class au extends as {
    static final au a;
    private static final Object[] d;
    final transient Object[] b;
    final transient Object[] c;

    static {
        Object[] objArr = new Object[0];
        d = objArr;
        a = new au(objArr, 0, objArr, 0, 0);
    }

    au(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = objArr2;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, 0, 0);
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final int b() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.c.length;
        return false;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final Object[] e() {
        return this.b;
    }

    @Override // com.google.android.play.integrity.internal.as
    final ar g() {
        int i = ar.$r8$clinit;
        return at.a;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.as
    final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
