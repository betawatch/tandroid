package a0;

import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l implements Cloneable {
    public /* synthetic */ int[] a;
    public /* synthetic */ Object[] b;
    public /* synthetic */ int c;

    public l() {
        int i9;
        int i10 = 4;
        while (true) {
            i9 = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i9 = i11;
                break;
            }
            i10++;
        }
        int i12 = i9 / 4;
        this.a = new int[i12];
        this.b = new Object[i12];
    }

    public final void a(int i9, Object obj) {
        int i10 = this.c;
        if (i10 != 0 && i9 <= this.a[i10 - 1]) {
            d(i9, obj);
            return;
        }
        if (i10 >= this.a.length) {
            int i11 = (i10 + 1) * 4;
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
            int i14 = i11 / 4;
            int[] copyOf = Arrays.copyOf(this.a, i14);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i14);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
        }
        this.a[i10] = i9;
        this.b[i10] = obj;
        this.c = i10 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.i.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        l lVar = (l) clone;
        lVar.a = (int[]) this.a.clone();
        lVar.b = (Object[]) this.b.clone();
        return lVar;
    }

    public final Object c(int i9) {
        Object obj;
        int a2 = b0.a.a(this.c, i9, this.a);
        if (a2 < 0 || (obj = this.b[a2]) == i.b) {
            return null;
        }
        return obj;
    }

    public final void d(int i9, Object obj) {
        int a2 = b0.a.a(this.c, i9, this.a);
        if (a2 >= 0) {
            this.b[a2] = obj;
            return;
        }
        int i10 = ~a2;
        int i11 = this.c;
        if (i10 < i11) {
            Object[] objArr = this.b;
            if (objArr[i10] == i.b) {
                this.a[i10] = i9;
                objArr[i10] = obj;
                return;
            }
        }
        if (i11 >= this.a.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] copyOf = Arrays.copyOf(this.a, i15);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i15);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
        }
        int i16 = this.c;
        if (i16 - i10 != 0) {
            int[] iArr = this.a;
            int i17 = i10 + 1;
            pc.f.b(i17, i10, i16, iArr, iArr);
            Object[] objArr2 = this.b;
            pc.f.c(i17, i10, this.c, objArr2, objArr2);
        }
        this.a[i10] = i9;
        this.b[i10] = obj;
        this.c++;
    }

    public final String toString() {
        int i9 = this.c;
        if (i9 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i9 * 28);
        sb2.append('{');
        int i10 = this.c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.a[i11]);
            sb2.append('=');
            Object obj = this.b[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.d(sb3, "buffer.toString()");
        return sb3;
    }
}
