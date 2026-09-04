package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public class t6 extends c implements Consumer, Iterable {
    public Object[] e = new Object[1 << 4];
    public Object[][] f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public final void i(long j3) {
        long length;
        int i10 = this.c;
        if (i10 == 0) {
            length = this.e.length;
        } else {
            length = this.d[i10] + this.f[i10].length;
        }
        if (j3 > length) {
            if (this.f == null) {
                Object[][] objArr = new Object[8][];
                this.f = objArr;
                this.d = new long[8];
                objArr[0] = this.e;
            }
            int i11 = i10 + 1;
            while (j3 > length) {
                Object[][] objArr2 = this.f;
                if (i11 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.d = Arrays.copyOf(this.d, length2);
                }
                int i12 = this.a;
                if (i11 != 0 && i11 != 1) {
                    i12 = Math.min((i12 + i11) - 1, 30);
                }
                int i13 = 1 << i12;
                this.f[i11] = new Object[i13];
                long[] jArr = this.d;
                jArr[i11] = jArr[i11 - 1] + r5[r7].length;
                length += i13;
                i11++;
            }
        }
    }

    @Override // j$.util.stream.c
    public final void clear() {
        Object[][] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            int i10 = 0;
            while (true) {
                Object[] objArr2 = this.e;
                if (i10 >= objArr2.length) {
                    break;
                }
                objArr2[i10] = null;
                i10++;
            }
            this.f = null;
            this.d = null;
        } else {
            for (int i11 = 0; i11 < this.b; i11++) {
                this.e[i11] = null;
            }
        }
        this.b = 0;
        this.c = 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.f1(spliterator);
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.c; i10++) {
            for (Object obj : this.f[i10]) {
                consumer.x(obj);
            }
        }
        for (int i11 = 0; i11 < this.b; i11++) {
            consumer.x(this.e[i11]);
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void x(Object obj) {
        long length;
        int i10 = this.b;
        Object[] objArr = this.e;
        if (i10 == objArr.length) {
            if (this.f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f = objArr2;
                this.d = new long[8];
                objArr2[0] = objArr;
            }
            int i11 = this.c;
            int i12 = i11 + 1;
            Object[][] objArr3 = this.f;
            if (i12 >= objArr3.length || objArr3[i12] == null) {
                if (i11 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i11].length + this.d[i11];
                }
                i(length + 1);
            }
            this.b = 0;
            int i13 = this.c + 1;
            this.c = i13;
            this.e = this.f[i13];
        }
        Object[] objArr4 = this.e;
        int i14 = this.b;
        this.b = i14 + 1;
        objArr4[i14] = obj;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new j$.time.t(10, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }

    @Override // java.lang.Iterable
    public j$.util.Spliterator spliterator() {
        return new k6(this, 0, this.c, 0, this.b);
    }
}
