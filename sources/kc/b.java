package kc;

import com.google.android.gms.common.data.DataHolder;
import h8.e;
import i8.k;
import j3.r0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
                if (this.b < ((Object[]) this.c).length) {
                }
                break;
            case 2:
                if (this.b < ((pc.c) this.c).i()) {
                }
                break;
            default:
                e eVar = (e) this.c;
                int i9 = this.b;
                eVar.o();
                if (i9 < eVar.c.size() - 1) {
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
                int i9 = this.b;
                String str = strArr[i9];
                String str2 = cVar.b[i9];
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
                try {
                    Object[] objArr = (Object[]) this.c;
                    int i10 = this.b;
                    this.b = i10 + 1;
                    return objArr[i10];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
            case 2:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                pc.c cVar2 = (pc.c) this.c;
                int i11 = this.b;
                this.b = i11 + 1;
                return cVar2.get(i11);
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException(r0.l(this.b, "Cannot advance the iterator beyond "));
                }
                e eVar = (e) this.c;
                int i12 = this.b;
                int i13 = i12 + 1;
                this.b = i13;
                DataHolder dataHolder = eVar.a;
                eVar.o();
                int n10 = eVar.n(i13);
                int i14 = 0;
                if (i13 >= 0 && i13 != eVar.c.size()) {
                    if (i13 == eVar.c.size() - 1) {
                        l.h(dataHolder);
                        intValue = dataHolder.n;
                        intValue2 = ((Integer) eVar.c.get(i13)).intValue();
                    } else {
                        intValue = ((Integer) eVar.c.get(i12 + 2)).intValue();
                        intValue2 = ((Integer) eVar.c.get(i13)).intValue();
                    }
                    i14 = intValue - intValue2;
                    if (i14 == 1) {
                        int n11 = eVar.n(i13);
                        l.h(dataHolder);
                        dataHolder.b(n11);
                        i14 = 1;
                    }
                }
                return new k(dataHolder, n10, i14, 0);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                c cVar = (c) this.c;
                int i9 = this.b;
                int i10 = i9 - 1;
                this.b = i10;
                int i11 = cVar.a;
                if (i10 >= i11) {
                    throw new IllegalArgumentException("Must be false");
                }
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    String[] strArr = cVar.b;
                    System.arraycopy(strArr, i9, strArr, i10, i12);
                    String[] strArr2 = cVar.c;
                    System.arraycopy(strArr2, i9, strArr2, i10, i12);
                }
                int i13 = cVar.a - 1;
                cVar.a = i13;
                cVar.b[i13] = null;
                cVar.c[i13] = null;
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
        this.a = 1;
        i.e(array, "array");
        this.c = array;
    }

    public b(pc.c cVar) {
        this.a = 2;
        this.c = cVar;
    }

    public b(c cVar) {
        this.a = 0;
        this.c = cVar;
        this.b = 0;
    }
}
