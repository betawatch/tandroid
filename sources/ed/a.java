package ed;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class a implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public a(Object[] array) {
        this.a = 1;
        kotlin.jvm.internal.j.e(array, "array");
        this.c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((d) this.c).h()) {
                }
                break;
            case 1:
                if (this.b < ((Object[]) this.c).length) {
                }
                break;
            default:
                if (this.b < ((zc.b) this.c).a) {
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
                d dVar = (d) this.c;
                int i3 = this.b;
                this.b = i3 + 1;
                return dVar.get(i3);
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
            default:
                zc.b bVar = (zc.b) this.c;
                String[] strArr = bVar.c;
                int i11 = this.b;
                String str = strArr[i11];
                String str2 = bVar.b[i11];
                if (str == null) {
                    str = "";
                }
                zc.a aVar = new zc.a();
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
                zc.b bVar = (zc.b) this.c;
                int i3 = this.b;
                int i10 = i3 - 1;
                this.b = i10;
                int i11 = bVar.a;
                if (i10 >= i11) {
                    throw new IllegalArgumentException("Must be false");
                }
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    String[] strArr = bVar.b;
                    System.arraycopy(strArr, i3, strArr, i10, i12);
                    String[] strArr2 = bVar.c;
                    System.arraycopy(strArr2, i3, strArr2, i10, i12);
                }
                int i13 = bVar.a - 1;
                bVar.a = i13;
                bVar.b[i13] = null;
                bVar.c[i13] = null;
                return;
        }
    }

    public a(d dVar) {
        this.a = 0;
        this.c = dVar;
    }

    public a(zc.b bVar) {
        this.a = 2;
        this.c = bVar;
        this.b = 0;
    }
}
