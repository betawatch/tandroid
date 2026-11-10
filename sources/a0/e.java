package a0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e implements Collection {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public e(Object[] values) {
        kotlin.jvm.internal.j.e(values, "values");
        this.b = values;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((f) this.b).clear();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                return ((f) this.b).b(obj) >= 0;
            default:
                return hd.e.a((Object[]) this.b, obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.a) {
            case 0:
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                kotlin.jvm.internal.j.e(elements, "elements");
                Collection collection = elements;
                if (!collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        if (!hd.e.a((Object[]) this.b, it2.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((f) this.b).isEmpty();
            default:
                return ((Object[]) this.b).length == 0;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new b((f) this.b, 1);
            default:
                Object[] array = (Object[]) this.b;
                kotlin.jvm.internal.j.e(array, "array");
                return new cd.b(array);
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                int b10 = fVar.b(obj);
                if (b10 < 0) {
                    return false;
                }
                fVar.g(b10);
                return true;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                int i7 = fVar.c;
                int i10 = 0;
                boolean z9 = false;
                while (i10 < i7) {
                    if (collection.contains(fVar.i(i10))) {
                        fVar.g(i10);
                        i10--;
                        i7--;
                        z9 = true;
                    }
                    i10++;
                }
                return z9;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                int i7 = fVar.c;
                int i10 = 0;
                boolean z9 = false;
                while (i10 < i7) {
                    if (!collection.contains(fVar.i(i10))) {
                        fVar.g(i10);
                        i10--;
                        i7--;
                        z9 = true;
                    }
                    i10++;
                }
                return z9;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((f) this.b).c;
            default:
                return ((Object[]) this.b).length;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                int i7 = fVar.c;
                if (array.length < i7) {
                    array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i7);
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    array[i10] = fVar.i(i10);
                }
                if (array.length > i7) {
                    array[i7] = null;
                }
                return array;
            default:
                kotlin.jvm.internal.j.e(array, "array");
                return kotlin.jvm.internal.j.j(this, array);
        }
    }

    public e(f fVar) {
        this.b = fVar;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                int i7 = fVar.c;
                Object[] objArr = new Object[i7];
                for (int i10 = 0; i10 < i7; i10++) {
                    objArr[i10] = fVar.i(i10);
                }
                return objArr;
            default:
                Object[] objArr2 = (Object[]) this.b;
                kotlin.jvm.internal.j.e(objArr2, "<this>");
                Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length, Object[].class);
                kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
                return copyOf;
        }
    }
}
