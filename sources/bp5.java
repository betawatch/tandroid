// default package

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class bp5 extends jo5 implements Set, j$.util.Set {
    public static final /* synthetic */ int c = 0;
    public transient po5 b;

    public static int o(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            yve.e("collection too large", max < 1073741824);
            return TLObject.FLAG_30;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static bp5 p(int i, Object... objArr) {
        if (i == 0) {
            return q99.s;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new oma(obj);
        }
        int o = o(i);
        Object[] objArr2 = new Object[o];
        int i2 = o - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                p3d.h(uh9.k(i5, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int a = yne.a(hashCode);
            while (true) {
                int i6 = a & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                a++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new oma(obj4);
        }
        if (o(i4) < o / 2) {
            return p(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new q99(i3, i2, i4, objArr, objArr2);
    }

    public static bp5 q(Collection collection) {
        if ((collection instanceof bp5) && !(collection instanceof SortedSet)) {
            bp5 bp5Var = (bp5) collection;
            if (!bp5Var.m()) {
                return bp5Var;
            }
        }
        Object[] array = collection.toArray();
        return p(array.length, array);
    }

    public static bp5 s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        yve.e("the total number of elements must fit in an int", objArr.length <= 2147483641);
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
        if ((obj instanceof bp5) && (this instanceof q99) && (((bp5) obj) instanceof q99) && ((q99) this).e != obj.hashCode()) {
            return false;
        }
        return qye.a(this, obj);
    }

    @Override // jo5
    public po5 h() {
        po5 po5Var = this.b;
        if (po5Var != null) {
            return po5Var;
        }
        po5 r = r();
        this.b = r;
        return r;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return qye.c(this);
    }

    public po5 r() {
        Object[] array = toArray(jo5.a);
        no5 no5Var = po5.b;
        return po5.o(array.length, array);
    }
}
