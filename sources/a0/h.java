package a0;

import j3.r0;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public h(int i9) {
        if (i9 == 0) {
            this.b = b0.a.b;
            this.c = b0.a.c;
            return;
        }
        int i10 = i9 * 8;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.b = new long[i13];
        this.c = new Object[i13];
    }

    public final void a(Long l10, long j10) {
        int i9 = this.d;
        if (i9 != 0 && j10 <= this.b[i9 - 1]) {
            k(l10, j10);
            return;
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i9 >= jArr.length) {
                Object[] objArr = this.c;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj = objArr[i11];
                    if (obj != i.a) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.a = false;
                this.d = i10;
            }
        }
        int i12 = this.d;
        if (i12 >= this.b.length) {
            int i13 = (i12 + 1) * 8;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 8;
            long[] copyOf = Arrays.copyOf(this.b, i16);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, i16);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.c = copyOf2;
        }
        this.b[i12] = j10;
        this.c[i12] = l10;
        this.d = i12 + 1;
    }

    public final void b() {
        int i9 = this.d;
        Object[] objArr = this.c;
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = null;
        }
        this.d = 0;
        this.a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final h clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.i.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
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
            int i9 = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != i.a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.a = false;
            this.d = i10;
        }
        return b0.a.b(this.b, this.d, j10);
    }

    public final boolean i() {
        return m() == 0;
    }

    public final long j(int i9) {
        int i10;
        if (i9 < 0 || i9 >= (i10 = this.d)) {
            throw new IllegalArgumentException(r0.l(i9, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.a) {
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
        return this.b[i9];
    }

    public final void k(Object obj, long j10) {
        Object obj2 = i.a;
        int b10 = b0.a.b(this.b, this.d, j10);
        if (b10 >= 0) {
            this.c[b10] = obj;
            return;
        }
        int i9 = ~b10;
        int i10 = this.d;
        if (i9 < i10) {
            Object[] objArr = this.c;
            if (objArr[i9] == obj2) {
                this.b[i9] = j10;
                objArr[i9] = obj;
                return;
            }
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.a = false;
                this.d = i11;
                i9 = ~b0.a.b(this.b, i11, j10);
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
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, i17);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.c = copyOf2;
        }
        int i18 = this.d - i9;
        if (i18 != 0) {
            long[] jArr2 = this.b;
            int i19 = i9 + 1;
            kotlin.jvm.internal.i.e(jArr2, "<this>");
            System.arraycopy(jArr2, i9, jArr2, i19, i18);
            Object[] objArr3 = this.c;
            pc.f.c(i19, i9, this.d, objArr3, objArr3);
        }
        this.b[i9] = j10;
        this.c[i9] = obj;
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
            int i9 = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != i.a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.a = false;
            this.d = i10;
        }
        return this.d;
    }

    public final Object n(int i9) {
        int i10;
        if (i9 < 0 || i9 >= (i10 = this.d)) {
            throw new IllegalArgumentException(r0.l(i9, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.a) {
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
        return this.c[i9];
    }

    public final String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.d * 28);
        sb2.append('{');
        int i9 = this.d;
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i10));
            sb2.append('=');
            Object n10 = n(i10);
            if (n10 != sb2) {
                sb2.append(n10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public h() {
        this(10);
    }
}
