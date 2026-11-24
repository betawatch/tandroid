package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public class y6 extends c implements Consumer, Iterable {
    public Object[] e = new Object[1 << 4];
    public Object[][] f;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long length;
        int i = this.b;
        Object[] objArr = this.e;
        if (i == objArr.length) {
            Object[][] objArr2 = this.f;
            if (objArr2 == null) {
                Object[][] objArr3 = new Object[8][];
                this.f = objArr3;
                this.d = new long[8];
                objArr3[0] = objArr;
                objArr2 = objArr3;
            }
            int i2 = this.c;
            int i3 = i2 + 1;
            if (i3 >= objArr2.length || objArr2[i3] == null) {
                if (i2 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr2[i2].length + this.d[i2];
                }
                i(length + 1);
            }
            this.b = 0;
            int i4 = this.c + 1;
            this.c = i4;
            objArr = this.f[i4];
            this.e = objArr;
            i = 0;
        }
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.c
    public final void clear() {
        Object[][] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.e;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.f = null;
            this.d = null;
        } else {
            for (int i2 = 0; i2 < this.b; i2++) {
                this.e[i2] = null;
            }
        }
        this.b = 0;
        this.c = 0;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.c; i++) {
            for (Object obj : this.f[i]) {
                consumer.accept(obj);
            }
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            consumer.accept(this.e[i2]);
        }
    }

    public final void i(long j) {
        int i = this.c;
        long length = i == 0 ? this.e.length : this.d[i] + this.f[i].length;
        if (j > length) {
            if (this.f == null) {
                Object[][] objArr = new Object[8][];
                this.f = objArr;
                this.d = new long[8];
                objArr[0] = this.e;
            }
            int i2 = i + 1;
            while (j > length) {
                Object[][] objArr2 = this.f;
                if (i2 >= objArr2.length) {
                    int length2 = objArr2.length << 1;
                    this.f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.d = Arrays.copyOf(this.d, length2);
                }
                int i3 = this.a;
                if (i2 != 0 && i2 != 1) {
                    i3 = Math.min((i3 + i2) - 1, 30);
                }
                int i4 = 1 << i3;
                this.f[i2] = new Object[i4];
                long[] jArr = this.d;
                jArr[i2] = jArr[i2 - 1] + r5[r7].length;
                length += i4;
                i2++;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.f1(spliterator);
    }

    public Spliterator spliterator() {
        return new p6(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        final ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new Consumer() { // from class: j$.util.stream.o6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((ArrayList) arrayList).add(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$-CC.$default$andThen(this, consumer);
            }
        });
        return "SpinedBuffer:" + arrayList.toString();
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }
}
