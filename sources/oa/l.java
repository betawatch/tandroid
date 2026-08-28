package oa;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends ta.a {
    public static final k E = new k();
    public static final Object F = new Object();
    public Object[] A;
    public int B;
    public String[] C;
    public int[] D;

    @Override // ta.a
    public final void C() {
        int b10 = m1.j.b(x());
        if (b10 == 1) {
            e();
            return;
        }
        if (b10 != 9) {
            if (b10 == 3) {
                f();
                return;
            }
            if (b10 == 4) {
                I(true);
                return;
            }
            K();
            int i9 = this.B;
            if (i9 > 0) {
                int[] iArr = this.D;
                int i10 = i9 - 1;
                iArr[i10] = iArr[i10] + 1;
            }
        }
    }

    public final void F(int i9) {
        if (x() == i9) {
            return;
        }
        throw new IllegalStateException("Expected " + ta.b.k(i9) + " but was " + ta.b.k(x()) + H());
    }

    public final String G(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i9 = 0;
        while (true) {
            int i10 = this.B;
            if (i9 >= i10) {
                return sb2.toString();
            }
            Object[] objArr = this.A;
            Object obj = objArr[i9];
            if (obj instanceof la.h) {
                i9++;
                if (i9 < i10 && (objArr[i9] instanceof Iterator)) {
                    int i11 = this.D[i9];
                    if (z10 && i11 > 0 && (i9 == i10 - 1 || i9 == i10 - 2)) {
                        i11--;
                    }
                    sb2.append('[');
                    sb2.append(i11);
                    sb2.append(']');
                }
            } else if ((obj instanceof la.l) && (i9 = i9 + 1) < i10 && (objArr[i9] instanceof Iterator)) {
                sb2.append('.');
                String str = this.C[i9];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i9++;
        }
    }

    public final String H() {
        return " at path " + G(false);
    }

    public final String I(boolean z10) {
        F(5);
        Map.Entry entry = (Map.Entry) ((Iterator) J()).next();
        String str = (String) entry.getKey();
        this.C[this.B - 1] = z10 ? "<skipped>" : str;
        L(entry.getValue());
        return str;
    }

    public final Object J() {
        return this.A[this.B - 1];
    }

    public final Object K() {
        Object[] objArr = this.A;
        int i9 = this.B - 1;
        this.B = i9;
        Object obj = objArr[i9];
        objArr[i9] = null;
        return obj;
    }

    public final void L(Object obj) {
        int i9 = this.B;
        Object[] objArr = this.A;
        if (i9 == objArr.length) {
            int i10 = i9 * 2;
            this.A = Arrays.copyOf(objArr, i10);
            this.D = Arrays.copyOf(this.D, i10);
            this.C = (String[]) Arrays.copyOf(this.C, i10);
        }
        Object[] objArr2 = this.A;
        int i11 = this.B;
        this.B = i11 + 1;
        objArr2[i11] = obj;
    }

    @Override // ta.a
    public final void a() {
        F(1);
        L(((la.h) J()).a.iterator());
        this.D[this.B - 1] = 0;
    }

    @Override // ta.a
    public final void b() {
        F(3);
        L(((na.k) ((la.l) J()).a.entrySet()).iterator());
    }

    @Override // ta.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A = new Object[]{F};
        this.B = 1;
    }

    @Override // ta.a
    public final void e() {
        F(2);
        K();
        K();
        int i9 = this.B;
        if (i9 > 0) {
            int[] iArr = this.D;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // ta.a
    public final void f() {
        F(4);
        this.C[this.B - 1] = null;
        K();
        K();
        int i9 = this.B;
        if (i9 > 0) {
            int[] iArr = this.D;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // ta.a
    public final String h() {
        return G(false);
    }

    @Override // ta.a
    public final String j() {
        return G(true);
    }

    @Override // ta.a
    public final boolean k() {
        int x10 = x();
        return (x10 == 4 || x10 == 2 || x10 == 10) ? false : true;
    }

    @Override // ta.a
    public final boolean n() {
        F(8);
        boolean p6 = ((la.m) K()).p();
        int i9 = this.B;
        if (i9 > 0) {
            int[] iArr = this.D;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return p6;
    }

    @Override // ta.a
    public final double o() {
        int x10 = x();
        if (x10 != 7 && x10 != 6) {
            throw new IllegalStateException("Expected " + ta.b.k(7) + " but was " + ta.b.k(x10) + H());
        }
        double q10 = ((la.m) J()).q();
        if (Double.isNaN(q10) || Double.isInfinite(q10)) {
            throw new ta.d("JSON forbids NaN and infinities: " + q10);
        }
        K();
        int i9 = this.B;
        if (i9 > 0) {
            int[] iArr = this.D;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return q10;
    }

    @Override // ta.a
    public final int p() {
        int x10 = x();
        if (x10 != 7 && x10 != 6) {
            throw new IllegalStateException("Expected " + ta.b.k(7) + " but was " + ta.b.k(x10) + H());
        }
        la.m mVar = (la.m) J();
        int intValue = mVar.a instanceof Number ? mVar.r().intValue() : Integer.parseInt(mVar.n());
        K();
        int i9 = this.B;
        if (i9 > 0) {
            int[] iArr = this.D;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return intValue;
    }

    @Override // ta.a
    public final long q() {
        int x10 = x();
        if (x10 != 7 && x10 != 6) {
            throw new IllegalStateException("Expected " + ta.b.k(7) + " but was " + ta.b.k(x10) + H());
        }
        la.m mVar = (la.m) J();
        long longValue = mVar.a instanceof Number ? mVar.r().longValue() : Long.parseLong(mVar.n());
        K();
        int i9 = this.B;
        if (i9 > 0) {
            int[] iArr = this.D;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return longValue;
    }

    @Override // ta.a
    public final String r() {
        return I(false);
    }

    @Override // ta.a
    public final void t() {
        F(9);
        K();
        int i9 = this.B;
        if (i9 > 0) {
            int[] iArr = this.D;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // ta.a
    public final String toString() {
        return l.class.getSimpleName() + H();
    }

    @Override // ta.a
    public final String v() {
        int x10 = x();
        if (x10 != 6 && x10 != 7) {
            throw new IllegalStateException("Expected " + ta.b.k(6) + " but was " + ta.b.k(x10) + H());
        }
        String n10 = ((la.m) K()).n();
        int i9 = this.B;
        if (i9 > 0) {
            int[] iArr = this.D;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return n10;
    }

    @Override // ta.a
    public final int x() {
        if (this.B == 0) {
            return 10;
        }
        Object J = J();
        if (J instanceof Iterator) {
            boolean z10 = this.A[this.B - 2] instanceof la.l;
            Iterator it = (Iterator) J;
            if (!it.hasNext()) {
                return z10 ? 4 : 2;
            }
            if (z10) {
                return 5;
            }
            L(it.next());
            return x();
        }
        if (J instanceof la.l) {
            return 3;
        }
        if (J instanceof la.h) {
            return 1;
        }
        if (J instanceof la.m) {
            Serializable serializable = ((la.m) J).a;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (J instanceof la.k) {
            return 9;
        }
        if (J == F) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new ta.d("Custom JsonElement subclass " + J.getClass().getName() + " is not supported");
    }
}
