package a0;

import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l implements Cloneable {
    public /* synthetic */ int[] a;
    public /* synthetic */ Object[] b;
    public /* synthetic */ int c;

    public l() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.a = new int[i13];
        this.b = new Object[i13];
    }

    public final void a(int i10, Object obj) {
        int i11 = this.c;
        if (i11 != 0 && i10 <= this.a[i11 - 1]) {
            d(i10, obj);
            return;
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
        this.a[i11] = i10;
        this.b[i11] = obj;
        this.c = i11 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.j.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        l lVar = (l) clone;
        lVar.a = (int[]) this.a.clone();
        lVar.b = (Object[]) this.b.clone();
        return lVar;
    }

    public final Object c(int i10) {
        Object obj;
        int a2 = b0.a.a(this.c, i10, this.a);
        if (a2 < 0 || (obj = this.b[a2]) == i.b) {
            return null;
        }
        return obj;
    }

    public final void d(int i10, Object obj) {
        int a2 = b0.a.a(this.c, i10, this.a);
        if (a2 >= 0) {
            this.b[a2] = obj;
            return;
        }
        int i11 = ~a2;
        int i12 = this.c;
        if (i11 < i12) {
            Object[] objArr = this.b;
            if (objArr[i11] == i.b) {
                this.a[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (i12 >= this.a.length) {
            int i13 = (i12 + 1) * 4;
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
            int i16 = i13 / 4;
            int[] copyOf = Arrays.copyOf(this.a, i16);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i16);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
        }
        int i17 = this.c;
        if (i17 - i11 != 0) {
            int[] iArr = this.a;
            int i18 = i11 + 1;
            tc.f.b(i18, i11, i17, iArr, iArr);
            Object[] objArr2 = this.b;
            tc.f.c(i18, i11, this.c, objArr2, objArr2);
        }
        this.a[i11] = i10;
        this.b[i11] = obj;
        this.c++;
    }

    public final String toString() {
        int i10 = this.c;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i10 * 28);
        sb.append('{');
        int i11 = this.c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb.append(", ");
            }
            sb.append(this.a[i12]);
            sb.append('=');
            Object obj = this.b[i12];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "buffer.toString()");
        return sb2;
    }
}
