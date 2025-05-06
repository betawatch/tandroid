package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.stream.Stream;
import j$.util.stream.u0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class h extends b implements Set, j$.util.Set {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ConcurrentHashMap concurrentHashMap, int i) {
        super(concurrentHashMap);
        this.b = i;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map.Entry entry = (Map.Entry) obj;
                return this.a.g(entry.getKey(), entry.getValue(), false) == null;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Iterator it = collection.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (this.a.g(entry.getKey(), entry.getValue(), false) == null) {
                        z = true;
                    }
                }
                return z;
        }
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        switch (this.b) {
            case 0:
                return this.a.containsKey(obj);
            default:
                return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.a.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        Set set2;
        switch (this.b) {
            case 0:
                if (!(obj instanceof Set) || ((set = (Set) obj) != this && (!containsAll(set) || !set.containsAll(this)))) {
                }
                break;
            default:
                if (!(obj instanceof Set) || ((set2 = (Set) obj) != this && (!containsAll(set2) || !set2.containsAll(this)))) {
                }
                break;
        }
        return false;
    }

    @Override // j$.util.Collection
    public final void forEach(Consumer consumer) {
        switch (this.b) {
            case 0:
                consumer.getClass();
                k[] kVarArr = this.a.a;
                if (kVarArr != null) {
                    o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
                    while (true) {
                        k b = oVar.b();
                        if (b == null) {
                            break;
                        } else {
                            consumer.r(b.b);
                        }
                    }
                }
                break;
            default:
                consumer.getClass();
                k[] kVarArr2 = this.a.a;
                if (kVarArr2 != null) {
                    o oVar2 = new o(kVarArr2, kVarArr2.length, 0, kVarArr2.length);
                    while (true) {
                        k b2 = oVar2.b();
                        if (b2 == null) {
                            break;
                        } else {
                            consumer.r(new j(b2.b, b2.c, this.a));
                        }
                    }
                }
                break;
        }
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        switch (this.b) {
            case 0:
                forEach(Consumer.VivifiedWrapper.convert(consumer));
                break;
            default:
                forEach(Consumer.VivifiedWrapper.convert(consumer));
                break;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        switch (this.b) {
            case 0:
                Object it = iterator();
                int i = 0;
                while (((a) it).hasNext()) {
                    i += ((g) it).next().hashCode();
                }
                return i;
            default:
                k[] kVarArr = this.a.a;
                int i2 = 0;
                if (kVarArr != null) {
                    o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
                    while (true) {
                        k b = oVar.b();
                        if (b != null) {
                            i2 += b.hashCode();
                        }
                    }
                }
                return i2;
        }
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.b) {
            case 0:
                ConcurrentHashMap concurrentHashMap = this.a;
                k[] kVarArr = concurrentHashMap.a;
                int length = kVarArr == null ? 0 : kVarArr.length;
                return new g(kVarArr, length, length, concurrentHashMap, 0);
            default:
                ConcurrentHashMap concurrentHashMap2 = this.a;
                k[] kVarArr2 = concurrentHashMap2.a;
                int length2 = kVarArr2 == null ? 0 : kVarArr2.length;
                return new d(kVarArr2, length2, length2, concurrentHashMap2);
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        Stream e0;
        Stream e02;
        switch (this.b) {
            case 0:
                e0 = u0.e0(Collection.-EL.b(this), true);
                return e0;
            default:
                e02 = u0.e0(Collection.-EL.b(this), true);
                return e02;
        }
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        Stream e0;
        Stream e02;
        switch (this.b) {
            case 0:
                e0 = u0.e0(Collection.-EL.b(this), true);
                return Stream.Wrapper.convert(e0);
            default:
                e02 = u0.e0(Collection.-EL.b(this), true);
                return Stream.Wrapper.convert(e02);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        switch (this.b) {
            case 0:
                if (this.a.remove(obj) != null) {
                }
                break;
            default:
                if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null || !this.a.remove(key, value)) {
                }
                break;
        }
        return false;
    }

    @Override // j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        switch (this.b) {
        }
        return Collection.-CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        int i = this.b;
        Predicate convert = Predicate.VivifiedWrapper.convert(predicate);
        switch (i) {
        }
        return Collection.-CC.$default$removeIf(this, convert);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection
    public final Spliterator spliterator() {
        switch (this.b) {
            case 0:
                ConcurrentHashMap concurrentHashMap = this.a;
                long k = concurrentHashMap.k();
                k[] kVarArr = concurrentHashMap.a;
                int length = kVarArr == null ? 0 : kVarArr.length;
                return new i(kVarArr, length, 0, length, k < 0 ? 0L : k, 0);
            default:
                ConcurrentHashMap concurrentHashMap2 = this.a;
                long k2 = concurrentHashMap2.k();
                k[] kVarArr2 = concurrentHashMap2.a;
                int length2 = kVarArr2 == null ? 0 : kVarArr2.length;
                return new e(kVarArr2, length2, 0, length2, k2 < 0 ? 0L : k2, concurrentHashMap2);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Spliterator spliterator() {
        switch (this.b) {
        }
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        switch (this.b) {
        }
        return Collection.-CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        switch (this.b) {
        }
        return Stream.Wrapper.convert(Collection.-CC.$default$stream(this));
    }

    @Override // j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        Object[] array2;
        switch (this.b) {
            case 0:
                array = toArray((Object[]) intFunction.apply(0));
                return array;
            default:
                array2 = toArray((Object[]) intFunction.apply(0));
                return array2;
        }
    }

    @Override // java.util.Collection
    public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
        Object[] array;
        Object[] array2;
        int i = this.b;
        IntFunction convert = IntFunction.VivifiedWrapper.convert(intFunction);
        switch (i) {
            case 0:
                array = toArray((Object[]) convert.apply(0));
                return array;
            default:
                array2 = toArray((Object[]) convert.apply(0));
                return array2;
        }
    }
}
