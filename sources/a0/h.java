package a0;

import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public h(int i10) {
        if (i10 == 0) {
            this.b = b0.a.b;
            this.c = b0.a.c;
            return;
        }
        int i11 = i10 * 8;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 8;
        this.b = new long[i14];
        this.c = new Object[i14];
    }

    public final void a(Long l10, long j10) {
        int i10 = this.d;
        if (i10 != 0 && j10 <= this.b[i10 - 1]) {
            k(l10, j10);
            return;
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i10 >= jArr.length) {
                Object[] objArr = this.c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != i.a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.a = false;
                this.d = i11;
            }
        }
        int i13 = this.d;
        if (i13 >= this.b.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            long[] copyOf = Arrays.copyOf(this.b, i17);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, i17);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.c = copyOf2;
        }
        this.b[i13] = j10;
        this.c[i13] = l10;
        this.d = i13 + 1;
    }

    public final void b() {
        int i10 = this.d;
        Object[] objArr = this.c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.d = 0;
        this.a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final h clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.j.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        h hVar = (h) clone;
        hVar.b = (long[]) this.b.clone();
        hVar.c = (Object[]) this.c.clone();
        return hVar;
    }

    public final boolean d(long j10) {
        return h(j10) >= 0;
    }

    public final void e(long j10) {
        int b10 = b0.a.b(this.b, this.d, j10);
        if (b10 >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[b10];
            Object obj2 = i.a;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.a = true;
            }
        }
    }

    public final Object f(long j10) {
        Object obj;
        int b10 = b0.a.b(this.b, this.d, j10);
        if (b10 < 0 || (obj = this.c[b10]) == i.a) {
            return null;
        }
        return obj;
    }

    public final Object g(Object obj, long j10) {
        Object obj2;
        int b10 = b0.a.b(this.b, this.d, j10);
        return (b10 < 0 || (obj2 = this.c[b10]) == i.a) ? obj : obj2;
    }

    public final int h(long j10) {
        if (this.a) {
            int i10 = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != i.a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.a = false;
            this.d = i11;
        }
        return b0.a.b(this.b, this.d, j10);
    }

    public final boolean i() {
        return m() == 0;
    }

    public final long j(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.d)) {
            throw new IllegalArgumentException(i0.a.k(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != i.a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.a = false;
            this.d = i12;
        }
        return this.b[i10];
    }

    public final void k(Object obj, long j10) {
        Object obj2 = i.a;
        int b10 = b0.a.b(this.b, this.d, j10);
        if (b10 >= 0) {
            this.c[b10] = obj;
            return;
        }
        int i10 = ~b10;
        int i11 = this.d;
        if (i10 < i11) {
            Object[] objArr = this.c;
            if (objArr[i10] == obj2) {
                this.b[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj3 = objArr2[i13];
                    if (obj3 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj3;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.a = false;
                this.d = i12;
                i10 = ~b0.a.b(this.b, i12, j10);
            }
        }
        int i14 = this.d;
        if (i14 >= this.b.length) {
            int i15 = (i14 + 1) * 8;
            int i16 = 4;
            while (true) {
                if (i16 >= 32) {
                    break;
                }
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
                i16++;
            }
            int i18 = i15 / 8;
            long[] copyOf = Arrays.copyOf(this.b, i18);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, i18);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.c = copyOf2;
        }
        int i19 = this.d - i10;
        if (i19 != 0) {
            long[] jArr2 = this.b;
            int i20 = i10 + 1;
            kotlin.jvm.internal.j.e(jArr2, "<this>");
            System.arraycopy(jArr2, i10, jArr2, i20, i19);
            Object[] objArr3 = this.c;
            qc.f.c(i20, i10, this.d, objArr3, objArr3);
        }
        this.b[i10] = j10;
        this.c[i10] = obj;
        this.d++;
    }

    public final void l(long j10) {
        int b10 = b0.a.b(this.b, this.d, j10);
        if (b10 >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[b10];
            Object obj2 = i.a;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.a = true;
            }
        }
    }

    public final int m() {
        if (this.a) {
            int i10 = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != i.a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.a = false;
            this.d = i11;
        }
        return this.d;
    }

    public final Object n(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.d)) {
            throw new IllegalArgumentException(i0.a.k(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != i.a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.a = false;
            this.d = i12;
        }
        return this.c[i10];
    }

    public final String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.d * 28);
        sb2.append('{');
        int i10 = this.d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i11));
            sb2.append('=');
            Object n10 = n(i11);
            if (n10 != sb2) {
                sb2.append(n10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public h() {
        this(10);
    }
}
