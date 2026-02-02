package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class LongSparseArray implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ long[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public LongSparseArray() {
        this(0, 1, null);
    }

    public LongSparseArray(int i) {
        if (i == 0) {
            this.keys = ContainerHelpersKt.EMPTY_LONGS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i);
            this.keys = new long[idealLongArraySize];
            this.values = new Object[idealLongArraySize];
        }
    }

    public /* synthetic */ LongSparseArray(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    public LongSparseArray clone() {
        Object clone = super.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray longSparseArray = (LongSparseArray) clone;
        longSparseArray.keys = (long[]) this.keys.clone();
        longSparseArray.values = (Object[]) this.values.clone();
        return longSparseArray;
    }

    public Object get(long j) {
        Object obj;
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        if (binarySearch >= 0) {
            Object obj2 = this.values[binarySearch];
            obj = LongSparseArrayKt.DELETED;
            if (obj2 != obj) {
                return this.values[binarySearch];
            }
        }
        return null;
    }

    public Object get(long j, Object obj) {
        Object obj2;
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        if (binarySearch < 0) {
            return obj;
        }
        Object obj3 = this.values[binarySearch];
        obj2 = LongSparseArrayKt.DELETED;
        return obj3 == obj2 ? obj : this.values[binarySearch];
    }

    public void delete(long j) {
        Object obj;
        Object obj2;
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        if (binarySearch >= 0) {
            Object obj3 = this.values[binarySearch];
            obj = LongSparseArrayKt.DELETED;
            if (obj3 != obj) {
                Object[] objArr = this.values;
                obj2 = LongSparseArrayKt.DELETED;
                objArr[binarySearch] = obj2;
                this.garbage = true;
            }
        }
    }

    public void remove(long j) {
        Object obj;
        Object obj2;
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        if (binarySearch >= 0) {
            Object obj3 = this.values[binarySearch];
            obj = LongSparseArrayKt.DELETED;
            if (obj3 != obj) {
                Object[] objArr = this.values;
                obj2 = LongSparseArrayKt.DELETED;
                objArr[binarySearch] = obj2;
                this.garbage = true;
            }
        }
    }

    public void removeAt(int i) {
        Object obj;
        Object obj2;
        Object obj3 = this.values[i];
        obj = LongSparseArrayKt.DELETED;
        if (obj3 != obj) {
            Object[] objArr = this.values;
            obj2 = LongSparseArrayKt.DELETED;
            objArr[i] = obj2;
            this.garbage = true;
        }
    }

    public void put(long j, Object obj) {
        Object obj2;
        Object obj3;
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        if (binarySearch >= 0) {
            this.values[binarySearch] = obj;
            return;
        }
        int i = ~binarySearch;
        if (i < this.size) {
            Object obj4 = this.values[i];
            obj3 = LongSparseArrayKt.DELETED;
            if (obj4 == obj3) {
                this.keys[i] = j;
                this.values[i] = obj;
                return;
            }
        }
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            if (i2 >= jArr.length) {
                Object[] objArr = this.values;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj5 = objArr[i4];
                    obj2 = LongSparseArrayKt.DELETED;
                    if (obj5 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj5;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.garbage = false;
                this.size = i3;
                i = ~ContainerHelpersKt.binarySearch(this.keys, i3, j);
            }
        }
        int i5 = this.size;
        if (i5 >= this.keys.length) {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i5 + 1);
            long[] copyOf = Arrays.copyOf(this.keys, idealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        int i6 = this.size;
        if (i6 - i != 0) {
            long[] jArr2 = this.keys;
            int i7 = i + 1;
            ArraysKt.copyInto(jArr2, jArr2, i7, i, i6);
            Object[] objArr2 = this.values;
            ArraysKt.copyInto(objArr2, objArr2, i7, i, this.size);
        }
        this.keys[i] = j;
        this.values[i] = obj;
        this.size++;
    }

    public int size() {
        Object obj;
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj2 = objArr[i3];
                obj = LongSparseArrayKt.DELETED;
                if (obj2 != obj) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj2;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        return this.size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i) {
        int i2;
        Object obj;
        if (i < 0 || i >= (i2 = this.size)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj2 = objArr[i4];
                obj = LongSparseArrayKt.DELETED;
                if (obj2 != obj) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj2;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.garbage = false;
            this.size = i3;
        }
        return this.keys[i];
    }

    public Object valueAt(int i) {
        int i2;
        Object obj;
        if (i < 0 || i >= (i2 = this.size)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj2 = objArr[i4];
                obj = LongSparseArrayKt.DELETED;
                if (obj2 != obj) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj2;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.garbage = false;
            this.size = i3;
        }
        return this.values[i];
    }

    public int indexOfKey(long j) {
        Object obj;
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj2 = objArr[i3];
                obj = LongSparseArrayKt.DELETED;
                if (obj2 != obj) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj2;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, j);
    }

    public boolean containsKey(long j) {
        return indexOfKey(j) >= 0;
    }

    public void clear() {
        int i = this.size;
        Object[] objArr = this.values;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public void append(long j, Object obj) {
        Object obj2;
        int i = this.size;
        if (i != 0 && j <= this.keys[i - 1]) {
            put(j, obj);
            return;
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            if (i >= jArr.length) {
                Object[] objArr = this.values;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj3 = objArr[i3];
                    obj2 = LongSparseArrayKt.DELETED;
                    if (obj3 != obj2) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj3;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.garbage = false;
                this.size = i2;
            }
        }
        int i4 = this.size;
        if (i4 >= this.keys.length) {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i4 + 1);
            long[] copyOf = Arrays.copyOf(this.keys, idealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        this.keys[i4] = j;
        this.values[i4] = obj;
        this.size = i4 + 1;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i2));
            sb.append('=');
            Object valueAt = valueAt(i2);
            if (valueAt != sb) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
