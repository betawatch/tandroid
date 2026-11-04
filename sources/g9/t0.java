package g9;

import b8.zb;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class t0 extends d0 implements Set, j$.util.Set {
    public static final /* synthetic */ int c = 0;
    public transient i0 b;

    public static int o(int i3) {
        int max = Math.max(i3, 2);
        if (max >= 751619276) {
            zb.e("collection too large", max < 1073741824);
            return TLObject.FLAG_30;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static t0 p(int i3, Object... objArr) {
        if (i3 == 0) {
            return z1.s;
        }
        if (i3 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new e2(obj);
        }
        int o10 = o(i3);
        Object[] objArr2 = new Object[o10];
        int i10 = o10 - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i3; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(k2.p1.i(i13, "at index "));
            }
            int hashCode = obj2.hashCode();
            int u10 = o.u(hashCode);
            while (true) {
                int i14 = u10 & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += hashCode;
                    i12++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                u10++;
            }
        }
        Arrays.fill(objArr, i12, i3, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new e2(obj4);
        }
        if (o(i12) < o10 / 2) {
            return p(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new z1(i11, i10, i12, objArr, objArr2);
    }

    public static t0 q(Collection collection) {
        if ((collection instanceof t0) && !(collection instanceof SortedSet)) {
            t0 t0Var = (t0) collection;
            if (!t0Var.m()) {
                return t0Var;
            }
        }
        Object[] array = collection.toArray();
        return p(array.length, array);
    }

    public static t0 s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        zb.e("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return p(length, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof t0) && (this instanceof z1) && (((t0) obj) instanceof z1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return o.k(this, obj);
    }

    @Override // g9.d0
    public i0 h() {
        i0 i0Var = this.b;
        if (i0Var != null) {
            return i0Var;
        }
        i0 r5 = r();
        this.b = r5;
        return r5;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return o.o(this);
    }

    public i0 r() {
        Object[] array = toArray(d0.a);
        g0 g0Var = i0.b;
        return i0.o(array.length, array);
    }
}
