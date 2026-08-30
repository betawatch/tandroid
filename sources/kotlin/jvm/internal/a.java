package kotlin.jvm.internal;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kh.a2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class a implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public a(l8.e eVar) {
        this.a = 3;
        this.c = eVar;
        this.b = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((Object[]) this.c).length) {
                }
                break;
            case 1:
                if (this.b < ((oc.b) this.c).a) {
                }
                break;
            case 2:
                if (this.b < ((tc.c) this.c).i()) {
                }
                break;
            default:
                l8.e eVar = (l8.e) this.c;
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
                try {
                    Object[] objArr = (Object[]) this.c;
                    int i10 = this.b;
                    this.b = i10 + 1;
                    return objArr[i10];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 1:
                oc.b bVar = (oc.b) this.c;
                String[] strArr = bVar.c;
                int i11 = this.b;
                String str = strArr[i11];
                String str2 = bVar.b[i11];
                if (str == null) {
                    str = "";
                }
                oc.a aVar = new oc.a();
                if (str2 == null) {
                    throw new IllegalArgumentException("Object must not be null");
                }
                aVar.a = str2.trim();
                if (str2.length() == 0) {
                    throw new IllegalArgumentException("String must not be empty");
                }
                aVar.b = str;
                aVar.c = bVar;
                this.b++;
                return aVar;
            case 2:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                tc.c cVar = (tc.c) this.c;
                int i12 = this.b;
                this.b = i12 + 1;
                return cVar.get(i12);
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException(a2.j(this.b, "Cannot advance the iterator beyond "));
                }
                l8.e eVar = (l8.e) this.c;
                int i13 = this.b;
                int i14 = i13 + 1;
                this.b = i14;
                DataHolder dataHolder = eVar.a;
                eVar.o();
                int n10 = eVar.n(i14);
                int i15 = 0;
                if (i14 >= 0 && i14 != eVar.c.size()) {
                    if (i14 == eVar.c.size() - 1) {
                        b6.m.h(dataHolder);
                        intValue = dataHolder.n;
                        intValue2 = ((Integer) eVar.c.get(i14)).intValue();
                    } else {
                        intValue = ((Integer) eVar.c.get(i13 + 2)).intValue();
                        intValue2 = ((Integer) eVar.c.get(i14)).intValue();
                    }
                    i15 = intValue - intValue2;
                    if (i15 == 1) {
                        int n11 = eVar.n(i14);
                        b6.m.h(dataHolder);
                        dataHolder.e(n11);
                        i15 = 1;
                    }
                }
                return new m8.k(dataHolder, n10, i15, 0);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                oc.b bVar = (oc.b) this.c;
                int i10 = this.b;
                int i11 = i10 - 1;
                this.b = i11;
                int i12 = bVar.a;
                if (i11 >= i12) {
                    throw new IllegalArgumentException("Must be false");
                }
                int i13 = (i12 - i11) - 1;
                if (i13 > 0) {
                    String[] strArr = bVar.b;
                    System.arraycopy(strArr, i10, strArr, i11, i13);
                    String[] strArr2 = bVar.c;
                    System.arraycopy(strArr2, i10, strArr2, i11, i13);
                }
                int i14 = bVar.a - 1;
                bVar.a = i14;
                bVar.b[i14] = null;
                bVar.c[i14] = null;
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
        }
    }

    public a(Object[] array) {
        this.a = 0;
        j.e(array, "array");
        this.c = array;
    }

    public a(tc.c cVar) {
        this.a = 2;
        this.c = cVar;
    }

    public a(oc.b bVar) {
        this.a = 1;
        this.c = bVar;
        this.b = 0;
    }
}
