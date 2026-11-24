// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class fpb {
    public static final /* synthetic */ long b = fy.a.objectFieldOffset(fpb.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public r54[] a;

    public final void a(r54 r54Var) {
        r54Var.d((s54) this);
        r54[] r54VarArr = this.a;
        if (r54VarArr == null) {
            r54VarArr = new r54[4];
            this.a = r54VarArr;
        } else if (b() >= r54VarArr.length) {
            r54VarArr = (r54[]) Arrays.copyOf(r54VarArr, b() << 1);
            this.a = r54VarArr;
        }
        int b2 = b();
        fy.a.putIntVolatile(this, b, b2 + 1);
        r54VarArr[b2] = r54Var;
        r54Var.b = b2;
        e(b2);
    }

    public final int b() {
        return fy.a.getIntVolatile(this, b);
    }

    public final void c(r54 r54Var) {
        synchronized (this) {
            if (r54Var.b() != null) {
                d(r54Var.b);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r5.compareTo(r6) >= 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r54 d(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        fy.a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            f(i, b());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                r54 r54Var = objArr[i];
                r54Var.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (r54Var.compareTo(obj) < 0) {
                    f(i, i2);
                    e(i2);
                }
            }
            while (true) {
                int i3 = i << 1;
                int i4 = i3 + 1;
                if (i4 >= b()) {
                    break;
                }
                Object[] objArr2 = this.a;
                objArr2.getClass();
                int i5 = i3 + 2;
                if (i5 < b()) {
                    Comparable comparable = objArr2[i5];
                    comparable.getClass();
                    Object obj2 = objArr2[i4];
                    obj2.getClass();
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                comparable2.getClass();
                Comparable comparable3 = objArr2[i5];
                comparable3.getClass();
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                f(i, i5);
                i = i5;
            }
        }
        r54 r54Var2 = objArr[b()];
        r54Var2.getClass();
        r54Var2.d(null);
        r54Var2.b = -1;
        objArr[b()] = null;
        return r54Var2;
    }

    public final void e(int i) {
        while (i > 0) {
            r54[] r54VarArr = this.a;
            r54VarArr.getClass();
            int i2 = (i - 1) / 2;
            r54 r54Var = r54VarArr[i2];
            r54Var.getClass();
            r54 r54Var2 = r54VarArr[i];
            r54Var2.getClass();
            if (r54Var.compareTo(r54Var2) <= 0) {
                return;
            }
            f(i, i2);
            i = i2;
        }
    }

    public final void f(int i, int i2) {
        r54[] r54VarArr = this.a;
        r54VarArr.getClass();
        r54 r54Var = r54VarArr[i2];
        r54Var.getClass();
        r54 r54Var2 = r54VarArr[i];
        r54Var2.getClass();
        r54VarArr[i] = r54Var;
        r54VarArr[i2] = r54Var2;
        r54Var.b = i;
        r54Var2.b = i2;
    }
}
