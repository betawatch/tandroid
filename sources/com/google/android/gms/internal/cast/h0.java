package com.google.android.gms.internal.cast;

import a8.q8;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class h0 extends c0 implements Set, j$.util.Set {
    public static final /* synthetic */ int c = 0;
    public transient f0 b;

    public static int l(int i7) {
        int max = Math.max(i7, 2);
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

    public static h0 m(int i7, Object... objArr) {
        if (i7 == 0) {
            return q0.s;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new r0(obj);
        }
        int l10 = l(i7);
        Object[] objArr2 = new Object[l10];
        int i10 = l10 - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i7; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(jg.g.j(i13, "at index "));
            }
            int hashCode = obj2.hashCode();
            int a10 = q8.a(hashCode);
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
        Arrays.fill(objArr, i12, i7, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new r0(obj4);
        }
        if (l(i12) < l10 / 2) {
            return m(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new q0(i11, i10, i12, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof h0) && (this instanceof q0) && (((h0) obj) instanceof q0) && hashCode() != obj.hashCode()) {
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
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 += next != null ? next.hashCode() : 0;
        }
        return i7;
    }
}
