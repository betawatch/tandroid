package cd;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;
import n6.l;
import x8.e;
import y8.k;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class b implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public b(e eVar) {
        this.a = 3;
        this.c = eVar;
        this.b = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((c) this.c).a) {
                }
                break;
            case 1:
                if (this.b < ((hd.c) this.c).i()) {
                }
                break;
            case 2:
                if (this.b < ((Object[]) this.c).length) {
                }
                break;
            default:
                e eVar = (e) this.c;
                int i10 = this.b;
                eVar.o();
                if (i10 < eVar.c.size() - 1) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int intValue;
        int intValue2;
        switch (this.a) {
            case 0:
                c cVar = (c) this.c;
                String[] strArr = cVar.c;
                int i10 = this.b;
                String str = strArr[i10];
                String str2 = cVar.b[i10];
                if (str == null) {
                    str = "";
                }
                a aVar = new a();
                if (str2 == null) {
                    throw new IllegalArgumentException("Object must not be null");
                }
                aVar.a = str2.trim();
                if (str2.length() == 0) {
                    throw new IllegalArgumentException("String must not be empty");
                }
                aVar.b = str;
                aVar.c = cVar;
                this.b++;
                return aVar;
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                hd.c cVar2 = (hd.c) this.c;
                int i11 = this.b;
                this.b = i11 + 1;
                return cVar2.get(i11);
            case 2:
                try {
                    Object[] objArr = (Object[]) this.c;
                    int i12 = this.b;
                    this.b = i12 + 1;
                    return objArr[i12];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException(hc.b.j(this.b, "Cannot advance the iterator beyond "));
                }
                e eVar = (e) this.c;
                int i13 = this.b;
                int i14 = i13 + 1;
                this.b = i14;
                DataHolder dataHolder = eVar.a;
                eVar.o();
                int n10 = eVar.n(i14);
                int i15 = 0;
                if (i14 >= 0 && i14 != eVar.c.size()) {
                    if (i14 == eVar.c.size() - 1) {
                        l.h(dataHolder);
                        intValue = dataHolder.n;
                        intValue2 = ((Integer) eVar.c.get(i14)).intValue();
                    } else {
                        intValue = ((Integer) eVar.c.get(i13 + 2)).intValue();
                        intValue2 = ((Integer) eVar.c.get(i14)).intValue();
                    }
                    i15 = intValue - intValue2;
                    if (i15 == 1) {
                        int n11 = eVar.n(i14);
                        l.h(dataHolder);
                        dataHolder.b(n11);
                        i15 = 1;
                    }
                }
                return new k(dataHolder, n10, i15, 0);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                c cVar = (c) this.c;
                int i10 = this.b;
                int i11 = i10 - 1;
                this.b = i11;
                int i12 = cVar.a;
                if (i11 >= i12) {
                    throw new IllegalArgumentException("Must be false");
                }
                int i13 = (i12 - i11) - 1;
                if (i13 > 0) {
                    String[] strArr = cVar.b;
                    System.arraycopy(strArr, i10, strArr, i11, i13);
                    String[] strArr2 = cVar.c;
                    System.arraycopy(strArr2, i10, strArr2, i11, i13);
                }
                int i14 = cVar.a - 1;
                cVar.a = i14;
                cVar.b[i14] = null;
                cVar.c[i14] = null;
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
        }
    }

    public b(Object[] array) {
        this.a = 2;
        i.e(array, "array");
        this.c = array;
    }

    public b(hd.c cVar) {
        this.a = 1;
        this.c = cVar;
    }

    public b(c cVar) {
        this.a = 0;
        this.c = cVar;
        this.b = 0;
    }
}
