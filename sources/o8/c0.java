package o8;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class c0 extends u implements Set {
    public static final /* synthetic */ int c = 0;
    public transient z b;

    public static int s(int i9) {
        int max = Math.max(i9, 2);
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

    public static c0 t(int i9, Object... objArr) {
        if (i9 == 0) {
            return r0.s;
        }
        if (i9 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new w0(obj);
        }
        int s10 = s(i9);
        Object[] objArr2 = new Object[s10];
        int i10 = s10 - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i13);
                throw new NullPointerException(sb2.toString());
            }
            int hashCode = obj2.hashCode();
            int o6 = l.o(hashCode);
            while (true) {
                int i14 = o6 & i10;
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
                o6++;
            }
        }
        Arrays.fill(objArr, i12, i9, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new w0(obj4);
        }
        if (s(i12) < s10 / 2) {
            return t(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new r0(i11, i10, i12, objArr, objArr2);
    }

    public static c0 u(Collection collection) {
        if ((collection instanceof c0) && !(collection instanceof SortedSet)) {
            c0 c0Var = (c0) collection;
            if (!c0Var.r()) {
                return c0Var;
            }
        }
        Object[] array = collection.toArray();
        return t(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof c0) && (this instanceof r0) && (((c0) obj) instanceof r0) && hashCode() != obj.hashCode()) {
            return false;
        }
        return l.d(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return l.h(this);
    }

    @Override // o8.u
    public z i() {
        z zVar = this.b;
        if (zVar != null) {
            return zVar;
        }
        z v = v();
        this.b = v;
        return v;
    }

    public z v() {
        Object[] array = toArray(u.a);
        x xVar = z.b;
        return z.s(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract x0 iterator();
}
