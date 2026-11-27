// default package

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class dnd extends b4d implements Set, j$.util.Set {
    public static final /* synthetic */ int r = 0;
    public transient omd n;

    public static dnd y(int i, Object... objArr) {
        if (i == 0) {
            return jqd.G;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new qrd(obj);
        }
        int z = z(i);
        Object[] objArr2 = new Object[z];
        int i2 = z - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                p3d.h(uh9.k(i5, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
            while (true) {
                int i6 = rotateLeft & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    rotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new qrd(obj4);
        }
        if (z(i4) < z / 2) {
            return y(i4, objArr);
        }
        if (i4 <= 0) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new jqd(i3, i2, i4, objArr, objArr2);
    }

    public static int z(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit <<= 1;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            return TLObject.FLAG_30;
        }
        lq5.j("collection too large");
        return 0;
    }

    public omd A() {
        omd omdVar = this.n;
        if (omdVar != null) {
            return omdVar;
        }
        omd B = B();
        this.n = B;
        return B;
    }

    public omd B() {
        Object[] array = toArray(b4d.f);
        ukd ukdVar = omd.n;
        return omd.A(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof dnd) && (this instanceof jqd) && (((dnd) obj) instanceof jqd) && ((jqd) this).w != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (size() == set.size()) {
                return containsAll(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return t5f.a(this);
    }
}
