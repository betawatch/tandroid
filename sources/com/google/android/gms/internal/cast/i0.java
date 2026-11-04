package com.google.android.gms.internal.cast;

import b8.ea;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class i0 extends d0 implements Set, j$.util.Set {
    public static final /* synthetic */ int c = 0;
    public transient g0 b;

    public static int l(int i3) {
        int max = Math.max(i3, 2);
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

    public static i0 m(int i3, Object... objArr) {
        if (i3 == 0) {
            return r0.s;
        }
        if (i3 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new s0(obj);
        }
        int l10 = l(i3);
        Object[] objArr2 = new Object[l10];
        int i10 = l10 - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i3; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(k2.p1.i(i13, "at index "));
            }
            int hashCode = obj2.hashCode();
            int a10 = ea.a(hashCode);
            while (true) {
                int i14 = a10 & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += hashCode;
                    i12++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    a10++;
                }
            }
        }
        Arrays.fill(objArr, i12, i3, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new s0(obj4);
        }
        if (l(i12) < l10 / 2) {
            return m(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new r0(i11, i10, i12, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof i0) && (this instanceof r0) && (((i0) obj) instanceof r0) && hashCode() != obj.hashCode()) {
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
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3 += next != null ? next.hashCode() : 0;
        }
        return i3;
    }
}
