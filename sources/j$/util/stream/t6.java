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

    public final void i(long j10) {
        long length;
        int i9 = this.c;
        if (i9 == 0) {
            length = this.e.length;
        } else {
            length = this.d[i9] + this.f[i9].length;
        }
        if (j10 > length) {
            if (this.f == null) {
                Object[][] objArr = new Object[8][];
                this.f = objArr;
                this.d = new long[8];
                objArr[0] = this.e;
            }
            int i10 = i9 + 1;
            while (j10 > length) {
                Object[][] objArr2 = this.f;
                if (i10 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.d = Arrays.copyOf(this.d, length2);
                }
                int i11 = this.a;
                if (i10 != 0 && i10 != 1) {
                    i11 = Math.min((i11 + i10) - 1, 30);
                }
                int i12 = 1 << i11;
                this.f[i10] = new Object[i12];
                long[] jArr = this.d;
                jArr[i10] = jArr[i10 - 1] + r5[r7].length;
                length += i12;
                i10++;
            }
        }
    }

    @Override // j$.util.stream.c
    public final void clear() {
        Object[][] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            int i9 = 0;
            while (true) {
                Object[] objArr2 = this.e;
                if (i9 >= objArr2.length) {
                    break;
                }
                objArr2[i9] = null;
                i9++;
            }
            this.f = null;
            this.d = null;
        } else {
            for (int i10 = 0; i10 < this.b; i10++) {
                this.e[i10] = null;
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
        for (int i9 = 0; i9 < this.c; i9++) {
            for (Object obj : this.f[i9]) {
                consumer.x(obj);
            }
        }
        for (int i10 = 0; i10 < this.b; i10++) {
            consumer.x(this.e[i10]);
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void x(Object obj) {
        long length;
        int i9 = this.b;
        Object[] objArr = this.e;
        if (i9 == objArr.length) {
            if (this.f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f = objArr2;
                this.d = new long[8];
                objArr2[0] = objArr;
            }
            int i10 = this.c;
            int i11 = i10 + 1;
            Object[][] objArr3 = this.f;
            if (i11 >= objArr3.length || objArr3[i11] == null) {
                if (i10 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i10].length + this.d[i10];
                }
                i(length + 1);
            }
            this.b = 0;
            int i12 = this.c + 1;
            this.c = i12;
            this.e = this.f[i12];
        }
        Object[] objArr4 = this.e;
        int i13 = this.b;
        this.b = i13 + 1;
        objArr4[i13] = obj;
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
