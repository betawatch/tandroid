// default package

import j$.lang.Iterable$-CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class b4d extends AbstractCollection implements Serializable, Collection {
    public static final Object[] b = new Object[0];
    public static final Object[] c = new Object[0];
    public static final Object[] d = new Object[0];
    public static final Object[] e = new Object[0];
    public static final Object[] f = new Object[0];
    public static final Object[] h = new Object[0];
    public final /* synthetic */ byte a;

    public /* synthetic */ b4d(byte b2) {
        this.a = b2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public final /* synthetic */ void forEach(Consumer consumer) {
        byte b2 = this.a;
        Iterable$-CC.$default$forEach(this, consumer);
    }

    public abstract int h(Object[] objArr);

    public int i() {
        return 0;
    }

    public int j() {
        return 0;
    }

    public abstract Object[] k();

    public abstract int l(Object[] objArr);

    public abstract int m();

    public int n() {
        return 0;
    }

    public abstract Object[] o();

    public int p(Object[] objArr) {
        v9c u = u();
        int i = 0;
        while (u.hasNext()) {
            objArr[i] = u.next();
            i++;
        }
        return i;
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        byte b2 = this.a;
        return Stream.Wrapper.convert(parallelStream());
    }

    public int q() {
        switch (this.a) {
            case 2:
                throw new UnsupportedOperationException();
            case 3:
            default:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
        }
    }

    public Object[] r() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        byte b2 = this.a;
        return Collection.-CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int s() {
        switch (this.a) {
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        switch (this.a) {
        }
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        byte b2 = this.a;
        return Stream.Wrapper.convert(stream());
    }

    public int t() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                objArr.getClass();
                int size = size();
                int length = objArr.length;
                if (length < size) {
                    Object[] k = k();
                    if (k != null) {
                        break;
                    } else {
                        if (length != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size);
                    }
                } else if (length > size) {
                    objArr[size] = null;
                }
                h(objArr);
                break;
            case 1:
                objArr.getClass();
                int size2 = size();
                int length2 = objArr.length;
                if (length2 < size2) {
                    Object[] o = o();
                    if (o != null) {
                        break;
                    } else {
                        if (length2 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size2);
                    }
                } else if (length2 > size2) {
                    objArr[size2] = null;
                }
                l(objArr);
                break;
            case 2:
                objArr.getClass();
                int size3 = size();
                int length3 = objArr.length;
                if (length3 < size3) {
                    Object[] v = v();
                    if (v != null) {
                        break;
                    } else {
                        if (length3 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size3);
                    }
                } else if (length3 > size3) {
                    objArr[size3] = null;
                }
                p(objArr);
                break;
            case 3:
                objArr.getClass();
                int size4 = size();
                int length4 = objArr.length;
                if (length4 < size4) {
                    Object[] r = r();
                    if (r != null) {
                        break;
                    } else {
                        if (length4 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size4);
                    }
                } else if (length4 > size4) {
                    objArr[size4] = null;
                }
                w(objArr);
                break;
            case 4:
                objArr.getClass();
                int size5 = size();
                int length5 = objArr.length;
                if (length5 < size5) {
                    Object[] v2 = v();
                    if (v2 != null) {
                        break;
                    } else {
                        if (length5 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size5);
                    }
                } else if (length5 > size5) {
                    objArr[size5] = null;
                }
                p(objArr);
                break;
            default:
                objArr.getClass();
                int size6 = size();
                int length6 = objArr.length;
                if (length6 < size6) {
                    Object[] x = x();
                    if (x != null) {
                        break;
                    } else {
                        if (length6 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size6);
                    }
                } else if (length6 > size6) {
                    objArr[size6] = null;
                }
                p(objArr);
                break;
        }
        return objArr;
    }

    public abstract v9c u();

    public Object[] v() {
        byte b2 = this.a;
        return null;
    }

    public abstract int w(Object[] objArr);

    public Object[] x() {
        return null;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        byte b2 = this.a;
        return Collection.-CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream stream() {
        byte b2 = this.a;
        return Collection.-CC.$default$stream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        byte b2 = this.a;
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
            case 0:
                return toArray(b);
            case 1:
                return toArray(c);
            case 2:
                return toArray(d);
            case 3:
                return toArray(e);
            case 4:
                return toArray(f);
            default:
                return toArray(h);
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        byte b2 = this.a;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }
}
