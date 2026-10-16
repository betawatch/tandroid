package e9;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.telegram.tgnet.TLObject;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class y0 extends i0 implements Set, j$.util.Set {
    public static final /* synthetic */ int c = 0;
    public transient n0 b;

    public static int s(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            u6.f("collection too large", max < 1073741824);
            return TLObject.FLAG_30;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static y0 t(int i10, Object... objArr) {
        if (i10 == 0) {
            return e2.s;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new k2(obj);
        }
        int s10 = s(i10);
        Object[] objArr2 = new Object[s10];
        int i11 = s10 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(i2.d.j(i14, "at index "));
            }
            int hashCode = obj2.hashCode();
            int t10 = s.t(hashCode);
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
            return new k2(obj4);
        }
        if (s(i13) < s10 / 2) {
            return t(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new e2(i12, i11, i13, objArr, objArr2);
    }

    public static y0 u(Collection collection) {
        if ((collection instanceof y0) && !(collection instanceof SortedSet)) {
            y0 y0Var = (y0) collection;
            if (!y0Var.q()) {
                return y0Var;
            }
        }
        Object[] array = collection.toArray();
        return t(array.length, array);
    }

    public static y0 w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        u6.f("the total number of elements must fit in an int", objArr.length <= 2147483641);
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
        if ((obj instanceof y0) && (this instanceof e2) && (((y0) obj) instanceof e2) && hashCode() != obj.hashCode()) {
            return false;
        }
        return s.j(this, obj);
    }

    @Override // e9.i0
    public n0 h() {
        n0 n0Var = this.b;
        if (n0Var != null) {
            return n0Var;
        }
        n0 v = v();
        this.b = v;
        return v;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return s.n(this);
    }

    public n0 v() {
        Object[] array = toArray(i0.a);
        l0 l0Var = n0.b;
        return n0.s(array.length, array);
    }
}
