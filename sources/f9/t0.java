package f9;

import a8.yb;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class t0 extends d0 implements Set, j$.util.Set {
    public static final /* synthetic */ int c = 0;
    public transient i0 b;

    public static int s(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            yb.f("collection too large", max < 1073741824);
            return TLObject.FLAG_30;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static t0 t(int i10, Object... objArr) {
        if (i10 == 0) {
            return z1.s;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new e2(obj);
        }
        int s10 = s(i10);
        Object[] objArr2 = new Object[s10];
        int i11 = s10 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(ic.a.i(i14, "at index "));
            }
            int hashCode = obj2.hashCode();
            int t10 = o.t(hashCode);
            while (true) {
                int i15 = t10 & i11;
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
                t10++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new e2(obj4);
        }
        if (s(i13) < s10 / 2) {
            return t(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new z1(i12, i11, i13, objArr, objArr2);
    }

    public static t0 u(Collection collection) {
        if ((collection instanceof t0) && !(collection instanceof SortedSet)) {
            t0 t0Var = (t0) collection;
            if (!t0Var.q()) {
                return t0Var;
            }
        }
        Object[] array = collection.toArray();
        return t(array.length, array);
    }

    public static t0 w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        yb.f("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return t(length, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof t0) && (this instanceof z1) && (((t0) obj) instanceof z1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return o.j(this, obj);
    }

    @Override // f9.d0
    public i0 h() {
        i0 i0Var = this.b;
        if (i0Var != null) {
            return i0Var;
        }
        i0 v = v();
        this.b = v;
        return v;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return o.n(this);
    }

    public i0 v() {
        Object[] array = toArray(d0.a);
        g0 g0Var = i0.b;
        return i0.s(array.length, array);
    }
}
