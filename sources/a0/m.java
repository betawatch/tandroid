package a0;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m implements Cloneable {
    public /* synthetic */ int[] a;
    public /* synthetic */ Object[] b;
    public /* synthetic */ int c;

    public m() {
        int i3;
        int i10 = 4;
        while (true) {
            i3 = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i3 = i11;
                break;
            }
            i10++;
        }
        int i12 = i3 / 4;
        this.a = new int[i12];
        this.b = new Object[i12];
    }

    public final void a(int i3, Object obj) {
        int i10 = this.c;
        if (i10 != 0 && i3 <= this.a[i10 - 1]) {
            d(i3, obj);
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
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i14);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
        }
        this.a[i10] = i3;
        this.b[i10] = obj;
        this.c = i10 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.j.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        m mVar = (m) clone;
        mVar.a = (int[]) this.a.clone();
        mVar.b = (Object[]) this.b.clone();
        return mVar;
    }

    public final Object c(int i3) {
        Object obj;
        int a10 = b0.a.a(this.c, i3, this.a);
        if (a10 < 0 || (obj = this.b[a10]) == i.b) {
            return null;
        }
        return obj;
    }

    public final void d(int i3, Object obj) {
        int a10 = b0.a.a(this.c, i3, this.a);
        if (a10 >= 0) {
            this.b[a10] = obj;
            return;
        }
        int i10 = ~a10;
        int i11 = this.c;
        if (i10 < i11) {
            Object[] objArr = this.b;
            if (objArr[i10] == i.b) {
                this.a[i10] = i3;
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
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i15);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
        }
        int i16 = this.c;
        if (i16 - i10 != 0) {
            int[] iArr = this.a;
            int i17 = i10 + 1;
            ed.f.b(i17, i10, i16, iArr, iArr);
            Object[] objArr2 = this.b;
            ed.f.c(i17, i10, this.c, objArr2, objArr2);
        }
        this.a[i10] = i3;
        this.b[i10] = obj;
        this.c++;
    }

    public final String toString() {
        int i3 = this.c;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i3 * 28);
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
        kotlin.jvm.internal.j.d(sb3, "buffer.toString()");
        return sb3;
    }
}
