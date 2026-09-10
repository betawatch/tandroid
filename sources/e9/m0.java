package e9;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class m0 extends d0 implements Set, j$.util.Set {
    public static final /* synthetic */ int c = 0;
    public transient i0 b;

    public static int t(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return TLObject.FLAG_30;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static m0 u(int i10, Object... objArr) {
        if (i10 == 0) {
            return g1.s;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new m1(obj);
        }
        int t10 = t(i10);
        Object[] objArr2 = new Object[t10];
        int i11 = t10 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(hc.b.j(i14, "at index "));
            }
            int hashCode = obj2.hashCode();
            int s10 = q.s(hashCode);
            while (true) {
                int i15 = s10 & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += hashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                s10++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new m1(obj4);
        }
        if (t(i13) < t10 / 2) {
            return u(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new g1(i12, i11, i13, objArr, objArr2);
    }

    public static m0 v(Collection collection) {
        if ((collection instanceof m0) && !(collection instanceof SortedSet)) {
            m0 m0Var = (m0) collection;
            if (!m0Var.r()) {
                return m0Var;
            }
        }
        Object[] array = collection.toArray();
        return u(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof m0) && (this instanceof g1) && (((m0) obj) instanceof g1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return q.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return q.m(this);
    }

    @Override // e9.d0
    public i0 i() {
        i0 i0Var = this.b;
        if (i0Var != null) {
            return i0Var;
        }
        i0 w10 = w();
        this.b = w10;
        return w10;
    }

    public i0 w() {
        Object[] array = toArray(d0.a);
        g0 g0Var = i0.b;
        return i0.t(array.length, array);
    }
}
