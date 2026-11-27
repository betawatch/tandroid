// default package

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class nse extends fje implements p0f, RandomAccess {
    public static final nse d;
    public int[] b;
    public int c;

    static {
        nse nseVar = new nse(new int[0], 0);
        d = nseVar;
        nseVar.a = false;
    }

    public nse(int[] iArr, int i) {
        this.b = iArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        h();
        if (i < 0 || i > (i2 = this.c)) {
            su3.g(k(i));
            return;
        }
        int[] iArr = this.b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[qu6.y(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.b, i, iArr2, i + 1, this.c - i);
            this.b = iArr2;
        }
        this.b[i] = intValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // fje, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        h();
        Charset charset = xse.a;
        collection.getClass();
        if (!(collection instanceof nse)) {
            return super.addAll(collection);
        }
        nse nseVar = (nse) collection;
        int i = nseVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.b;
        if (i3 > iArr.length) {
            iArr = Arrays.copyOf(iArr, i3);
            this.b = iArr;
        }
        System.arraycopy(nseVar.b, 0, iArr, this.c, nseVar.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // fje, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nse)) {
            return super.equals(obj);
        }
        nse nseVar = (nse) obj;
        if (this.c != nseVar.c) {
            return false;
        }
        int[] iArr = nseVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        j(i);
        return Integer.valueOf(this.b[i]);
    }

    @Override // fje, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    public final void i(int i) {
        h();
        int i2 = this.c;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[qu6.y(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.b = iArr2;
            iArr = iArr2;
        }
        int i3 = this.c;
        this.c = i3 + 1;
        iArr[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void j(int i) {
        if (i < 0 || i >= this.c) {
            su3.g(k(i));
        }
    }

    public final String k(int i) {
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // fje, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        h();
        j(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        if (i < this.c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        h();
        if (i2 < i) {
            su3.g("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.b;
        System.arraycopy(iArr, i2, iArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        h();
        j(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // bue
    public final /* synthetic */ bue zza(int i) {
        if (i >= this.c) {
            return new nse(Arrays.copyOf(this.b, i), this.c);
        }
        iy8.d();
        return null;
    }

    @Override // fje, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
