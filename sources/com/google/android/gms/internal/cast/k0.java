package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class k0 extends e0 implements Set, j$.util.Set {
    public static final /* synthetic */ int c = 0;
    public transient h0 b;

    public static int q(int i9) {
        int max = Math.max(i9, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return TLObject.FLAG_30;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static k0 r(int i9, Object... objArr) {
        if (i9 == 0) {
            return t0.s;
        }
        if (i9 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new u0(obj);
        }
        int q10 = q(i9);
        Object[] objArr2 = new Object[q10];
        int i10 = q10 - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(j3.r0.l(i13, "at index "));
            }
            int hashCode = obj2.hashCode();
            int a2 = f7.o5.a(hashCode);
            while (true) {
                int i14 = a2 & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += hashCode;
                    i12++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    a2++;
                }
            }
        }
        Arrays.fill(objArr, i12, i9, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new u0(obj4);
        }
        if (q(i12) < q10 / 2) {
            return r(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new t0(i11, i10, i12, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof k0) && (this instanceof t0) && (((k0) obj) instanceof t0) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i9 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i9 += next != null ? next.hashCode() : 0;
        }
        return i9;
    }
}
