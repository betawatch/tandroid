package cd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class b implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public b(Object[] array) {
        this.a = 2;
        j.e(array, "array");
        this.c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((c) this.c).a) {
                }
                break;
            case 1:
                if (this.b < ((hd.c) this.c).f()) {
                }
                break;
            default:
                if (this.b < ((Object[]) this.c).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                c cVar = (c) this.c;
                String[] strArr = cVar.c;
                int i7 = this.b;
                String str = strArr[i7];
                String str2 = cVar.b[i7];
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
                int i10 = this.b;
                this.b = i10 + 1;
                return cVar2.get(i10);
            default:
                try {
                    Object[] objArr = (Object[]) this.c;
                    int i11 = this.b;
                    this.b = i11 + 1;
                    return objArr[i11];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                c cVar = (c) this.c;
                int i7 = this.b;
                int i10 = i7 - 1;
                this.b = i10;
                int i11 = cVar.a;
                if (i10 >= i11) {
                    throw new IllegalArgumentException("Must be false");
                }
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    String[] strArr = cVar.b;
                    System.arraycopy(strArr, i7, strArr, i10, i12);
                    String[] strArr2 = cVar.c;
                    System.arraycopy(strArr2, i7, strArr2, i10, i12);
                }
                int i13 = cVar.a - 1;
                cVar.a = i13;
                cVar.b[i13] = null;
                cVar.c[i13] = null;
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
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
