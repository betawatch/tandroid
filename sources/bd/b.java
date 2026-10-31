package bd;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class b implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public b(Object[] array) {
        this.a = 1;
        kotlin.jvm.internal.i.e(array, "array");
        this.c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((e) this.c).l()) {
                }
                break;
            case 1:
                if (this.b < ((Object[]) this.c).length) {
                }
                break;
            default:
                if (this.b < ((wc.b) this.c).a) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                e eVar = (e) this.c;
                int i10 = this.b;
                this.b = i10 + 1;
                return eVar.get(i10);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.c;
                    int i11 = this.b;
                    this.b = i11 + 1;
                    return objArr[i11];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                wc.b bVar = (wc.b) this.c;
                String[] strArr = bVar.c;
                int i12 = this.b;
                String str = strArr[i12];
                String str2 = bVar.b[i12];
                if (str == null) {
                    str = "";
                }
                wc.a aVar = new wc.a();
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
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                wc.b bVar = (wc.b) this.c;
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
        }
    }

    public b(e eVar) {
        this.a = 0;
        this.c = eVar;
    }

    public b(wc.b bVar) {
        this.a = 2;
        this.c = bVar;
        this.b = 0;
    }
}
